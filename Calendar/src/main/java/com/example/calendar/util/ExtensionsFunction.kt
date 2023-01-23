package com.example.calendar.util

import java.util.*

fun Calendar.getDate() = this.get(Calendar.DATE)
fun Calendar.getMonth() = this.get(Calendar.MONTH)

fun Calendar.getDayOfWeek() = this.get(Calendar.DAY_OF_WEEK)
