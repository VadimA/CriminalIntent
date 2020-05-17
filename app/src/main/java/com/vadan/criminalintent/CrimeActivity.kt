package com.vadan.criminalintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vadan.criminalintent.domain.Crime
import com.vadan.criminalintent.fragment.CrimeFragment

class CrimeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crime)
        val crime = Crime()

        val fragmentManager = supportFragmentManager
        var crimeFragment = fragmentManager.findFragmentById(R.id.fragment_container)

        if (crimeFragment == null)
            crimeFragment = CrimeFragment()

        fragmentManager.beginTransaction().add(R.id.fragment_container, crimeFragment).commit()

    }
}
