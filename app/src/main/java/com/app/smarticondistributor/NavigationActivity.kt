package com.app.smarticondistributor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.app.smarticondistributor.adapters.DailyTranscationAdapters
import com.app.smarticondistributor.adapters.OrderDetailsAdapters
import com.app.smarticondistributor.adapters.ProductAdapters
import com.app.smarticondistributor.databinding.ActivityNavigationBinding

class NavigationActivity : AppCompatActivity() {
    private lateinit var b: ActivityNavigationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityNavigationBinding.inflate(layoutInflater)
        val view = b.root
        setContentView(view)
        b.back.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
               onBackPressed()
            }
        })
        b.dashboard.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                val intent = Intent(this@NavigationActivity, DashboardActivity::class.java);
                startActivity(intent);
            }
        })
        b.selling.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                val intent = Intent(this@NavigationActivity, SellActivity::class.java);
                startActivity(intent);
            }
        })
        b.order.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                val intent = Intent(this@NavigationActivity, OrderManagementActivity::class.java);
                startActivity(intent);
            }
        })
        b.deposite.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                val intent = Intent(this@NavigationActivity, DepositeRequestActivity::class.java);
                startActivity(intent);
            }
        })
        b.wallet.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                val intent = Intent(this@NavigationActivity, WalletActivity::class.java);
                startActivity(intent);
            }
        })
        b.profile.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                val intent = Intent(this@NavigationActivity, ProfileActivity::class.java);
                startActivity(intent);
            }
        })
        b.orderList.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                val intent = Intent(this@NavigationActivity, OrderActivity::class.java);
                startActivity(intent);
            }
        })


    }
}