package id.ac.polbeng.samuel.viewdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.ac.polbeng.samuel.viewdata.databinding.ActivityDetailBuahBinding

class DetailBuahActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBuahBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBuahBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // menangkap data dari intent
        var namaBuah = intent.getStringExtra("nama")
        var image = intent.getIntExtra("gambar", 0)

        // menampilkan data ke layout
        binding.tvNamaBuah.text = namaBuah
        binding.imgBuah.setImageResource(image)
    }
}