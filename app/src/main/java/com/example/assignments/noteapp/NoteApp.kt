package com.example.assignments.noteapp

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.assignments.databinding.ActivityNoteAppBinding

class NoteApp : AppCompatActivity() {
    lateinit var binding: ActivityNoteAppBinding
    lateinit var list: List<Note>
    lateinit var dao : NoteDao
    lateinit var adapter : ArrayAdapter<Note>
    var bool = false
    var noteList : Note? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNoteAppBinding.inflate(layoutInflater)
        setContentView(binding.root)

        list = ArrayList()

        dao = NoteHelper.getDatabaseObject(this).getDao()
        refresh()
        binding.btnNote.setOnClickListener {
            val title = binding.notTitle.text.toString()
            val desc = binding.notDesc.text.toString()

            if (bool){
                noteList?.title = title
                noteList?.desc = desc

                dao.updateNote(noteList!!)
            }else{
                val note = Note(title, desc)
                dao.insterNote(note)
            }

            refresh()
            clean()
            bool = false
            binding.btnNote.text = "Add"
            //Toast.makeText(this, "Data Added", Toast.LENGTH_SHORT).show()
        }
        binding.noteList.setOnItemClickListener { adapterView, view, pos, l ->
            val note = list[pos]

            val builder =AlertDialog.Builder(this)
            builder.setTitle("Choose One")
            builder.setPositiveButton("Update", DialogInterface.OnClickListener { dialogInterface, i ->

                bool = true
                binding.notTitle.setText(note.title)
                binding.notDesc.setText(note.desc)
                binding.btnNote.text = "Update"
                noteList = note

            })
            builder.setNegativeButton("Delete", DialogInterface.OnClickListener { dialogInterface, i -> 
                AlertDialog.Builder(this)
                    .setTitle("Are you sure you want to delete this data?")
                    .setPositiveButton("Yes", DialogInterface.OnClickListener { dialogInterface, i -> 
                        dao.deleteNote(note)
                        refresh()
                    }).setNegativeButton("No", DialogInterface.OnClickListener { dialogInterface, i ->
                        dialogInterface.dismiss()
                    }).create().show()
            })
            builder.create()
            builder.show()
        }

    }

    private fun refresh() {
        list = dao.showNote()
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, list)

        binding.noteList.adapter = adapter
    }

    private fun clean() {
        binding.notTitle.setText("")
        binding.notDesc.setText("")
    }
}