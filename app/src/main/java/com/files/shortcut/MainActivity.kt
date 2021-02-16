package com.files.shortcut

import android.content.ComponentName
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = Intent(Intent.ACTION_MAIN)
        intent.component = ComponentName("com.google.android.documentsui", "com.android.documentsui.files.FilesActivity")
        startActivity(intent)
        finish()
        System.exit(0)
    }
}