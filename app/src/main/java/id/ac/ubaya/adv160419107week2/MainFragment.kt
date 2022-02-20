package id.ac.ubaya.adv160419107week2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_main.*
import kotlin.random.Random


class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonStart.setOnClickListener {
            // Ambil nama pemain
            val playerName = editName.text.toString()
            // Dapatkan action yang ingin dijalankan
//            val action = MainFragmentDirections.actionGameFragment(playerName)
//            // Jalankan action tersebut
//            Navigation.findNavController(it).navigate(action)
        }


//        --Random
        val randomNumber1  = Random.nextInt(0,50)
        val randomNumber2 = Random.nextInt(0,30)
//      -- Ditampilkan
        num1.text= randomNumber1.toString()
        num2.text = randomNumber2.toString()

        var skor =0
        buttonSubmit.setOnClickListener {

            val total :Int= num1.text.toString().toInt() +num2.text.toString().toInt()

            val jawab =inputAnswer.text.toString().toInt()

            if(jawab == total){

                skor += 1
                textScore.text= skor.toString()
                val randomNumber1  = Random.nextInt(0,50)
                val randomNumber2 = Random.nextInt(0,30)
                num1.text= randomNumber1.toString()
                num2.text = randomNumber2.toString()
                inputAnswer.setText("")
            }
            else{

                // Dapatkan action yang ingin dijalankan
            val action = MainFragmentDirections.actionMainFragmentToGameFragment(skor)
//            // Jalankan action tersebut
            Navigation.findNavController(it).navigate(action)
            }


        }

    }


}