package com.example.quicknotes.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.quicknotes.dao.Notesdao;
import com.example.quicknotes.entities.Notes;

@Database(entities = Notes.class, version = 1, exportSchema = false)
public abstract class NotesDatabase extends RoomDatabase {

    private static NotesDatabase notesDatabase;

    public static synchronized NotesDatabase getDatabase(Context context){
        if(notesDatabase== null){
            notesDatabase= Room.databaseBuilder(
                    context,
                    NotesDatabase.class,
                    "notesdb"
            ).build();
        }
        return notesDatabase;
    }

    public abstract Notesdao notesdao();

}
