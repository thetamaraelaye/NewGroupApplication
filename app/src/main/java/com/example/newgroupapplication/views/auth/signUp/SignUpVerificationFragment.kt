package com.example.newgroupapplication.views.auth.signUp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.newgroupapplication.R
import com.example.newgroupapplication.databinding.FragmentSignUpVerificationBinding

class SignUpVerificationFragment : Fragment() {

    private lateinit var binding: FragmentSignUpVerificationBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentSignUpVerificationBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        handleSignUpVerification()
    }

    private fun handleSignUpVerification(){

        binding.imageView15.setOnClickListener{
            findNavController().popBackStack()
        }

        //navigate to signup phone verification screen
        binding.button5.setOnClickListener {
            findNavController().navigate(R.id.action_signUpVerificationFragment_to_signUpSetPasswordFragment)
        }
    }

}