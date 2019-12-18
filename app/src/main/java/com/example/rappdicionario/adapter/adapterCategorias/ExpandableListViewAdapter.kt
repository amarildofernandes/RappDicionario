package com.example.rappdicionario.adapter.adapterCategorias

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.ExpandableListView
import android.widget.TextView
import android.widget.Toast
import com.example.rappdicionario.R

class ExpandableListViewAdapter(var context: Context ,var expandableListView: ExpandableListView,var titulo : MutableList<String>,
                                var corpo:MutableList<MutableList<String>>) :BaseExpandableListAdapter() {

    override fun getGroup(position: Int): String{
        return titulo[position]
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
        return true
    }

    override fun hasStableIds(): Boolean {
        return false
    }

    override fun getGroupView(
        groupPosition: Int,
        isExpanded: Boolean,
        convertView: View?,
        parent: ViewGroup?
    ): View? {
        var convertV = convertView
        if (convertV == null){
            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertV = inflater.inflate(R.layout.item_group_expand_list,null)
        }
        val titulo_group = convertV?.findViewById<TextView>(R.id.tv_title)
        titulo_group?.text = getGroup(groupPosition)
        titulo_group?.setOnClickListener {
            if (expandableListView.isGroupExpanded(groupPosition)){
                expandableListView.collapseGroup(groupPosition)
            }else
                expandableListView.expandGroup(groupPosition)
            Toast.makeText(context,getGroup(groupPosition),Toast.LENGTH_SHORT).show()
        }
        return convertV
    }

    override fun getChildrenCount(groupPosition: Int): Int {
        return corpo[groupPosition].size
    }

    override fun getChild(groupPosition: Int, childPosition: Int): String {
       return corpo[groupPosition][childPosition]
    }

    override fun getGroupId(groupPosition: Int): Long {
       return groupPosition.toLong()
    }

    override fun getChildView(groupPosition: Int, childPosition: Int, isLastChild: Boolean, convertView: View?, parent: ViewGroup?): View? {
        var convertV = convertView
        if (convertV == null){
            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertV = inflater.inflate(R.layout.item_child_expand_list,null)
        }
        val titulo_group = convertV?.findViewById<TextView>(R.id.tv_title)
        titulo_group?.setOnClickListener {
            Toast.makeText(context,getChild(groupPosition,childPosition),Toast.LENGTH_SHORT).show()
        }
        titulo_group?.text = getChild(groupPosition,childPosition)
        return convertV
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
        return childPosition.toLong()
    }

    override fun getGroupCount(): Int {
        return corpo.size
    }
}