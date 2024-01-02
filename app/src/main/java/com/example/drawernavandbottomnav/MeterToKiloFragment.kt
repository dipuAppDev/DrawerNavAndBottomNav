package com.example.drawernavandbottomnav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.drawernavandbottomnav.databinding.FragmentMeterToKiloBinding


class MeterToKiloFragment : Fragment() {
private lateinit var binding:FragmentMeterToKiloBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentMeterToKiloBinding.inflate(layoutInflater)

        binding.apply {

            meterToFeet.setOnClickListener {
                findNavController().navigate(R.id.meterToFeetFragment)
            }
            celToKel.setOnClickListener {
                findNavController().navigate(R.id.celciusToKelvinFragment)
            }
            poundsToKg.setOnClickListener {
                findNavController().navigate(R.id.poundsToKgFragment)
            }
            gramToKg.setOnClickListener {
                findNavController().navigate(R.id.gramToKgFragment)
            }

        }
        binding.mTKConvertBtn.setOnClickListener {
            var meter = binding.meterUnit.text.toString()
            var met = meter.toInt()
            var kilometer = met/1000.toDouble()
            binding.mToKResult.text = kilometer.toString()
        }



        return binding.root
    }
}