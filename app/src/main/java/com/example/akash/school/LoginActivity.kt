package com.example.akash.school

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        button_parent_sign_in.setOnClickListener{

            startActivity(Intent(this@LoginActivity, ParentLoginActivity::class.java))
        }

        button_teacher_sign_in.setOnClickListener{

            startActivity(Intent(this@LoginActivity, ParentLoginActivity::class.java))
        }
    }
}
