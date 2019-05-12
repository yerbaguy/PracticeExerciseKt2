package com.ebartmedia.practiceexerciselvkt2.Model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import io.reactivex.annotations.NonNull

@Entity(tableName = "word")
class Word {

    @NonNull
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id:Int? = null

    @ColumnInfo(name = "engword")
    var engword:String? = null

    @ColumnInfo(name = "plword")
    var plword:String? = null
}