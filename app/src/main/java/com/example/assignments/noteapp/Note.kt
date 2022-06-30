package com.example.assignments.noteapp

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note (
    @ColumnInfo(name = "title")
    var title:String,
    @ColumnInfo(name = "description")
    var desc: String,
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0)  {
    override fun toString(): String {
        return "Title  = $title\nDescription = $desc"
    }
}