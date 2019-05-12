package com.ebartmedia.practiceexerciselvkt2.Local

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import com.ebartmedia.practiceexerciselvkt2.Local.WordDatabase.Companion.DATABASE_VERSION
import com.ebartmedia.practiceexerciselvkt2.Model.Word


@Database(entities = arrayOf(Word::class), version = DATABASE_VERSION)
abstract class WordDatabase:RoomDatabase() {

    abstract fun wordDAO():WordDAO

    companion object {

        const val DATABASE_VERSION = 1
        val DATABASE_NAME = "PracticeExerciseLv2"

        private var mInstance:WordDatabase?=null

        fun getInstance(context:Context):WordDatabase {

            if (mInstance == null)
                mInstance = Room.databaseBuilder(context, WordDatabase::class.java, DATABASE_NAME)
                    .fallbackToDestructiveMigration()
                    .build()

            return mInstance!!
        }
    }

}