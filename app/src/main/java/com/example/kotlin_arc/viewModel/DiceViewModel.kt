package com.example.kotlin_arc.viewModel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import com.example.kotlin_arc.LOG_TAG

class DiceViewModel (app: Application) : AndroidViewModel(app) {

    init {
       Log.i(LOG_TAG, "View Model Created")

    }
}