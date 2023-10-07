package com.example.newgroupapplication.views.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.newgroupapplication.R
import com.example.newgroupapplication.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        doLogin()
    }

    private fun doLogin() {
        binding.backArrow.setOnClickListener{
            findNavController().popBackStack()
        }

        //navigate to reset password page one
        binding.forgotpw.setOnClickListener {
            findNavController().navigate(R.id.sendMoneyBottomSheetFragment)
        }
    }

}