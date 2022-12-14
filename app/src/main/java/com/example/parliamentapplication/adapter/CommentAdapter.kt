package com.example.parliamentapplication.adapter

/*
* Name: Binod Panta
* Student No: 2012206
* Date: 07.10.2022
*/
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.parliamentapplication.databinding.CommentItemBinding

class CommentAdapter : ListAdapter<String, CommentAdapter.ViewHolder>(CommentDiffCallback()) {

    class ViewHolder private constructor(val binding: CommentItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: String) {
            binding.commentItem.text = item
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = CommentItemBinding.inflate(layoutInflater, parent, false)
                return ViewHolder(binding)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

}

//Default class that come along when ListAdapter is used
//Use DiffCallBack to update the changes in the list
class CommentDiffCallback : DiffUtil.ItemCallback<String>() {

    override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }

}


