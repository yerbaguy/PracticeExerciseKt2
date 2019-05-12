package com.ebartmedia.practiceexerciselvkt2.Database

import com.ebartmedia.practiceexerciselvkt2.Model.Word


interface IWordDataSource {

    fun insertWord(vararg word: Word)
}