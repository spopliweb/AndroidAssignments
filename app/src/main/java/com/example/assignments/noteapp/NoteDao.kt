package com.example.assignments.noteapp

import androidx.room.*

@Dao
interface NoteDao {
    //Dao -Data Access Object
    //In mySql each and every row is define as Dao

    @Insert
    fun insterNote (note: Note)

    @Delete
    fun deleteNote(note: Note)

    @Update
    fun updateNote(note: Note)

    @Query("select * from Note")
    fun showNote() : List<Note>

    @Query("select * from Note where `id` = :key")
    fun getSelectedRow(key : Int) : Note

    @Query("update Note set title=:title, description= :desc where `id` = :key ")
    fun updateOneRow(title: String, desc :String, key : Int)

    @Query("delete from Note where `id` = :key")
    fun deleteOneRow(key : Int)
}