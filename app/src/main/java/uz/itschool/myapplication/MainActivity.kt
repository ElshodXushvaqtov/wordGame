package uz.itschool.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        next.setOnClickListener {
            if(username.text.toString()!="") {
                val message = username.text.toString()
                val intent = Intent(this, GameActivity::class.java)
                intent.putExtra("UserName", message)
                startActivity(intent)
            }
            else{
                Toast.makeText(applicationContext,"Ismingizni kiriting",Toast.LENGTH_SHORT+1000).show()
            }
        }

    }
}