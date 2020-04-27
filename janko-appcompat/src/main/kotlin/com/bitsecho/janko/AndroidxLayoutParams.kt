package com.bitsecho.janko

import android.view.View
import androidx.appcompat.widget.ActionBarOverlayLayout
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.viewpager.widget.ViewPager

fun <T: View> T.lparams(block: LinearLayoutCompat.LayoutParams.() -> Unit): T {
    val layoutParams = LinearLayoutCompat.LayoutParams(wrapContent, wrapContent)
    block(layoutParams)
    this.layoutParams = layoutParams
    return this
}

fun Toolbar.lparams(block: Toolbar.LayoutParams.()->Unit): Toolbar {
    val layoutParams = Toolbar.LayoutParams(wrapContent, wrapContent)
    block(layoutParams)
    this.layoutParams = layoutParams
    return this
}

fun LinearLayoutCompat.lparams(block: LinearLayoutCompat.LayoutParams.()->Unit): LinearLayoutCompat {
    val layoutParams = LinearLayoutCompat.LayoutParams(wrapContent, wrapContent)
    block(layoutParams)
    this.layoutParams = layoutParams
    return this
}

fun ActionBarOverlayLayout.lparams(block: ActionBarOverlayLayout.LayoutParams.()->Unit): ActionBarOverlayLayout {
    val layoutParams = ActionBarOverlayLayout.LayoutParams(wrapContent, wrapContent)
    block(layoutParams)
    this.layoutParams = layoutParams
    return this
}

fun DrawerLayout.lparams(block: DrawerLayout.LayoutParams.()->Unit): DrawerLayout {
    val layoutParams = DrawerLayout.LayoutParams(wrapContent, wrapContent)
    block(layoutParams)
    this.layoutParams = layoutParams
    return this
}

fun ViewPager.lparams(block: ViewPager.LayoutParams.() -> Unit): ViewPager {
    val layoutParams = ViewPager.LayoutParams()
    block(layoutParams)
    this.layoutParams = layoutParams
    return this
}