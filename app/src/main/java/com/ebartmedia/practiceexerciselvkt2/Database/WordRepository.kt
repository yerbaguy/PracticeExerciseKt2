package com.ebartmedia.practiceexerciselvkt2.Database

import com.ebartmedia.practiceexerciselvkt2.Model.Word

class WordRepository(private val mLocationDataSource: IWordDataSource):IWordDataSource {


    override fun insertWord(vararg word: Word) {

        mLocationDataSource.insertWord(*word)

    }


    companion object {

        private var mInstance:WordRepository?=null

        fun getInstance(mLocationDataSource: IWordDataSource):WordRepository {

            if (mInstance == null)

                mInstance = WordRepository(mLocationDataSource)

            return mInstance!!
        }
    }

}