package com.example.todistdemo.data.domain

data class DbTask(
    val id: String,
    val isCompleted: Boolean,
    val due: Time?,
    val priority: Int,
    val labels: List<String>,
    val projectId: String,
    val url: String
)
