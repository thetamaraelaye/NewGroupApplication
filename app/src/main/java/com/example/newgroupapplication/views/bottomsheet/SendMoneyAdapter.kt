package com.example.newgroupapplication.views.bottomsheet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.newgroupapplication.R
import com.example.newgroupapplication.network.SingleLiveEvent

class SendMoneyAdapter(private val dataList: List<SendMoneyBottomSheetFragment.SendMoneyItem>,
                       private val onItemSelected: SingleLiveEvent<SendMoneyBottomSheetFragment.SendMoneyItem>
) :
    RecyclerView.Adapter<SendMoneyAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val content: TextView = itemView.findViewById(R.id.textViewSendMoney)
        val logo: ImageView = itemView.findViewById(R.id.logo_recycler)
        val root: View = itemView.findViewById(R.id.viewSocialBackground)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val itemView = inflater.inflate(R.layout.item_sendmoney, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = dataList[position]
        holder.content.text = item.SendMoneyHeader
        holder.logo.setImageResource(item.SendMoneyImage)
        holder.root.setOnClickListener {
            onItemSelected.value = item
        }
    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}