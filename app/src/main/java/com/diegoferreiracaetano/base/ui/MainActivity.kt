package com.diegoferreiracaetano.base.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.diegoferreiracaetano.base.R
import com.diegoferreiracaetano.base.ui.main.MainFragment
import dagger.android.support.DaggerAppCompatActivity

class MainActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow()
        }
    }

}
