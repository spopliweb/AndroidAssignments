package com.example.assignments.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.assignments.databinding.ActivityMyViewPageBinding
import com.google.android.material.tabs.TabLayout

class MyViewPage : AppCompatActivity() {
    lateinit var binding: ActivityMyViewPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyViewPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Adding Tabs
        binding.myTabLayout.addTab(binding.myTabLayout.newTab().setText("Chat"))
        binding.myTabLayout.addTab(binding.myTabLayout.newTab().setText("Status"))
        binding.myTabLayout.addTab(binding.myTabLayout.newTab().setText("Call"))

        val adapter = ViewPageAdapter(supportFragmentManager, lifecycle)

        binding.myViewPage.adapter = adapter

        //Tab Click Fragment Change
        binding.myTabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                binding.myViewPage.currentItem = binding.myTabLayout.selectedTabPosition
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

        })

        //on Slide change tab
        binding.myViewPage.registerOnPageChangeCallback(object :ViewPager2.OnPageChangeCallback(){
            override fun onPageScrollStateChanged(state: Int) {
                super.onPageScrollStateChanged(state)
            }

            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)

                binding.myTabLayout.selectTab(binding.myTabLayout.getTabAt(position))
            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels)
            }
        })


    }
}