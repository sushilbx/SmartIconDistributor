package com.app.smarticondistributor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.app.smarticondistributor.databinding.ActivitySellBinding

class SellActivity : AppCompatActivity() {
    private lateinit var b: ActivitySellBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivitySellBinding.inflate(layoutInflater)
        val view = b.root
        setContentView(view)
        b.mbSell.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                val intent = Intent(this@SellActivity, SaleListActivity::class.java);
                startActivity(intent);
            }
        })
    }
}