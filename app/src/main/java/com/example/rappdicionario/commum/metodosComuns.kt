package com.example.rappdicionario.commum

import android.app.Activity
import android.content.ContentValues.TAG
import android.util.Log
import android.view.inputmethod.InputMethodManager

fun esconderTeclado(activity: Activity) {
    try {
        val view = activity.currentFocus
        if (view != null) {
            val inputMethodManager = activity.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(activity.currentFocus!!.windowToken, 0)
        }
    } catch (e: Exception) {
        Log.i(TAG, "esconder teclado " + e.message)
    }
}