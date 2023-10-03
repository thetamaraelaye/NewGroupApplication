package com.example.newgroupapplication.views.auth.SignUp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.newgroupapplication.databinding.FragmentSignUpBankBinding


class SignUpBankFragment : Fragment() {

    private lateinit var binding : FragmentSignUpBankBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignUpBankBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        doSignUpBank()
    }

    private fun doSignUpBank (){
        binding.imageView6.setOnClickListener{
            findNavController().popBackStack()
        }




    }

}