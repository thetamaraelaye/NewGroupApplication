package com.example.newgroupapplication.views.auth.signUp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.newgroupapplication.R
import com.example.newgroupapplication.databinding.FragmentSignUpAddressBinding


class SignUpAddressFragment : Fragment() {
    //initialise binding on the fragment
    private lateinit var binding: FragmentSignUpAddressBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignUpAddressBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        doAddress()
    }

    private fun doAddress(){
        //navigation to previous page
        binding.AddressBackbtn.setOnClickListener {
            findNavController().popBackStack()
        }
        //navigate to signup bank screen
        binding.button.setOnClickListener {
            findNavController().navigate(R.id.action_signUpAddressFragment_to_signUpBankFragment)
        }


    }

}