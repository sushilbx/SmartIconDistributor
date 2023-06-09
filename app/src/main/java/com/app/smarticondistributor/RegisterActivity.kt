package com.app.smarticondistributor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.app.smarticondistributor.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var b: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityRegisterBinding.inflate(layoutInflater)
        val view = b.root
        setContentView(view)
        b.signup.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                val intent = Intent(this@RegisterActivity, DashboardActivity::class.java);
                startActivity(intent);
            }

        })

    }
}