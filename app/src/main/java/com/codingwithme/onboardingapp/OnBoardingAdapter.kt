package com.codingwithme.onboardingapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class OnBoardingAdapter(var list:ArrayList<OnBoardingIemModel>) :
    RecyclerView.Adapter<OnBoardingAdapter.OnBoardingViewHolder>() {

    inner class OnBoardingViewHolder(view: View): RecyclerView.ViewHolder(view){
        var image = view.findViewById<ImageView>(R.id.img)
        var title = view.findViewById<TextView>(R.id.tv_title)
        var desc = view.findViewById<TextView>(R.id.tv_desc)

        fun bind(model:OnBoardingIemModel){
            image.setImageResource(model.image)
            title.text = model.title
            desc.text = model.description
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnBoardingViewHolder {
        return OnBoardingViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: OnBoardingViewHolder, position: Int) {
        holder.bind(list[position])
    }
}