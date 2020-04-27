package com.bitsecho.janko.base

import android.content.Context
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import com.bitsecho.util.then

fun <T: View>T.ui(block: T.() -> Unit): T {
    block()
    return this
}

fun View.dip(px: Int): Int = context.dip(px)
fun View.dip(px: Float): Int = context.dip(px)

fun <T: View>T.into(v: ViewGroup): T {
    v.addView(this)
    return this
}

fun View.popupMenu(ctx: Context, menuRes: Int, onClickListener: (menuItem: MenuItem)->Boolean) {
    PopupMenu(ctx, this).then {
        inflate(menuRes)
        setOnMenuItemClickListener(onClickListener)
    }.show()
}

fun View.onClick(onClick: (v: View)->Unit) = this.setOnClickListener { onClick(it) }

fun View.onLongClick(onLongClick: (v: View)->Boolean) = this.setOnLongClickListener { onLongClick(it) }

fun View.onContextClick(onContextClick: (v: View)->Boolean) = this.setOnContextClickListener { onContextClick(it) }