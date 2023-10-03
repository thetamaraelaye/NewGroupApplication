package com.example.newgroupapplication.views.auth.resetpassword

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.newgroupapplication.R
import com.example.newgroupapplication.databinding.FragmentPhoneNumberBinding


class PhoneNumberFragment : Fragment() {

    private lateinit var binding: FragmentPhoneNumberBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPhoneNumberBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        doResetStepOne()
    }

    private fun doResetStepOne(){
        //navigate to previous screen
        binding.imageView5.setOnClickListener{
            findNavController().popBackStack()
        }
        //navigate to next screen on buttonm click
        binding.sendotpbutton.setOnClickListener {
            findNavController().navigate(R.id.action_phoneNumberFragment_to_OTPFragment)
        }

    }


}