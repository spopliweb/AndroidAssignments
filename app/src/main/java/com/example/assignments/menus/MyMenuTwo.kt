package com.example.assignments.menus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.assignments.R
import com.example.assignments.databinding.ActivityMyMenuTwoBinding

class MyMenuTwo : AppCompatActivity() {
    lateinit var binding: ActivityMyMenuTwoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyMenuTwoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().add(R.id.myMenuFgv, MenuLogin()).commit()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.profile_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.menuProfile -> supportFragmentManager.beginTransaction().replace(R.id.myMenuFgv, ProfileMenu()).commit()
            R.id.menuLogout -> supportFragmentManager.beginTransaction().replace(R.id.myMenuFgv, LogOutMenu()).commit()
        }
        return super.onOptionsItemSelected(item)
    }
}