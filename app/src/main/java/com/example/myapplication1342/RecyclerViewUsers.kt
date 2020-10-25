package com.example.myapplication1342

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewUsers : RecyclerView.Adapter<RecyclerViewUsers.ViewHolderUsers>() {

    var list = List(10){users()}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderUsers {
        var view:View = LayoutInflater.from(parent.context)
            .inflate(R.layout.user_item, parent, false)
        return ViewHolderUsers(view)
    }

    override fun onBindViewHolder(holder: ViewHolderUsers, position: Int) {
        holder.onBind(list[position])
    }
    override fun getItemCount(): Int{
        return list.size
    }
    class ViewHolderUsers(item:View) : RecyclerView.ViewHolder(item){
        var up:TextView = item.findViewById<TextView>(R.id.up)
        var down:TextView = item.findViewById<TextView>(R.id.down)

        fun onBind(user : users){
            up.text = user.name
            down.text = user.state.toString()
        }
    }


}