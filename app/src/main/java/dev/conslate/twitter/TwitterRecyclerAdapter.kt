package dev.conslate.twitter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TwitterRecyclerAdapter (var TwitterList:List<twitter>):RecyclerView.Adapter<TwitterRecyclerAdapter.twitterViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): twitterViewHolder {
     var itemView=LayoutInflater.from(parent.context).inflate(R.layout.twitter_list_item,parent,false)
        return twitterViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: twitterViewHolder, position: Int) {
        var twitterone=TwitterList.get(position)
        holder.tvHandles.text=twitterone.Handles
        holder.tvName.text=twitterone.Name
        holder.tvTweet.text=twitterone.Tweet
        holder.tvNum1.text=twitterone.Num1
        holder.tvNum2.text=twitterone.Num2
        holder.tvNum3.text=twitterone.Num3

    }

    override fun getItemCount(): Int {
        return TwitterList.size

    }
    class twitterViewHolder(itemView:View):
            RecyclerView.ViewHolder(itemView){
        var tvName:TextView=itemView.findViewById<TextView>(R.id.tvName)
        var tvTweet:TextView=itemView.findViewById<TextView>(R.id.tvTweet)
        var tvHandles:TextView=itemView.findViewById<TextView>(R.id.tvHandles)
        var tvNum2:TextView=itemView.findViewById<TextView>(R.id.tvNum2)
        var tvNum3:TextView=itemView.findViewById<TextView>(R.id.tvNum3)
        var tvNum1:TextView=itemView.findViewById<TextView>(R.id.tvNum1) }

}





