package com.example.assignments.menus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast
import com.example.assignments.R
import com.example.assignments.databinding.ActivityMyMenuBinding

class MyMenu : AppCompatActivity() {
    lateinit var binding: ActivityMyMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        registerForContextMenu(binding.myContext)

        binding.myPopup.setOnClickListener {
            val pop =PopupMenu(this, binding.myPopup)
            pop.menuInflater.inflate(R.menu.my_menu, pop.menu)
            pop.setOnMenuItemClickListener {
                when(it.itemId){
                    R.id.myItem1 -> Toast.makeText(this, "Item 1 selected", Toast.LENGTH_SHORT).show()
                    R.id.myItem2 -> Toast.makeText(this, "Item 2 selected", Toast.LENGTH_SHORT).show()
                    R.id.myItem3 -> Toast.makeText(this, "Item 3 selected", Toast.LENGTH_SHORT).show()
                    R.id.myItem4 -> Toast.makeText(this, "Item 4 selected", Toast.LENGTH_SHORT).show()
                }

                true
            }
            pop.show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.my_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.myItem1 -> Toast.makeText(this, "Item 1 selected", Toast.LENGTH_SHORT).show()
            R.id.myItem2 -> Toast.makeText(this, "Item 2 selected", Toast.LENGTH_SHORT).show()
            R.id.myItem3 -> Toast.makeText(this, "Item 3 selected", Toast.LENGTH_SHORT).show()
            R.id.myItem4 -> Toast.makeText(this, "Item 4 selected", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.my_menu, menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.myItem1 -> Toast.makeText(this, "Item 1 selected", Toast.LENGTH_SHORT).show()
            R.id.myItem2 -> Toast.makeText(this, "Item 2 selected", Toast.LENGTH_SHORT).show()
            R.id.myItem3 -> Toast.makeText(this, "Item 3 selected", Toast.LENGTH_SHORT).show()
            R.id.myItem4 -> Toast.makeText(this, "Item 4 selected", Toast.LENGTH_SHORT).show()
        }
        return super.onContextItemSelected(item)
    }
}