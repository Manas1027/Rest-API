package com.example.rest_api

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.text.HtmlCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.rest_api.model.Rezultat
import com.example.rest_api.model.SchoolClass
import kotlinx.android.synthetic.main.item.view.*

class SchoolClassAdapter: RecyclerView.Adapter<SchoolClassAdapter.SchoolClassViewHolder>() {

    var models: List<Rezultat> = listOf()
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    inner class SchoolClassViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun populateModel(model: Rezultat?){
            itemView.tvName.text = HtmlCompat.fromHtml(model?.text!!, HtmlCompat.FROM_HTML_MODE_COMPACT)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SchoolClassViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return SchoolClassViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: SchoolClassViewHolder, position: Int) {
        holder.populateModel(models[position])
    }

    override fun getItemCount(): Int {
        return models.size ?: 0
    }
}