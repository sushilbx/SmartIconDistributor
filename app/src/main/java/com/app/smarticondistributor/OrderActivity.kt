package com.app.smarticondistributor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.app.smarticondistributor.adapters.OrderDetailsAdapters
import com.app.smarticondistributor.databinding.ActivityOrderBinding

class OrderActivity : AppCompatActivity() {
    private lateinit var b: ActivityOrderBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityOrderBinding.inflate(layoutInflater)
        val view = b.root
        setContentView(view)
        b.back.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
              onBackPressed()
            }
        })

        val orderDetailsAdapters = OrderDetailsAdapters(this)
        b.rvOrder.adapter = orderDetailsAdapters


    }
}