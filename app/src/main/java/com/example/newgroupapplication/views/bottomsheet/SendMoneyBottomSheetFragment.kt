package com.example.newgroupapplication.views.bottomsheet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newgroupapplication.R
import com.example.newgroupapplication.databinding.FragmentSendMoneyBottomSheetBinding
import com.example.newgroupapplication.network.SingleLiveEvent
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class SendMoneyBottomSheetFragment : BottomSheetDialogFragment() {
    private lateinit var binding: FragmentSendMoneyBottomSheetBinding
data class SendMoneyItem(
    val SendMoneyHeader: String,
    val SendMoneyImage: Int,
    val SendMoneyType: SendMoneyType

)
    private val onItemSelected = SingleLiveEvent <SendMoneyItem>()
    private val sendMoneyList: List<SendMoneyItem> by lazy { listOf(
        SendMoneyItem(
            "Send to Own Account",
            R.drawable.recycler_logo,
            SendMoneyType.OWNACCOUNT
        ),
        SendMoneyItem(
            "Send to a Univaciti account",
            R.drawable.recycler_logo,
            SendMoneyType.UNIVACITIACCOUNT
        ),
        SendMoneyItem(
            "Send to other accounts",
            R.drawable.frame_34328__1_,
            SendMoneyType.OTHERACCOUNT
        ))}
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSendMoneyBottomSheetBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun getTheme(): Int {
        return R.style.CustomBottomSheetDialog
        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        updateUi()
        setObserver()
    }

    private fun updateUi(){
        binding.sendMoneyRecycler.layoutManager = LinearLayoutManager(requireContext())
        binding.sendMoneyRecycler.adapter = SendMoneyAdapter(sendMoneyList, onItemSelected)
    }

    private fun setObserver() {
        onItemSelected.observe(viewLifecycleOwner){
            when(it.SendMoneyType){
                SendMoneyType.OWNACCOUNT -> ownaccount()
                SendMoneyType.UNIVACITIACCOUNT -> univacitiaccount()
                SendMoneyType.OTHERACCOUNT -> otheraccount()
            }
        }
    }

    private fun otheraccount() {
        //navigation to other account fragment
        dismiss()
    }

    private fun ownaccount(){
        //navigation to own account fragment
        binding.root.setOnClickListener{
        findNavController().navigate(R.id.action_homeFragment_to_homeSendMoneyFragment)}
        dismiss()
    }

    private fun univacitiaccount(){
        //navigation to univaciti account fragment
       binding.sendMoneyRecycler.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_sendMoneyUnivacitiFragment)

        dismiss()
    }



}

enum class SendMoneyType{
    OWNACCOUNT,
    UNIVACITIACCOUNT,
    OTHERACCOUNT
}
}