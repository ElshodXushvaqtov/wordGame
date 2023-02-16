package uz.itschool.myapplication

import android.annotation.SuppressLint
import android.app.ActionBar
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_end_game.*
import kotlinx.android.synthetic.main.activity_main.*

class endGame : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end_game)
        var records = ArrayList<String>()
        var s = 0
        val point = intent.getStringExtra("Score")
        val name = intent.getStringExtra("player")
        score.text = point
        endplayer.text = name
        save.setOnClickListener {
            Toast.makeText(applicationContext, "Saqlandi", Toast.LENGTH_SHORT).show()
            records.add(counter.toString())
            var record = TextView(this)
            record.text = "${endplayer.text}: ${score.text}"
            Log.d("CHSB", "onCreate: ${record.text}")
            record.width = 100
            record.height = 100
            recordslist.addView(record)
        }
        end.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}