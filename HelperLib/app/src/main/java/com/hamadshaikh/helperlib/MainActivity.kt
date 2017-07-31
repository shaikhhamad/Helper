package com.hamadshaikh.helperlib

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import helper.Helper

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         var helper = Helper()
         helper.getSize(baseContext)
    }
}