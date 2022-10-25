package com.example.job18bowo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

import com.example.job18bowo.R
import com.example.job18bowo.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    lateinit var toggle: ActionBarDrawerToggle
    lateinit var drawer: DrawerLayout
    lateinit var navView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navView = findViewById(R.id.nav_view)
        drawer = findViewById(R.id.layout_gambar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.title = "NAVIGASI_DRAWER 18"

        toggle = ActionBarDrawerToggle(
            this@MainActivity, drawer,
            0, 0
        )

        drawer.addDrawerListener(toggle)
        toggle.syncState()

        navView.setNavigationItemSelectedListener(this)

    }

    override fun onOptionsItemSelected(item: android.view.MenuItem): Boolean {
        return toggle.onOptionsItemSelected(item)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.profil -> {
                val ProfilMurid = supportFragmentManager.beginTransaction()
                ProfilMurid.replace(R.id.content, ProfilMurid())
                ProfilMurid.commit()
                drawer.close()
            }
            R.id.home -> {
                val Home = supportFragmentManager.beginTransaction()
                Home.replace(R.id.content, Home())
                Home.commit()
                drawer.close()
            }
            R.id.busana -> {
                val Busana = supportFragmentManager.beginTransaction()
                Busana.replace(R.id.content, busana())
                Busana.commit()
                drawer.close()
            }
            R.id.kuliner -> {
                val Kuliner = supportFragmentManager.beginTransaction()
                Kuliner.replace(R.id.content, Kuliner())
                Kuliner.commit()
                drawer.close()
            }
            R.id.pplg -> {
                val Pplg = supportFragmentManager.beginTransaction()
                Pplg.replace(R.id.content, Pplg())
                Pplg.commit()
                drawer.close()
            }
            R.id.to -> {
                val To = supportFragmentManager.beginTransaction()
                To.replace(R.id.content, To())
                To.commit()
                drawer.close()
            }
            R.id.tpfl -> {
                val Tpfl = supportFragmentManager.beginTransaction()
                Tpfl.replace(R.id.content, Tpfl())
                Tpfl.commit()
                drawer.close()
            }
        }
        return true
    }
}