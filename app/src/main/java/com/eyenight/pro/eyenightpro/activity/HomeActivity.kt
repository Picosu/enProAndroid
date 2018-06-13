package com.eyenight.pro.eyenightpro.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.eyenight.pro.eyenightpro.R
import com.parse.ParseUser


class HomeActivity : AppCompatActivity() {

    lateinit var usernameEditText: EditText
    lateinit var passwordEditText: EditText
    lateinit var connexionButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        usernameEditText = findViewById(R.id.username_editText)
        passwordEditText = findViewById(R.id.password_editText)
        connexionButton = findViewById(R.id.connexionButton)
        connexionButton.setOnClickListener {
            connexion()
        }
    }

    fun connexion() {
        val usernameText = usernameEditText.text.toString()
        val passwordText = passwordEditText.text.toString()

        ParseUser.logInInBackground(usernameText, passwordText) { user, e ->
            if (user != null) {
                // Hooray! The user is logged in.
                val intent = EventListActivity.newIntent(this, user)
                startActivity(intent)
            } else {
                // Signup failed. Look at the ParseException to see what happened.
            }
        }
    }
}
