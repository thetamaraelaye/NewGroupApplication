package com.example.newgroupapplication.views.auth.SignUp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.newgroupapplication.databinding.FragmentAccountSuccessBinding

class AccountSuccessFragment : Fragment() {

    private lateinit var binding: FragmentAccountSuccessBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAccountSuccessBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        handleAccountSuccess()
    }

    private fun handleAccountSuccess() {

    }

}