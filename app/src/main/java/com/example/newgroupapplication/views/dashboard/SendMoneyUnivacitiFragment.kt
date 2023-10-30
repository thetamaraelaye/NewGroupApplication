package com.example.newgroupapplication.views.dashboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

import com.example.newgroupapplication.databinding.FragmentSendMoneyUnivacitiBinding


class SendMoneyUnivacitiFragment : Fragment() {

    private lateinit var  binding: FragmentSendMoneyUnivacitiBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSendMoneyUnivacitiBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        sendMoneyUnivaciti()
    }

    private fun sendMoneyUnivaciti (){
        binding.goBackIcon.setOnClickListener{
            findNavController().popBackStack()
        }

        //navigate to reset password page one
//        binding.proceedunivaciti.setOnClickListener {
//            findNavController().navigate(R.id.action_)
//        }
    }
}