package com.example.newgroupapplication.views.auth.resetpassword

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.newgroupapplication.R
import com.example.newgroupapplication.databinding.FragmentOTPBinding

class OTPFragment : Fragment() {

    private lateinit var  binding : FragmentOTPBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentOTPBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        handleOTP()
    }

    private fun handleOTP() {
        binding.imageView12.setOnClickListener{
            findNavController().popBackStack()
        }

        //navigate to next screen on buttonm click
        binding.verifybutton.setOnClickListener {
            findNavController().navigate(R.id.action_OTPFragment_to_createPasswordFragment)
        }

    }

}