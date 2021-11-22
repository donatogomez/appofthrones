package donatogomez.com.appofthrones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val id = intent.getStringExtra("key_id")

        if (savedInstanceState == null) {
            val fragment = id?.let { DetailFragment.newInstance(it) }

            if (fragment != null) {
                supportFragmentManager
                    .beginTransaction()
                    .add(R.id.detailContainer, fragment)
                    .commit()
            }
        }
    }
}