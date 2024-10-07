package edu.psu.sweng888.aerospacecourseapp

import java.io.Serializable

data class Course(
    val title: String,
    val subtitle: String
) : Serializable