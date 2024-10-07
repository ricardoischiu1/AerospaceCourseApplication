package edu.psu.sweng888.aerospacecourseapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class CourseListAdapter(context: Context, courses: List<Course>) :
    ArrayAdapter<Course>(context, 0, courses) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var listItemView = convertView
        if (listItemView == null) {
            listItemView = LayoutInflater.from(context).inflate(
                android.R.layout.simple_list_item_2, parent, false
            )
        }

        val course = getItem(position)

        val titleTextView = listItemView!!.findViewById<TextView>(android.R.id.text1)
        val subtitleTextView = listItemView.findViewById<TextView>(android.R.id.text2)

        titleTextView.text = course?.title
        subtitleTextView.text = course?.subtitle

        return listItemView
    }
}