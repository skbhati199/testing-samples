package com.example.android.testing.espresso.BasicSample

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.google.common.base.Strings
import kotlinx.android.synthetic.main.activity_test.*

class TestActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        // Get the message from the Intent.

        // Get the message from the Intent.
        val intent = intent
        val message = Strings.nullToEmpty(intent.getStringExtra(ShowTextActivity.KEY_EXTRA_MESSAGE))

        // Show message.

        // Show message.
        test_view.text = message

    }
}
