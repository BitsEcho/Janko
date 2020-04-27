package com.bitsecho.janko.layout

import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.Constraints
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.gridlayout.widget.GridLayout
import androidx.slidingpanelayout.widget.SlidingPaneLayout
import com.bitsecho.janko.base.wrapContent

fun ConstraintLayout.lparams(block: ConstraintLayout.LayoutParams.()->Unit): ConstraintLayout {
    val layoutParams = ConstraintLayout.LayoutParams(
        wrapContent,
        wrapContent
    )
    block(layoutParams)
    this.layoutParams = layoutParams
    return this
}

fun Constraints.lparams(block: Constraints.LayoutParams.()->Unit): Constraints {
    val layoutParams = Constraints.LayoutParams(
        wrapContent,
        wrapContent
    )
    block(layoutParams)
    this.layoutParams = layoutParams
    return this
}

fun CoordinatorLayout.lparams(block: CoordinatorLayout.LayoutParams.()->Unit): CoordinatorLayout {
    val layoutParams = CoordinatorLayout.LayoutParams(
        wrapContent,
        wrapContent
    )
    block(layoutParams)
    this.layoutParams = layoutParams
    return this
}

fun GridLayout.lparams(block: GridLayout.LayoutParams.()->Unit): GridLayout {
    val layoutParams = GridLayout.LayoutParams()
    block(layoutParams)
    this.layoutParams = layoutParams
    return this
}

fun SlidingPaneLayout.lparams(block: SlidingPaneLayout.LayoutParams.()->Unit): SlidingPaneLayout {
    val layoutParams = SlidingPaneLayout.LayoutParams(
        wrapContent,
        wrapContent
    )
    block(layoutParams)
    this.layoutParams = layoutParams
    return this
}

