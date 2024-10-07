# AerospaceCourseApp

A simple Android app that displays a list of aerospace courses using `ListView`. The app allows users to select a course to view its details on a separate activity, with visual notifications via `Toast` and `Snackbar`.

## Features

- Main activity with a list of aerospace courses (title and subtitle).
- Data model class (`Course`) to represent course information.
- Custom adapter (`CourseListAdapter`) to populate the `ListView`.
- Explicit `Intent` used to navigate between activities.
- Displays course details on a separate activity (`CourseDetailActivity`).
- Toast messages and Snackbar notifications for user interactions.
- Demonstrates the use of `OnClickListener` to handle list item clicks.

## Requirements

- Android Studio
- Kotlin
- Android SDK 31 or above

## Setup

1. Clone this repository to your local machine:

   ```bash
   git clone https://github.com/yourusername/AerospaceCourseApp.git
