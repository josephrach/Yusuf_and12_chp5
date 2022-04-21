package com.example.game_suit_chp4.data

import android.os.Parcel
import android.os.Parcelable

data class MainGameData(var pemenang: String): Parcelable {
    constructor(parcel: Parcel) : this(parcel.readString().toString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(pemenang)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MainGameData> {
        override fun createFromParcel(parcel: Parcel): MainGameData {
            return MainGameData(parcel)
        }

        override fun newArray(size: Int): Array<MainGameData?> {
            return arrayOfNulls(size)
        }
    }

}