package com.app.smarticondistributor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.app.smarticondistributor.adapters.SellListAdapters
import com.app.smarticondistributor.databinding.ActivitySaleListBinding

class SaleListActivity : AppCompatActivity() {
    private lateinit var b: ActivitySaleListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivitySaleListBinding.inflate(layoutInflater)
        val view = b.root
        setContentView(view)
        b.back.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
               onBackPressed()
            }
        })
        val sellListAdapters = SellListAdapters(this)
        b.rvSelling.adapter = sellListAdapters


    }
}