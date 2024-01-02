package com.example.drawernavandbottomnav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import com.example.drawernavandbottomnav.databinding.FragmentBMIBinding


class BMIFragment : Fragment() {
private lateinit var binding:FragmentBMIBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBMIBinding.inflate(layoutInflater,container,false)

        binding.calBtn.setOnClickListener {
            val height = binding.heightET.text.toString()
            val weight = binding.weightET.text.toString()


            if (height.isEmpty() && weight.isEmpty()){
                val alertDialog = AlertDialog.Builder(requireActivity())

                alertDialog.setIcon(android.R.drawable.ic_dialog_alert)
                alertDialog.setTitle("BMI Alert !")
                alertDialog.setMessage("Please enter your height and weight.")
                alertDialog.setNeutralButton("Cancel"){dialogInterface,which->
                    dialogInterface.cancel()
                }
                alertDialog.setPositiveButton("Ok"){
                    dialogInterface,which->
                    dialogInterface.dismiss()
                }
                val dialogCreate : AlertDialog = alertDialog.create()
                dialogCreate.show()
                dialogCreate.setCancelable(false)

            }
            else{
                val bmi = weight.toDouble()/((height.toDouble()/100)*(height.toDouble()/100))
                val bmiDigit = String.format("%.2f",bmi).toDouble()
                displayResult(bmiDigit)
            }
            binding.cardResult.visibility = View.VISIBLE
        }








        return binding.root
    }

    private fun displayResult(bmi:Double) {
//        binding.bmiNumber.text = bmi.toString()
//        binding.healthCondition.text = "Healthy"
//        binding.bmiRange.text = "Healthy or Normal BMI range is 18.5-24.5"
        binding.also {
            it.bmiNumber.text = bmi.toString()
            it.healthCondition.text = "Healthy"
            it.bmiRange.text = "Healthy or Normal BMI range is 18.5 - 24.5"
        }


        var result = ""
        var color = 0
        var range = ""



        when{
            bmi<18.5->{
                result = "Underweight"
                color = R.color.underweight
                range = "Underweight BMI range is less than 18.5"
            }
            bmi in 18.5 .. 24.5->{
                result = "Healthy"
                color = R.color.healthy
                range = "Healthy BMI range is 18.5 - 24.5"
            }
            bmi in 24.5 .. 29.9->{
                result = "Overweight"
                color = R.color.overweight
                range = "Overweight BMI range is 24.5 - 29.9"
            }
            bmi >29.9->{
                result = "Obese"
                color = R.color.obese
                range = "Obese BMI range is greater than 29.9"
            }
        }
       binding.apply {
           healthCondition.text = result
           healthCondition.setTextColor(ContextCompat.getColor(requireActivity(),color))
           bmiRange.text = range
           bmiRange.setTextColor(ContextCompat.getColor(requireActivity(),color))
       }

    }


}