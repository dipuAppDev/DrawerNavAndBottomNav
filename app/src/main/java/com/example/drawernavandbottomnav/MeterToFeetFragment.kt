package com.example.drawernavandbottomnav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.drawernavandbottomnav.databinding.FragmentMeterToFeetBinding

class MeterToFeetFragment : Fragment() {
  private lateinit var binding:FragmentMeterToFeetBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMeterToFeetBinding.inflate(layoutInflater)
        binding.apply {
            meterToKilo.setOnClickListener {
                findNavController().navigate(R.id.meterToKiloFragment)
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

        binding.mTFConvertBtn.setOnClickListener {
            var meter = binding.meterTFeetUnit.text.toString()
            var feet = meter.toDouble()*3.28084
            binding.mToFResult.text = feet.toString()
        }
        return binding.root
    }


}