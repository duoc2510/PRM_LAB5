package com.LAB5

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class CustomListViewActivity : AppCompatActivity() {
    private lateinit var lvContact: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview)

        lvContact = findViewById(R.id.lvContact)

        val arrContact = arrayListOf(
            Contact("Visit Hung Anh", "161250533502", android.graphics.Color.RED),
            Contact("Nguyen Quoc Cuong", "161250533405", android.graphics.Color.GREEN),
            Contact("Nguyen Khuong Dao", "151250533308", android.graphics.Color.GRAY),
            Contact("Vy Van Do", "161250533207", android.graphics.Color.YELLOW),
            Contact("Pham Nguyen Hoai Duy", "151250533113", android.graphics.Color.BLACK),
            Contact("Do Thien Giang", "131250532378", android.graphics.Color.BLUE),
            Contact("Vo Huu Hai", "151250533116", android.graphics.Color.CYAN)
        )


        val adapter = CustomAdapter(this, R.layout.row_listview, arrContact)
        lvContact.adapter = adapter
    }
}
