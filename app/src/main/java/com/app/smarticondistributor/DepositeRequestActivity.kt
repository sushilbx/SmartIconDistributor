package com.app.smarticondistributor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.app.smarticondistributor.adapters.DepositeRequestAdapters
import com.app.smarticondistributor.adapters.OrderManagementAdapters
import com.app.smarticondistributor.databinding.ActivityDepositeRequestBinding
import com.app.smarticondistributor.databinding.ActivityOrderManagementBinding

class DepositeRequestActivity : AppCompatActivity() {
    private lateinit var b: ActivityDepositeRequestBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityDepositeRequestBinding.inflate(layoutInflater)
        val view = b.root
        setContentView(view)
        b.back.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                val intent = Intent(this@DepositeRequestActivity, NavigationActivity::class.java);
                startActivity(intent);
            }
        })
        val depositeRequestAdapters = DepositeRequestAdapters(this@DepositeRequestActivity)
        b.rvDepositeRequest.adapter = depositeRequestAdapters
        val depositeRequestAdapterss = DepositeRequestAdapters(this@DepositeRequestActivity)
        b.rvDepositeRequestRejected.adapter = depositeRequestAdapterss

    }
}