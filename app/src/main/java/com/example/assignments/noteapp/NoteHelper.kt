package com.example.assignments.noteapp

import android.content.Context
import androidx.room.Room

class NoteHelper {
    companion object{
        fun getDatabaseObject(context: Context) : NoteDatabase{
            val db : NoteDatabase = Room.databaseBuilder(context, NoteDatabase::class.java, "NoteDatabase")
                .allowMainThreadQueries()
                .build()
            return db
        }
    }
}