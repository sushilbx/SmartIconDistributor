package com.app.smarticondistributor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContentProviderCompat.requireContext
import com.app.smarticondistributor.adapters.DailyTranscationAdapters
import com.app.smarticondistributor.adapters.OrderDetailsAdapters
import com.app.smarticondistributor.adapters.ProductAdapters
import com.app.smarticondistributor.databinding.ActivityDashboardBinding

class DashboardActivity : AppCompatActivity() {
    private lateinit var b: ActivityDashboardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityDashboardBinding.inflate(layoutInflater)
        val view = b.root
        setContentView(view)
        b.back.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                val intent = Intent(this@DashboardActivity, NavigationActivity::class.java);
                startActivity(intent);
            }
        })
        val dailyTranscationAdapters = DailyTranscationAdapters(this)
        b.rvDaily.adapter = dailyTranscationAdapters
        val orderDetailsAdapters = OrderDetailsAdapters(this)
        b.rvOrder.adapter = orderDetailsAdapters
        val productAdapters = ProductAdapters(this)
        b.rvProduct.adapter = productAdapters

    }
}