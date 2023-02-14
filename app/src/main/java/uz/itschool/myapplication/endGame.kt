package uz.itschool.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_end_game.*

class endGame : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end_game)
        var message=intent.getIntExtra("Score",1)
        score.text=message.toString()
        save.setOnClickListener {
            Toast.makeText(applicationContext,"Saqlandi",Toast.LENGTH_SHORT).show()
        }
    }
}