package com.example.drawernavandbottomnav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.drawernavandbottomnav.databinding.FragmentUnitBinding

class UnitFragment : Fragment() {
  private lateinit var binding:FragmentUnitBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentUnitBinding.inflate(layoutInflater)


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
            poundsToKg.setOnClickListener {
                findNavController().navigate(R.id.poundsToKgFragment)
            }
            gramToKg.setOnClickListener {
                findNavController().navigate(R.id.gramToKgFragment)
            }

        }


        return binding.root
    }


}