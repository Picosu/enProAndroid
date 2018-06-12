package com.example.maxencedecussac.eyenightpro.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.parse.*


class HomeActivity : AppCompatActivity() {

    private lateinit var connexionButton: Button
    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        Parse.initialize(this)

        ParseInstallation.getCurrentInstallation().saveInBackground()
        connexionButton = findViewById(R.id.connectButton) as Button
        usernameEditText = findViewById(R.id.userName) as EditText
        passwordEditText = findViewById(R.id.password) as EditText

        connexionButton.setOnClickListener(clickListener)
    }

    val clickListener = View.OnClickListener { view ->

        when (view.getId()) {
            R.id.connectButton -> connectUser()
        }
    }

    fun connectUser() {
        var isUsernameOk = !usernameEditText.text.isEmpty()
        var isPasswordOk = !passwordEditText.text.isEmpty()

        if (isUsernameOk && isPasswordOk) {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()
            ParseUser.logInInBackground(username, password, LogInCallback { user, e ->
                if (user != null) {
                    // Hooray! The user is logged in.
//                    Log.e(user)
                } else {
                    // Signup failed. Look at the ParseException to see what happened.
                }
            })

            //Log.e(ParseUser.getCurrentUser())
            Log.e("EyenightPro", usernameEditText.text.toString() + passwordEditText.text.toString())
        }
    }
}
