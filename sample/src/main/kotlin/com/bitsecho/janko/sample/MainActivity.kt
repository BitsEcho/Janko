package com.bitsecho.janko.sample

import android.content.Context
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.appcompat.widget.Toolbar
import com.bitsecho.janko.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainUI().setContentView(this)   // Equivalent: this.setContentView(view)
        window.statusBarColor = getColor(R.color.colorPrimaryDark)
        val toolbar = find<Toolbar>(R.id.toolbar)   // Equivalent: val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
    }
}

class MainUI: UI {
    override fun createView(ctx: Context): View {
        return with(ctx) {
            LinearLayoutCompat(ctx).ui {
                orientation = LinearLayoutCompat.VERTICAL
                Toolbar(ctx).ui {
                    id = R.id.toolbar
                    title = "Janko"
                    setTitleTextColor(getColor(R.color.white))
                    setBackgroundColor(getColor(R.color.colorPrimary))
                }.lparams {
                    width = matchParent
                    height = wrapContent
                }.into(this)

                LinearLayoutCompat(ctx).ui {
                    orientation = LinearLayoutCompat.VERTICAL
                    gravity = Gravity.CENTER

                    Button(ctx).ui {
                        text = "Toast"
                        setTextColor(getColor(R.color.white))
                        setBackgroundColor(getColor(R.color.colorPrimary))

                        onClick {
                            toast("This is a toast")
                        }
                    }.lparams {
                        width = dip(200)
                        height = wrapContent
                        gravity = Gravity.CENTER
                        topMargin = dip(8)
                        bottomMargin = dip(8)
                    }.into(this)

                    Button(ctx).ui {
                        text = "Alert"
                        setTextColor(getColor(R.color.white))
                        setBackgroundColor(getColor(R.color.colorPrimary))

                        onClick {
                            alert {
                                setTitle("Alert Title")
                                setMessage("I am messge")
                                setNegativeButton("No") { _, i ->
                                    toast("Select: $i")
                                }

                                setNeutralButton("Ignore") { _, i ->
                                    toast("Select: $i")
                                }

                                setPositiveButton("Yes") { _, i ->
                                    toast("Select: $i")
                                }
                            }
                        }

                    }.lparams {
                        width = dip(200)
                        height = wrapContent
                        gravity = Gravity.CENTER
                        topMargin = dip(8)
                        bottomMargin = dip(8)
                    }.into(this)

                    Button(ctx).ui {
                        text = "List Alert"
                        setTextColor(getColor(R.color.white))
                        setBackgroundColor(getColor(R.color.colorPrimary))

                        onClick {
                            val items = arrayOf("Red", "Blue", "Yellow")
                            listAlert(items) { _, i ->
                                toast(items[i])
                            }
                        }
                    }.lparams {
                        width = dip(200)
                        height = wrapContent
                        gravity = Gravity.CENTER
                        topMargin = dip(8)
                        bottomMargin = dip(8)
                    }.into(this)

                    Button(ctx).ui {
                        text = "Popup Menu"
                        setTextColor(getColor(R.color.white))
                        setBackgroundColor(getColor(R.color.colorPrimary))

                        onClick {
                            popupMenu(ctx, R.menu.sample) {
                                toast(it.title.toString())
                                true
                            }
                        }

                    }.lparams {
                        width = dip(200)
                        height = wrapContent
                        gravity = Gravity.CENTER
                        topMargin = dip(8)
                        bottomMargin = dip(8)
                    }.into(this)



                }.lparams {
                    width = wrapContent
                    height = matchParent
                    gravity = Gravity.CENTER
                }.into(this)
            }.lparams {
                width = matchParent
                height = matchParent
            }
        }
    }
}
