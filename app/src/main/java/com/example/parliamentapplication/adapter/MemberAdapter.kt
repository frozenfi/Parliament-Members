package com.example.parliamentapplication.adapter

/*
* Name: Binod Panta
* Student No: 2012206
* Date: 06.10.2022
*/
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.parliamentapplication.ParliamentMembers
import com.example.parliamentapplication.databinding.MemberListItemBinding

class MemberAdapter(private val clickListener: MemberClickListener) :
    ListAdapter<ParliamentMembers, MemberAdapter.ViewHolder>(
        MemberDiffCallBack()
    ) {
    class ViewHolder private constructor(private val binding: MemberListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: ParliamentMembers, clickListener: MemberClickListener) {
            binding.member = item
            binding.clickListener = clickListener
            binding.executePendingBindings()


            binding.memberName.text = item.fullName
            binding.memberDesignation.text = if (item.minister) "Minister" else "Parliament Member"

        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = MemberListItemBinding.inflate(layoutInflater, parent, false)
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

class MemberDiffCallBack : DiffUtil.ItemCallback<ParliamentMembers>() {
    override fun areItemsTheSame(oldItem: ParliamentMembers, newItem: ParliamentMembers): Boolean {
        return oldItem.personNumber == newItem.personNumber
    }

    override fun areContentsTheSame(
        oldItem: ParliamentMembers,
        newItem: ParliamentMembers
    ): Boolean {
        return oldItem == newItem
    }

}

class MemberClickListener(val clickListener: (personNumber: Int) -> Unit) {
    fun onClick(members: ParliamentMembers) = clickListener(members.personNumber)
}