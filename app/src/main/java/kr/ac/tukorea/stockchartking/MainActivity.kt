package kr.ac.tukorea.stockchartking

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var button1: Button
    lateinit var button2: Button
    lateinit var button3: Button
    lateinit var button4: Button
    lateinit var button5: Button
    lateinit var button6: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1 = findViewById<Button>(R.id.button1)
        button2 = findViewById<Button>(R.id.button4)
        button3 = findViewById<Button>(R.id.button3)
        button4 = findViewById<Button>(R.id.button2)
        button5 = findViewById<Button>(R.id.button5)
        button6 = findViewById<Button>(R.id.button6)

        button1.setOnClickListener {
            val mIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/channel/UC9KQaCA_EMobJUxZszQ4wlg")
            )
            startActivity(mIntent)

        }
        button2.setOnClickListener {
            val mIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://bj.afreecatv.com/sweet31w"))
            startActivity(mIntent)
        }

        button3.setOnClickListener {
            val mIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://cafe.naver.com/852hodoo"))
            startActivity(mIntent)
        }

        button4.setOnClickListener {
            val mIntent =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://mobile.twitter.com/852hodoo2"))
            startActivity(mIntent)
        }

        button5.setOnClickListener {
            val mIntent =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://toon.at/donate/636967153344165714"))
            startActivity(mIntent)
        }

        button6.setOnClickListener {
            val mIntent =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=XcWgpY-rk90"))
            startActivity(mIntent)
        }
    }
}