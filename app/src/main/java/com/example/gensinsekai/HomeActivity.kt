package com.example.gensinsekai

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_main.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        bar1.setOnClickListener() {
            Intent(this, GachaActivity::class.java).also {
                startActivity(it)
            }
        }

        bar2.setOnClickListener() {
            Intent(this, mapgenshin::class.java).also {
                startActivity(it)
            }
        }

        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when(item.itemId) {
                R.id.page_1 -> {
                    // Respond to navigation item 1 click
                    Intent(this, HomeActivity::class.java).also {
                        startActivity(it)
                    }
                    true
                }
                R.id.page_2 -> {
                    // Respond to navigation item 2 click
                    Intent(this, mapgenshin::class.java).also {
                        startActivity(it)
                    }
                    true
                }
                else -> false
            }
        }

        bottom_navigation.setOnNavigationItemReselectedListener { item ->
            when(item.itemId) {
                R.id.page_1 -> {
                    // Respond to navigation item 1 reselection
                }
                R.id.page_2 -> {

                    Intent(this, mapgenshin::class.java).also {
                        startActivity(it)
                    }
                    // Respond to navigation item 2 reselection
                }
            }
        }

    }
}