package id.ac.ubaya.adv160419107week2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_game.*
import kotlinx.android.synthetic.main.fragment_main.*

class GameFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_game, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
//            val playerName = GameFragmentArgs.fromBundle(requireArguments()).skorAkhir
//            // --Menampilkan di tempat yang sesuai
//            textTurn.text = "$playerName's Turn"

            val skorTerakir  = GameFragmentArgs.fromBundle(requireArguments()).skorAkhir
            // --Menampilkan di tempat yang sesuai
            playerScore.text = "Your score is $skorTerakir"
        }
        buttonBack.setOnClickListener {
//            val action= GameFragmentDirections.actionMainFragment()
//            Navigation.findNavController(it).navigate(action)
            val action= GameFragmentDirections.actionGameFragmentToMainFragment()
            Navigation.findNavController(it).navigate(action)


        }


    }


}