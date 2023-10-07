package com.example.newgroupapplication.views.bottomsheet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newgroupapplication.R
import com.example.newgroupapplication.databinding.FragmentSendMoneyBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class SendMoneyBottomSheetFragment : BottomSheetDialogFragment() {
    private lateinit var binding: FragmentSendMoneyBottomSheetBinding
data class SendMoneyItem(
    val SendMoneyHeader: String
)
    private val sendMoneyList: List<SendMoneyItem> by lazy { listOf(
        SendMoneyItem(
            "Send to Own Account",
        ),
        SendMoneyItem(
            "Send to a Univaciti account",
        ),
        SendMoneyItem(
            "Send to other accounts",
        ))}
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSendMoneyBottomSheetBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        updateUi()
    }

    private fun updateUi(){
        binding.sendMoneyRecycler.layoutManager = LinearLayoutManager(requireContext())
        binding.sendMoneyRecycler.adapter = SendMoneyAdapter(sendMoneyList)
    }

}