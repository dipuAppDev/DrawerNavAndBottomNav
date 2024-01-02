package com.example.drawernavandbottomnav

import android.os.Bundle
import android.text.Editable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.drawernavandbottomnav.databinding.FragmentGramToKgBinding


class GramToKgFragment : Fragment() {


private lateinit var binding:FragmentGramToKgBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGramToKgBinding.inflate(layoutInflater)

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

        }

        binding.gramTKgConvertBtn.setOnClickListener {
            var gram = binding.gramTKgUnit.text.toString()
            var kg = gram.toDouble()/1000
            binding.gramToKgResult.text = kg.toString()
        }


        return binding.root
    }


}