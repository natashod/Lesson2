package com.natashazahr.lesson2

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Mobil(
    val merk: String?,
    val tahun: Int,
    val plat: String?
): Parcelable  