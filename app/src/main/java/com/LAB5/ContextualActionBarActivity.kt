package com.LAB5

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.view.ActionMode

class ContextualActionBarActivity : AppCompatActivity() {
    private var actionMode: ActionMode? = null
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contextual_actionbar)

        textView = findViewById(R.id.text_view)
        textView.setOnLongClickListener {
            if (actionMode != null) return@setOnLongClickListener false
            actionMode = startSupportActionMode(actionModeCallback)
            true
        }
    }

    private val actionModeCallback = object : ActionMode.Callback {
        override fun onCreateActionMode(mode: ActionMode?, menu: Menu?): Boolean {
            menuInflater.inflate(R.menu.contextual_menu, menu)
            mode?.title = "Select Action"
            return true
        }

        override fun onPrepareActionMode(mode: ActionMode?, menu: Menu?) = false
        override fun onActionItemClicked(mode: ActionMode?, item: MenuItem?): Boolean {
            Toast.makeText(this@ContextualActionBarActivity, "Action: ${item?.title}", Toast.LENGTH_SHORT).show()
            mode?.finish()
            return true
        }

        override fun onDestroyActionMode(mode: ActionMode?) {
            actionMode = null
        }
    }
}
