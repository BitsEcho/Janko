package com.bitsecho.janko

import androidx.recyclerview.widget.RecyclerView

fun RecyclerView.lparams(block: RecyclerView.LayoutParams.()->Unit): RecyclerView {
    val layoutParams = RecyclerView.LayoutParams(wrapContent, wrapContent)
    block(layoutParams)
    this.layoutParams = layoutParams

    return this
}

