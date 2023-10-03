package com.example.newgroupapplication.views.auth.resetpassword

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.newgroupapplication.databinding.FragmentCreatePasswordBinding

class CreatePasswordFragment : Fragment() {

    private lateinit var binding: FragmentCreatePasswordBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCreatePasswordBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        handleCreatePassword()
    }

    private fun handleCreatePassword (){
        binding.backArrow.setOnClickListener{
            findNavController().popBackStack()
        }
}

}