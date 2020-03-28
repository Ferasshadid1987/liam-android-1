package com.ahmedtikiwa.liam.ui.store

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.ahmedtikiwa.liam.R
import com.ahmedtikiwa.liam.databinding.StoreListItemBinding
import com.ahmedtikiwa.liam.domain.StoreItem

class StoreListAdapter(val listener: StoreListItemAdapterListener) :
    RecyclerView.Adapter<StoreListAdapter.ViewHolder>() {

    var storeItems: List<StoreItem> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val withDataBinding : StoreListItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            ViewHolder.LAYOUT,
            parent,
            false
        )
        return ViewHolder(withDataBinding)
    }

    override fun getItemCount(): Int  = storeItems.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.viewDataBinding.also {
            it.storeIem = storeItems[position]
            it.listener = listener
        }
    }

    class StoreListItemAdapterListener(val block: (StoreItem) -> Unit) {
        fun onClick(storeItem: StoreItem) = block(storeItem)
    }

    class ViewHolder(val viewDataBinding: StoreListItemBinding) :
        RecyclerView.ViewHolder(viewDataBinding.root) {
        companion object {
            @LayoutRes
            val LAYOUT = R.layout.store_list_item
        }
    }

}