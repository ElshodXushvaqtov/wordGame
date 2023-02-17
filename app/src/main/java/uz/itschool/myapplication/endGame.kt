package uz.itschool.myapplication

import android.annotation.SuppressLint
import android.app.ActionBar
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_end_game.*
import kotlinx.android.synthetic.main.activity_main.*

class endGame : AppCompatActivity() {
    @SuppressLint("SetTextI18n", "ResourceAsColor", "ResourceType")
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
                val txtView = TextView(this)
                txtView.id = 1
                txtView.tag = 1
                val orangeParams: LinearLayout.LayoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT
                )
                orangeParams.setMargins(5,0,0,0)
                orangeParams.weight = 1f
                txtView.setPadding(10, 20, 10, 20)
                txtView.layoutParams = orangeParams
                txtView.text = "${endplayer.text}: ${score.text}"
                Log.d("CHSB", "onCreate: ${txtView.text}")
                recordslist.addView(txtView)
        }
        end.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}