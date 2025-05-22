package com.LAB5

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class ListViewActivity : AppCompatActivity() {
    private lateinit var lv: ListView
    private val number = arrayOf("161250533502", "161250533405", "151250533308", "161250533207", "151250533113", "131250532378")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview_1)

        lv = findViewById(R.id.lvMaSinhVien)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, number)
        lv.adapter = adapter
    }
}
