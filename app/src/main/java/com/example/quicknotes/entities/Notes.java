package com.example.quicknotes.entities;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "notes")
public class Notes implements Serializable {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "titles")
    private String title;

    @ColumnInfo(name = "datetime")
    private String datetime;

    @ColumnInfo(name="notecontents")
    private String notetextcontent;

    @ColumnInfo(name = "img_path")
    private String imgpath;

    @ColumnInfo(name="weblinks")
    private String weblinks;

    public String getWeblinks() {
        return weblinks;
    }

    public void setWeblinks(String weblinks) {
        this.weblinks = weblinks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getNotetextcontent() {
        return notetextcontent;
    }

    public void setNotetextcontent(String notetextcontent) {
        this.notetextcontent = notetextcontent;
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

    @NonNull
    @Override
    public String toString() {
        return title+ " : "+datetime;
    }
}
