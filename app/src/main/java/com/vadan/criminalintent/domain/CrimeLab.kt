package com.vadan.criminalintent.domain

import java.util.*

object CrimeLab {
    private val mCrimes: MutableList<Crime> = arrayListOf()

    init {
        for (i in 1..100) {
            val crime: Crime = Crime();
            crime.mTitle = "Crime #$i"
            crime.mSolved = (i % 2 == 0)
            mCrimes.add(crime)
        }
    }

    fun getCrime(id: UUID): Crime? {
        return mCrimes.find { id == it.mId }
    }
}