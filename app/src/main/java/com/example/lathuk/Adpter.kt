package com.example.lathuk

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adpter (val list: MutableList<DataA>): RecyclerView.Adapter<Adpter.myHolder>() {
    class myHolder (view: View): RecyclerView.ViewHolder(view) {

        val Nis = itemView.findViewById<TextView>(R.id.txtNis)
        val Nama = itemView.findViewById<TextView>(R.id.txtNma)
        val Klas = itemView.findViewById<TextView>(R.id.txtKlas)
        val Jurus = itemView.findViewById<TextView>(R.id.txtJrus)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myHolder {
        return myHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.adpter, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: myHolder, position: Int) {
        holder.Nis.text = list[position].nis
        holder.Nama.text = list[position].nma
        holder.Klas.text = list[position].klas
        holder.Jurus.text = list[position].jurus
    }
}