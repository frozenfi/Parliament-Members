package com.example.parliamentapplication.adapter

/*
* Name: Binod Panta
* Student No: 2012206
* Date: 04.10.2022
*/
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.parliamentapplication.databinding.PartyListItemBinding

class PartyAdapter(private val clickListener: PartyClickListener) :
    ListAdapter<String, PartyAdapter.ViewHolder>(
        PartyDiffCallBack()
    ) {
    class ViewHolder private constructor(private val binding: PartyListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        //item:Party
        fun bind(item: String, clickListener: PartyClickListener) {
            binding.party = item
            binding.clickListener = clickListener
            binding.executePendingBindings()

        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = PartyListItemBinding.inflate(layoutInflater, parent, false)
                return ViewHolder(binding)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position), clickListener)
    }
}

//Default class that come along when ListAdapter is used
//Use DiffCallBack to update the changes in the list
class PartyDiffCallBack : DiffUtil.ItemCallback<String>() {
    override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }
}

class PartyClickListener(val clickListener: (party: String) -> Unit) {
    fun onClick(party: String) = clickListener(party)
}