package com.example.todistdemo.data.domain

data class Time(val date: String,
                val isRecurring: Boolean,
                val dateTime: String?,
                val displayString: String,
                val timezone: String?)
