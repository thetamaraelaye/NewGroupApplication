package com.example.newgroupapplication.views.auth.SignUp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.newgroupapplication.databinding.FragmentSignUpAddressBinding


class SignUpAddressFragment : Fragment() {
    private lateinit var binding: FragmentSignUpAddressBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSignUpAddressBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        doAddress()
    }

    private fun doAddress(){
        binding.AddressBackbtn.setOnClickListener {
            findNavController().popBackStack()
        }

    }

}