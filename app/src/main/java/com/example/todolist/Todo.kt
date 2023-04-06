package com.example.todolist

/* set up a class to manage the todo item data */
data class Todo(
    val title: String,
    var isChecked: Boolean = false
)