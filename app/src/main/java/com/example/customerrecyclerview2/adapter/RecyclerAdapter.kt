package com.example.customerrecyclerview2.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.customerrecyclerview2.R
import com.example.customerrecyclerview2.model.RecyclerModel

class RecyclerAdapter(
    private val context: Context,
    private val recyclerModels: List<RecyclerModel>
) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.item_recycler, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(recyclerModels[position])
    }

    override fun getItemCount(): Int = recyclerModels.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val txtDate: TextView = itemView.findViewById(R.id.txt_date)
        private val txtTitle: TextView = itemView.findViewById(R.id.txt_title)
        private val txtDescription: TextView = itemView.findViewById(R.id.txt_description)

        fun bind(model: RecyclerModel) {
            txtDate.text = model.date
            txtTitle.text = model.title
            txtDescription.text = model.description
        }
    }
}
