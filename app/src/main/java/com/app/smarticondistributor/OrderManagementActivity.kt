package com.app.smarticondistributor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.app.smarticondistributor.adapters.OrderManagementAdapters
import com.app.smarticondistributor.databinding.ActivityOrderManagementBinding

class OrderManagementActivity : AppCompatActivity() {
    private lateinit var b: ActivityOrderManagementBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityOrderManagementBinding.inflate(layoutInflater)
        val view = b.root
        setContentView(view)
        b.back.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                val intent = Intent(this@OrderManagementActivity, NavigationActivity::class.java);
                startActivity(intent);
            }
        })
        val orderManagementAdapters = OrderManagementAdapters(this)
        b.rvOrder.adapter = orderManagementAdapters


    }
}