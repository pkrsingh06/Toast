package com.pkr.toast

import android.content.Context
import android.widget.Toast

object Toaster {
    fun simpleToast(context: Context, message: String, duration :Int = Toast.LENGTH_SHORT){
        Toast.makeText(context, message, duration).show()
    }

}