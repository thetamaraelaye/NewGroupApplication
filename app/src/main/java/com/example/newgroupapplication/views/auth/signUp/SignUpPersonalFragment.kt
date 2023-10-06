package com.example.newgroupapplication.views.auth.signUp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.newgroupapplication.R
import com.example.newgroupapplication.databinding.FragmentSignUpPersonalBinding


class SignUpPersonalFragment : Fragment() {

    private lateinit var binding: FragmentSignUpPersonalBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentSignUpPersonalBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        doSignUpPersonal()
    }

    private fun doSignUpPersonal(){
        //controls navigation to previous page
        binding.imageView5.setOnClickListener{
            findNavController().popBackStack()
        }

        //navigate to signup address screen
        binding.button2.setOnClickListener {
            findNavController().navigate(R.id.action_signUpPersonalFragment_to_signUpAddressFragment)
        }


    }


}