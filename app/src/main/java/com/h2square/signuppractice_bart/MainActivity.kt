package com.h2square.signuppractice_bart

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val idInputcontent = idInput.text.toString()
        val password =passwordInput.text.toString()
        signUpBtn.setOnClickListener {
            if (idInputcontent == "admin@test.com") {
                if (password == "qwer") {
                    Toast.makeText(this, "관리자입니다.", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "로그인실패.", Toast.LENGTH_SHORT).show()
                }
                Toast.makeText(this, "로그인실패.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}