package com.bitsecho.janko

import android.content.Context
import android.view.View

interface UI {
    fun createView(ctx: Context): View
}

