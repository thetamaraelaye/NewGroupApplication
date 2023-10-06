package com.example.newgroupapplication.views.auth.signUp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.newgroupapplication.R
import com.example.newgroupapplication.databinding.FragmentSignUpSetPasswordBinding

class SignUpSetPasswordFragment : Fragment() {

    private lateinit var binding: FragmentSignUpSetPasswordBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentSignUpSetPasswordBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        handleSetPassword()
    }

    private fun handleSetPassword() {
        //navigate to prev screen
        binding.imageView18.setOnClickListener{
            findNavController().popBackStack()
        }

        //navigate to password loading fragment
        binding.button6.setOnClickListener {
            findNavController().navigate(R.id.action_signUpSetPasswordFragment_to_signUpSetPasswordLoadingFragment)
        }
    }

}