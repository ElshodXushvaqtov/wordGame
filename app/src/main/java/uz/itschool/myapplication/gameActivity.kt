package uz.itschool.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_game.*
import kotlinx.android.synthetic.main.activity_main.view.*

var images = ArrayList<itemclass>()
var counter = 0

class GameActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        val message = intent.getStringExtra("UserName")
        user.text = message
        images.add(itemclass(R.drawable.kotlin, "kotlin"))
        images.add(itemclass(R.drawable.java, "java"))
        images.add(itemclass(R.drawable.js, "javascript"))
        images.add(itemclass(R.drawable.python, "python"))
        images.add(itemclass(R.drawable.php, "php"))
        var index = 0
        q.setOnClickListener(this)
        vv.setOnClickListener(this)
        e.setOnClickListener(this)
        r.setOnClickListener(this)
        t.setOnClickListener(this)
        why.setOnClickListener(this)
        u.setOnClickListener(this)
        i.setOnClickListener(this)
        o.setOnClickListener(this)
        p.setOnClickListener(this)
        a.setOnClickListener(this)
        s.setOnClickListener(this)
        d.setOnClickListener(this)
        f.setOnClickListener(this)
        g.setOnClickListener(this)
        h.setOnClickListener(this)
        j.setOnClickListener(this)
        k.setOnClickListener(this)
        l.setOnClickListener(this)
        z.setOnClickListener(this)
        x.setOnClickListener(this)
        c.setOnClickListener(this)
        v.setOnClickListener(this)
        b.setOnClickListener(this)
        n.setOnClickListener(this)
        m.setOnClickListener(this)
        backspace.setOnClickListener {
            itemname.text = itemname.text.dropLast(1)
        }
        apply.setOnClickListener {
            checkword(images[index])
            if (index < images.size) {
                item.setImageResource(images[index++].itemValue)
                itemname.text = ""

            } else {
                index = 0
                item.setImageResource(images[index++].itemValue)
                itemname.text = ""
            }


        }
    }

    @SuppressLint("SetTextI18n")
    override fun onClick(p0: View?) {
        var btn = findViewById<Button>(p0!!.id)
        if (itemname.length() <= 9) {
            itemname.text = itemname.text.toString() + btn.text
        }
    }

    fun checkword(itemclass: itemclass) {
        if (itemname.text == itemclass.itemname) {
            counter++
            count.text = counter.toString()
        }
    }

}