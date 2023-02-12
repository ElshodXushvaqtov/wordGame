package uz.itschool.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
val message=username.text.toString()
        next.setOnClickListener {
            val intent=Intent(this,GameActivity::class.java)
               intent.putExtra("UserName",message)
            startActivity(intent)
        }

    }
}