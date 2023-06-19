package com.example.quicknotes.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.quicknotes.entities.Notes;

import java.util.List;

@Dao
public interface Notesdao {

    @Query("SELECT * FROM notes ORDER BY id DESC")
    List<Notes> getNotes();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertNote(Notes notes);

    @Delete
    void deleteNote(Notes notes);
}
