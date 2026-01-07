package com.example.writo.Room

import android.app.Application
import androidx.room.Room
import androidx.room.RoomDatabase

class MainApplication : Application() {

    companion object{
        lateinit var todoDatabase: TodoDatabase
    }

    override fun onCreate() {
        super.onCreate()
        todoDatabase = Room.databaseBuilder(
            applicationContext ,
            TodoDatabase::class.java ,
            TodoDatabase.NAME
        ).build()
    }

}