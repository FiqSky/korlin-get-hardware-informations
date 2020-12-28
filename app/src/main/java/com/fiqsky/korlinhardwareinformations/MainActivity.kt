package com.fiqsky.korlinhardwareinformations

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initListeners()
    }

    private fun initListeners(){
        btnGetInfo.setOnClickListener {
            val information = getHardwareAndSoftwareInfo()

            textViewSetInformation.text = information.toString()
            Log.d("TAG", "initListeners: " + getHardwareAndSoftwareInfo())
        }
    }

    @SuppressLint("HardwareIds")
    fun getHardwareAndSoftwareInfo() {
        getString(R.string.serial) + "" + Build.SERIAL  + "\n" +
        getString(R.string.model) + " " + Build.MODEL + "\n" +
        getString(R.string.model) + " " + Build.MODEL + "\n" +
        getString(R.string.id) + " " + Build.ID + "\n" +
        getString(R.string.manufacturer) + " " + Build.MANUFACTURER + "\n" +
        getString(R.string.brand) + " " + Build.BRAND + "\n" +
        getString(R.string.type) + " " + Build.TYPE + "\n" +
        getString(R.string.user) + " " + Build.USER + "\n" +
        getString(R.string.base) + " " + Build.VERSION_CODES.BASE + "\n" +
        getString(R.string.incremental) + " " + Build.VERSION.INCREMENTAL + "\n" +
        getString(R.string.sdk) + " " + Build.VERSION.SDK + "\n" +
        getString(R.string.board) + " " + Build.BOARD + "\n" +
        getString(R.string.host) + " " + Build.HOST + "\n" +
        getString(R.string.fingerprint) + " " + Build.FINGERPRINT + "\n" +
        getString(R.string.versioncode) + " " + Build.VERSION.RELEASE
    }
}