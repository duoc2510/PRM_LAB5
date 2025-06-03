package com.LAB5
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Lab9_MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lab9_activity_main)

        findViewById<Button>(R.id.btnOptions).setOnClickListener {
            startActivity(Intent(this, OptionsMenuActivity::class.java))
        }
        findViewById<Button>(R.id.btnContext).setOnClickListener {
            startActivity(Intent(this, ContextMenuActivity::class.java))
        }
        findViewById<Button>(R.id.btnPopup).setOnClickListener {
            startActivity(Intent(this, PopupMenuActivity::class.java))
        }
        findViewById<Button>(R.id.btnContextual).setOnClickListener {
            startActivity(Intent(this, ContextualActionBarActivity::class.java))
        }
    }
}
