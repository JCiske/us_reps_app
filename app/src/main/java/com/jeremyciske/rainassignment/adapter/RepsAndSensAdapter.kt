package com.jeremyciske.rainassignment.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jeremyciske.rainassignment.R
import com.jeremyciske.rainassignment.model.RepsAndSens
import android.widget.TextView

class RepsAndSensAdapter(dataList: ArrayList<RepsAndSens>) : RecyclerView.Adapter<RepsAndSensAdapter.RepViewHolder>() {
    private var dataList: ArrayList<RepsAndSens>? = dataList

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RepViewHolder{
        val layoutInflater = LayoutInflater.from(parent?.context)
        val view = layoutInflater.inflate(R.layout.rep_row, parent, false)
        return RepViewHolder(view)
    }

    override fun onBindViewHolder(holder: RepViewHolder, position: Int) {
        holder.txtRepName.text = dataList?.get(position)!!.name
        holder.txtRepParty.text = dataList?.get(position)!!.party
        holder.txtRepState.text = dataList?.get(position)!!.state
        holder.txtRepPhone.text = dataList?.get(position)!!.phone
        holder.txtRepOffice.text = dataList?.get(position)!!.office
        holder.txtRepLink.text = dataList?.get(position)!!.link

    }

    override fun getItemCount(): Int {
        return dataList!!.size
    }

    inner class RepViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtRepName: TextView = itemView.findViewById(R.id.txt_rep_name) as TextView
        var txtRepParty: TextView = itemView.findViewById(R.id.txt_rep_party) as TextView
        var txtRepState: TextView = itemView.findViewById(R.id.txt_rep_state) as TextView
        var txtRepPhone: TextView = itemView.findViewById(R.id.txt_rep_phone) as TextView
        var txtRepOffice: TextView = itemView.findViewById(R.id.txt_rep_office) as TextView
        var txtRepLink: TextView = itemView.findViewById(R.id.txt_rep_link) as TextView
    }
}