package com.bitsecho.janko.view

import androidx.recyclerview.widget.RecyclerView
import com.bitsecho.janko.base.wrapContent

fun RecyclerView.lparams(block: RecyclerView.LayoutParams.()->Unit): RecyclerView {
    val layoutParams = RecyclerView.LayoutParams(
        wrapContent,
        wrapContent
    )
    block(layoutParams)
    this.layoutParams = layoutParams

    return this
}

