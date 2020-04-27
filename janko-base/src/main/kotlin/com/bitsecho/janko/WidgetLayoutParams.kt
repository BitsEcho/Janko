package com.bitsecho.janko

import android.view.View
import android.view.ViewGroup
import android.widget.*

const val matchParent = ViewGroup.LayoutParams.MATCH_PARENT
const val wrapContent = ViewGroup.LayoutParams.WRAP_CONTENT

fun <T: View> T.lparamsw(block: LinearLayout.LayoutParams.() -> Unit): T {
    val layoutParams = LinearLayout.LayoutParams(wrapContent, wrapContent)
    block(layoutParams)
    this.layoutParams = layoutParams
    return this
}

fun Toolbar.lparams(block: Toolbar.LayoutParams.() -> Unit): Toolbar {
    val layoutParams = Toolbar.LayoutParams(wrapContent, wrapContent)
    block(layoutParams)
    this.layoutParams = layoutParams
    return this
}

fun LinearLayout.lparams(block: LinearLayout.LayoutParams.() -> Unit): LinearLayout {
    val layoutParams = LinearLayout.LayoutParams(wrapContent, wrapContent)
    block(layoutParams)
    this.layoutParams = layoutParams
    return this
}

fun GridLayout.lparams(block: GridLayout.LayoutParams.() -> Unit): GridLayout {
    val layoutParams = GridLayout.LayoutParams()
    block(layoutParams)
    this.layoutParams = layoutParams
    return this
}

fun FrameLayout.lparams(block: FrameLayout.LayoutParams.() -> Unit): FrameLayout {
    val layoutParams = FrameLayout.LayoutParams(wrapContent, wrapContent)
    block(layoutParams)
    this.layoutParams = layoutParams
    return this
}

fun RelativeLayout.lparams(block: RelativeLayout.LayoutParams.() -> Unit): RelativeLayout {
    val layoutParams = RelativeLayout.LayoutParams(wrapContent, wrapContent)
    block(layoutParams)
    this.layoutParams = layoutParams
    return this
}

fun AbsListView.lparams(block: AbsListView.LayoutParams.() -> Unit): AbsListView {
    val layoutParams = AbsListView.LayoutParams(wrapContent, wrapContent)
    block(layoutParams)
    this.layoutParams = layoutParams
    return this
}

fun TableLayout.lparams(block: TableLayout.LayoutParams.() -> Unit): TableLayout {
    val layoutParams = TableLayout.LayoutParams()
    block(layoutParams)
    this.layoutParams = layoutParams
    return this
}