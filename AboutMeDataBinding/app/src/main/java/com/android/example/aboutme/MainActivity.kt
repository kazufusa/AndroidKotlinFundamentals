package com.android.example.aboutme

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.android.example.aboutme.databinding.ActivityMainBinding

/**
 * MainActivity of the AboutMe app. This app demonstrated:
 *      * Getting user input with an EditText.
 *      * Click handler for a Button to retrieve text from an EditText and set it in a TextView.
 *      * Setting a click handler on a TextView.
 *      * Setting the visibility status of a view.
 */
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.doneButton.setOnClickListener {
            addNickname()
        }

        binding.nicknameText.setOnClickListener {
            updateNickname()
        }
    }

    /**
     * Click handler for the DONE button.
     * Hides the EditText and the DONE button.
     * Sets the EditText content to the TextView and displays it.
     */
    private fun addNickname() {
        binding.apply {
            nicknameText.text = nicknameEdit.text.toString()
            nicknameText.visibility = View.VISIBLE
            nicknameEdit.visibility = View.GONE
            doneButton.visibility = View.GONE

            // hide  the keyboard.
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(doneButton.windowToken, 0)
        }
    }

    /**
     * Click handler for the nickname TextView.
     * Displays the EditText and the Done button.
     * Hides the nickname TextView.
     */
    private fun updateNickname() {
        binding.apply {
            nicknameEdit.visibility = View.VISIBLE
            doneButton.visibility = View.VISIBLE
            nicknameText.visibility = View.GONE

            // Set the focus to the edit text.
            nicknameEdit.requestFocus()

            // Show the keyboard.
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.showSoftInput(nicknameEdit, 0)
        }
    }
}
