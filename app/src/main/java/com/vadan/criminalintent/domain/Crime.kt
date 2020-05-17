package com.vadan.criminalintent.domain

import java.util.*


data class Crime(
    val mId: UUID = UUID.randomUUID(),
    var mTitle: String = "",
    var mDate: Date = Date(),
    var mSolved: Boolean = false
) {
}