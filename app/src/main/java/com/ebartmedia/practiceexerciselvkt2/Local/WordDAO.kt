package com.ebartmedia.practiceexerciselvkt2.Local

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import com.ebartmedia.practiceexerciselvkt2.Model.Word

@Dao
interface WordDAO {


    @Insert
    fun insertWord(vararg words: Word)

}