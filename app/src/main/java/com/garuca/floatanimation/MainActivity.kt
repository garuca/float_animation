package com.garuca.floatanimation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.animation.AnimationUtils

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        setup()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
    fun setup(){
        switch_rotate.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked)  {
                turnOfAll(switch_rotate)
                val animation = AnimationUtils.loadAnimation(this@MainActivity, R.anim.rotate)
                fab.startAnimation(animation)

            } else{
                fab.animation = null
            }
        }
        switch_translaste.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked)  {
                turnOfAll(switch_translaste)
                val animation = AnimationUtils.loadAnimation(this@MainActivity, R.anim.translate)
                fab.startAnimation(animation)

            } else{
                fab.animation = null
            }
        }
        switch_scale.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked)  {
                turnOfAll(switch_scale)
                val animation = AnimationUtils.loadAnimation(this@MainActivity, R.anim.scale)
                fab.startAnimation(animation)

            } else{
                fab.animation = null
            }
        }
        switch_alpha.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked)  {
                turnOfAll(switch_alpha)
                val animation = AnimationUtils.loadAnimation(this@MainActivity, R.anim.alpha)
                fab.startAnimation(animation)

            } else{
                fab.animation = null
            }
        }
        switch_shake.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked)  {
                turnOfAll(switch_shake)
                val animation = AnimationUtils.loadAnimation(this@MainActivity, R.anim.shake)
                fab.startAnimation(animation)

            } else{
                fab.animation = null
            }
        }

    }

    private fun turnOfAll(view:View){
        if (view != switch_rotate)
            switch_rotate.isChecked = false

        if (view != switch_translaste)
            switch_translaste.isChecked = false

        if (view != switch_scale)
            switch_scale.isChecked = false

        if (view != switch_alpha)
            switch_alpha.isChecked = false

        if (view != switch_shake)
            switch_shake.isChecked = false
    }

}
