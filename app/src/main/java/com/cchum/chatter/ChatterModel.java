package com.cchum.chatter;

import android.graphics.Bitmap;

/**
 * Created by fredicruz on 9/5/2015.
 */
public class ChatterModel {
    public String mChat;
    public String mUserName;
    public String mPostDate;
    public Bitmap mProfileImg;

    public ChatterModel(String name, String chat, String date, Bitmap bitmap){
        this.mChat = name;
        this.mUserName = chat;
        this.mProfileImg = bitmap;
        this.mPostDate = date;
    }

    public String getChat(){
        return mChat;
    }

    public String getPostDAte(){ return mPostDate; }

    public String getUserName(){
        return mUserName;
    }

    public Bitmap getBitmap(){
        return mProfileImg;
    }

}
