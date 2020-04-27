package com.bitsecho.anko

import android.content.Context
import android.content.DialogInterface
import androidx.appcompat.app.AlertDialog

fun Context.alert(block: AlertDialog.Builder.()->Unit) {
    val builder = AlertDialog.Builder(this)
    builder.block()
    builder.create().show()
}

fun Context.listAlert(items: Array<String>, block: (dialogInterface: DialogInterface, which: Int)->Unit) {
    val listAlertBuilder = AlertDialog.Builder(this)
    listAlertBuilder.setItems(items, block)
    listAlertBuilder.create().show()
}