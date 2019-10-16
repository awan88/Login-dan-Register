package awan.dev.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        Handler().postDelayed({
            startActivity(Intent(this@Home, MainActivity::class.java))
            finish()
        },4000)
    }
}
