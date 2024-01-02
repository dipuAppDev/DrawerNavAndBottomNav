package com.example.drawernavandbottomnav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.drawernavandbottomnav.databinding.FragmentCelciusToKelvinBinding


class CelciusToKelvinFragment : Fragment() {

private lateinit var binding:FragmentCelciusToKelvinBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCelciusToKelvinBinding.inflate(layoutInflater)


        binding.apply {
            meterToKilo.setOnClickListener {
                findNavController().navigate(R.id.meterToKiloFragment)
            }
            meterToFeet.setOnClickListener {
                findNavController().navigate(R.id.meterToFeetFragment)
            }
            poundsToKg.setOnClickListener {
                findNavController().navigate(R.id.poundsToKgFragment)
            }
            gramToKg.setOnClickListener {
                findNavController().navigate(R.id.gramToKgFragment)
            }

        }
        binding.celTKelConvertBtn.setOnClickListener {
            var celsius = binding.CelTKelUnit.text.toString().toDouble()
            var kelvin = celsius + 273.15
            binding.celToKelResult.text = kelvin.toString()
        }








        return binding.root
    }


}