package edu.psu.sweng888.aerospacecourseapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import androidx.appcompat.widget.Toolbar

class CourseDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course_detail)

        // Set up the action bar with the back button enabled
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)

        // Retrieve the passed Course object from the intent
        val selectedCourse = intent.getSerializableExtra("selectedCourse") as? Course

        // Find the TextViews and populate with course data
        val titleTextView = findViewById<TextView>(R.id.titleTextView)
        val subtitleTextView = findViewById<TextView>(R.id.subtitleTextView)

        // Set the course details to the TextViews
        titleTextView.text = selectedCourse?.title
        subtitleTextView.text = selectedCourse?.subtitle
    }

    // Handle the back button press event in the action bar
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()  // Navigate back to the previous activity
        return true
    }
}