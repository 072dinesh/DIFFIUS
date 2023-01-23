package com.example.diffius

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_view.view.*

class ProgrammingAdapter:ListAdapter<programmingItem,ProgrammingAdapter.programmingViewHolder >(Diffutil()) {

    class programmingViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val initial = view.initial
        val name = view.name


        fun bind(item:programmingItem){
            initial.text = item.initial
            name.text = item.name


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): programmingViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view,parent,false)
        return programmingViewHolder(view)
    }

    override fun onBindViewHolder(holder: programmingViewHolder, position: Int) {

        val item = getItem(position)
        holder.bind(item)



    }

    class Diffutil : DiffUtil.ItemCallback<programmingItem>(){
        override fun areItemsTheSame(oldItem: programmingItem, newItem: programmingItem): Boolean {

            return oldItem.id == newItem.id

        }



        override fun areContentsTheSame(
            oldItem: programmingItem,
            newItem: programmingItem
        ): Boolean {

            return oldItem.equals(newItem)
        }

    }


}