package com.ebartmedia.practiceexerciselvkt2.Local

import com.ebartmedia.practiceexerciselvkt2.Database.IWordDataSource
import com.ebartmedia.practiceexerciselvkt2.Model.Word

class WordDataSource(private val wordDAO: WordDAO):IWordDataSource {

    override fun insertWord(vararg word: Word) {



        wordDAO.insertWord(*word )
    }


    companion object {

        private var mInstance:WordDataSource?=null

        fun getInstance(wordDAO: WordDAO):WordDataSource {

            if (mInstance == null)

                mInstance = WordDataSource(wordDAO)

            return mInstance!!
        }
    }
}