package com.example.drawernavandbottomnav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.drawernavandbottomnav.databinding.FragmentPoundsToKgBinding

class PoundsToKgFragment : Fragment() {
    private lateinit var binding:FragmentPoundsToKgBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPoundsToKgBinding.inflate(layoutInflater)
        binding.apply {
            meterToKilo.setOnClickListener {
                findNavController().navigate(R.id.meterToKiloFragment)
            }
            meterToFeet.setOnClickListener {
                findNavController().navigate(R.id.meterToFeetFragment)
            }
            celToKel.setOnClickListener {
                findNavController().navigate(R.id.celciusToKelvinFragment)
            }
            gramToKg.setOnClickListener {
                findNavController().navigate(R.id.gramToKgFragment)
            }

        }
        binding.poundTKgConvertBtn.setOnClickListener {
            var pounds = binding.pounToKgUnit.text.toString()
            var kg = pounds.toDouble()*0.4536
            binding.poundsToKgResult.text = kg.toString()
        }



        return binding.root
    }


}