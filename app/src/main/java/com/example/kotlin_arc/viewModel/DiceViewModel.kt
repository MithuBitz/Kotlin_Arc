package com.example.kotlin_arc.viewModel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.kotlin_arc.LOG_TAG
import com.example.kotlin_arc.R
import com.example.kotlin_arc.utils.DiceHelper

class DiceViewModel (app: Application) : AndroidViewModel(app) {

    val headline = MutableLiveData<String>()
    val dice = MutableLiveData<IntArray>()
    private val context = app

    init {
       Log.i(LOG_TAG, "View Model Created")
        headline.value = context.getString(R.string.wellcome)
        dice.value = intArrayOf(6, 6, 6, 6, 6)

    }

    fun rollDice() {
        dice.value = DiceHelper.rollDice()
        headline.value = DiceHelper.evaluateDice(context, dice.value)
    }
}