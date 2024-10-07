package edu.psu.sweng888.aerospacecourseapp

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Show welcome Toast message
        Toast.makeText(this, "Welcome to the Aerospace Course App!", Toast.LENGTH_SHORT).show()

        // Sample list of aerospace courses
        val courses = listOf(
            Course("Aerodynamics", "Introduction to Aerodynamics"),
            Course("Propulsion", "Basics of Jet Engines"),
            Course("Flight Mechanics", "Principles of Flight Dynamics"),
            Course("Structures", "Aircraft Structural Analysis"),
            Course("Avionics", "Introduction to Aircraft Electronics")
        )

        // Find the ListView and set the adapter
        val listView = findViewById<ListView>(R.id.course_list_view)
        val adapter = CourseListAdapter(this, courses)
        listView.adapter = adapter

        // Set an item click listener for the ListView
        listView.setOnItemClickListener { parent, view, position, id ->
            val selectedCourse = courses[position]

            // Display a Toast message when a course is selected
            Toast.makeText(this, "You selected: ${selectedCourse.title}", Toast.LENGTH_SHORT).show()

            // Display a Snackbar when a course is selected
            Snackbar.make(view, "Opening course: ${selectedCourse.title}", Snackbar.LENGTH_SHORT).show()

            // Start the CourseDetailActivity
            val intent = Intent(this, CourseDetailActivity::class.java)
            intent.putExtra("selectedCourse", selectedCourse)
            startActivity(intent)
        }
    }

    // When returning to the MainActivity from the CourseDetailActivity, show a Toast and a Snackbar
    override fun onResume() {
        super.onResume()

        // Display a Toast message
        Toast.makeText(this, "Returned from Course Details successfully!", Toast.LENGTH_SHORT).show()

        // Display a Snackbar
        val rootView = findViewById<View>(android.R.id.content)
        Snackbar.make(rootView, "Welcome back to Main Menu!", Snackbar.LENGTH_SHORT).show()
    }
}