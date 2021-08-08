package com.roberts.blurimage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.roberts.blurimage.adapters.TabsAdapter
import com.roberts.blurimage.databinding.ActivityMainBinding
import com.roberts.blurimage.fragments.AppsFragment
import com.roberts.blurimage.fragments.GamesFragment

class MainActivity : AppCompatActivity() {
    //private lateinit var binding: ActivityMainBinding
    private lateinit var viewPager: ViewPager
    private lateinit var tabs : TabLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewPager = findViewById(R.id.viewpager)
        tabs = findViewById(R.id.tab)
        setUpTabs()
        setContentView(R.layout.activity_main)
    }

    private fun setUpTabs() {
        val tabsAdapter = TabsAdapter(supportFragmentManager)
        tabsAdapter.addFragments(GamesFragment(),"Games")
        tabsAdapter.addFragments(AppsFragment(),"Apps")
        viewPager.adapter = tabsAdapter
        tabs.setupWithViewPager(viewPager)
    }
}