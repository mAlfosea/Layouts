package fr.perfectblue.layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_card.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.browse
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity(), AnkoLogger {

    private var likeState: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cardLikeButton.setOnClickListener {
            this.toggleLike()
        }

        cardWebButton.setOnClickListener {
            browse("https://www.pokepedia.fr/Carapuce")
        }
    }

    private fun toggleLike() {
        if (this.likeState) {
            cardLikeButton.setBackgroundResource(R.drawable.ic_like_idle)
            this.likeState = false
            toast("Retiré des favoris")
        } else {
            cardLikeButton.setBackgroundResource(R.drawable.ic_like_clicked)
            this.likeState = true
            toast("Ajouté aux favoris")
        }
    }
}
