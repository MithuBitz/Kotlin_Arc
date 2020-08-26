package com.example.kotlin_arc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    private val imageViews by lazy {
        arrayOf<ImageView>(die1,die2,die3,die4,die5)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        lifecycle.addObserver(MyLifecycleObserver())

        headline.text = "Wellcome to My app"

        for (imageView in imageViews) {
            imageView.setImageResource(R.drawable.die_6)
        }

    }

}