package com.example.newgroupapplication.views.dashboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.newgroupapplication.R
import com.example.newgroupapplication.databinding.FragmentHomeSendMoneyBinding

class HomeSendMoneyFragment : Fragment() {
    private lateinit var binding: FragmentHomeSendMoneyBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeSendMoneyBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        doSendMoney()
    }
    private fun doSendMoney() {
    binding.imageView25.setOnClickListener{
        findNavController().popBackStack()
    }
        
    }
}