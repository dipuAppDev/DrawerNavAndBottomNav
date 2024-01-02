package com.example.drawernavandbottomnav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.drawernavandbottomnav.databinding.FragmentAgeBinding


class AgeFragment : Fragment() {
private lateinit var binding:FragmentAgeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAgeBinding.inflate(layoutInflater)


      binding.calculateBtn.setOnClickListener {


          var age =  binding.ageInMinutesET.text.toString()

          if (age.isEmpty()){
              Toast.makeText(requireContext(), "Please enter your age", Toast.LENGTH_SHORT).show()
          }
          else{
              var year = age.toInt()*365*1440
              binding.resultBirthT.text = year.toString()
          }
      }


        return binding.root
    }


}