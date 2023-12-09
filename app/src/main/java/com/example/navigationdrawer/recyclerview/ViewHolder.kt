package com.example.navigationdrawer.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.navigationdrawer.R

class ViewHolder(inflater: LayoutInflater, parent: ViewGroup):
    RecyclerView.ViewHolder(inflater.inflate(R.layout.recycler_view_template,parent, false)) {

    private var imgView: ImageView? = null
    private var txtTitle: TextView? = null
    private var txtSubTitle: TextView? = null

    init {
        imgView = itemView.findViewById(R.id.img_view)
        txtTitle = itemView.findViewById(R.id.txt_title)
        txtSubTitle = itemView.findViewById(R.id.txt_sub_title)
    }

    fun bind(data: SocialMedia){
        imgView?.setImageResource(data.imgView)
        txtTitle?.setText(data.txtTitle)
        txtSubTitle?.setText(data.txtSubTitle)
    }

}