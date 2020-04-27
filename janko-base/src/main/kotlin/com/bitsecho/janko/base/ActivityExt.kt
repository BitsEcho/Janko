package com.bitsecho.janko.base

import android.app.Activity
import android.view.View

fun <T: Activity> UI.setContentView(activity: T) {
    activity.setContentView(createView(activity))
}

fun <T: View> Activity.find(id: Int): T {
    return this.findViewById<T>(id)
}