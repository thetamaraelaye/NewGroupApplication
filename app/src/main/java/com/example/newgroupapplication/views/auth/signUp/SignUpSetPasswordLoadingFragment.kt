package com.example.newgroupapplication.views.auth.signUp

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.newgroupapplication.R
import com.example.newgroupapplication.databinding.FragmentSignUpSetPasswordLoadingBinding

class SignUpSetPasswordLoadingFragment : Fragment() {

    private lateinit var binding: FragmentSignUpSetPasswordLoadingBinding
    var handler: Handler? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignUpSetPasswordLoadingBinding.inflate(layoutInflater)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        handleSetPasswordLoading()
    }

    private fun handleSetPasswordLoading() {
        handler = Handler()
        handler!!.postDelayed({
            findNavController().navigate(R.id.action_signUpSetPasswordLoadingFragment_to_accountSuccessFragment)
        }, 2000)
    }

}