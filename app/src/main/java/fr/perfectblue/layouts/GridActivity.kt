package fr.perfectblue.layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_grid.*
import org.jetbrains.anko.*

class GridActivity : AppCompatActivity(), AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid)

        toastButton.setOnClickListener {
            toast("Je suis le toast Button")
        }

        mailButton.setOnClickListener {
            email("hello@hello.com", "hello world")
        }

        browseButton.setOnClickListener {
            browse("https://google.fr")
        }

        alertButton.setOnClickListener {
            alert("MESSAGE D'ALERT") {
                yesButton { toast("YES") }
                noButton {  }
            }.show()
        }

        shareButton.setOnClickListener {
            share("www.google.fr")
        }

    }


}
