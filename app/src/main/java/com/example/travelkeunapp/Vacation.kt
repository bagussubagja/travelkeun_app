package com.example.travelkeunapp

import android.os.Parcel
import android.os.Parcelable

data class Vacation (
    var name: String? = "",
    var description: String? = "",
    var image: Int? = 0
    ) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readValue(Int::class.java.classLoader) as? Int
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(description)
        parcel.writeValue(image)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Vacation> {
        override fun createFromParcel(parcel: Parcel): Vacation {
            return Vacation(parcel)
        }

        override fun newArray(size: Int): Array<Vacation?> {
            return arrayOfNulls(size)
        }
    }
}