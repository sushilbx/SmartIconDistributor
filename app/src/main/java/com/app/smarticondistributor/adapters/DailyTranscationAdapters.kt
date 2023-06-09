package com.app.smarticondistributor.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.smarticondistributor.R
import com.app.smarticondistributor.databinding.DailyTranscationItemBinding
class DailyTranscationAdapters(/*list: List<BlogModel.Datum>,*/ context: Context) :
    RecyclerView.Adapter<DailyTranscationAdapters.MyViewHolder>() {
    /* var psy: List<BlogModel.Datum>*/
    var context: Context

    init {
        /*  psy = list*/
        this.context = context
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView: View =
            LayoutInflater.from(parent.context).inflate(R.layout.daily_transcation_item, parent, false)
        return MyViewHolder(
            DailyTranscationItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        /* holder.b.blogTitle.setText(psy[position].title)
         holder.b.blogContent.setText(psy[position].content)
         Glide.with(context)
             .load("https://happyu.co.in/storage/blog/upload/" + psy[position].image)
             .into(holder.b.ivImage)
         */

    }

    override fun getItemCount(): Int {
        return /*psy.size*/5
    }

    class MyViewHolder(b: DailyTranscationItemBinding) : RecyclerView.ViewHolder(b.getRoot()) {
        private val b: DailyTranscationItemBinding

        init {
            this.b = b
        }
    }
}
