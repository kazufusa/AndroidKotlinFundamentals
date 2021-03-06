package com.android.example.aboutme

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * MainActivity of the AboutMe app. This app demonstrated:
 *      * Getting user input with an EditText.
 *      * Click handler for a Button to retrieve text from an EditText and set it in a TextView.
 *      * Setting a click handler on a TextView.
 *      * Setting the visibility status of a view.
 *
 * MainActivity of the AboutMe app. This app demonstrates:
 * Getting use input with an EditText.
 * Click handler for a Button to retrieve text from an EditText and set it in a TextView.
 * Setting click handler on a TextView.
 * Setting the visibility status of a view.
 *
 * MainActivity of the AboutMe app. This app demonstrates:
 * Getting user input text from an EditText.
 * Click handler for a button to retrieve text from an EditText ans set it in a TextView.
 * Setting a click handler on a TextView.
 * Setting the visibility status of a view.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.done_button).setOnClickListener {
            addNickname(it)
        }

        findViewById<TextView>(R.id.nickname_text).setOnClickListener {
            updateNickname(it)
        }
    }

    /**
     * Click handler for the DONE button.
     * Hides the EditText and the DONE button.
     * Sets the EditText content to the TextView and displays it.
     */
    private fun addNickname(view: View) {
        val editText = findViewById<EditText>(R.id.nickname_edit)
        val nicknameTextView = findViewById<TextView>(R.id.nickname_text)

        nicknameTextView.text = editText.text
        nicknameTextView.visibility = View.VISIBLE
        editText.visibility = View.GONE
        view.visibility = View.GONE

        // hide  the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }

    /**
     * Click handler for the nickname TextView.
     * Displays the EditText and the Done button.
     * Hides the nickname TextView.
     */
    private fun updateNickname(view: View) {
        val editText = findViewById<EditText>(R.id.nickname_edit)
        val doneButton = findViewById<Button>(R.id.done_button)

        editText.visibility = View.VISIBLE
        doneButton.visibility = View.VISIBLE
        view.visibility = View.GONE

        // Set the focus to the edit text.
        editText.requestFocus()

        // Show the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(editText, 0)
    }
}
