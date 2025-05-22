package com.LAB5

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class CustomAdapter(
    context: Context,
    private val resource: Int,
    private val contacts: List<Contact>
) : ArrayAdapter<Contact>(context, resource, contacts) {

    // ViewHolder pattern để tái sử dụng View, giúp tránh lag khi scroll
    private class ViewHolder(
        val tvName: TextView,
        val tvIdStudent: TextView,
        val tvAvatar: TextView
    )

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view: View
        val holder: ViewHolder

        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(resource, parent, false)
            holder = ViewHolder(
                view.findViewById(R.id.tvName),
                view.findViewById(R.id.tvMaSinhVien),
                view.findViewById(R.id.tvAvatar)
            )
            view.tag = holder
        } else {
            view = convertView
            holder = view.tag as ViewHolder
        }

        val contact = contacts[position]

        holder.tvAvatar.apply {
            setBackgroundColor(contact.color)
            text = (position + 1).toString()
        }

        holder.tvName.text = contact.name
        holder.tvIdStudent.text = contact.idStudent

        return view
    }
}
