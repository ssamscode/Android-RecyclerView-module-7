package id.ac.polbeng.samuel.viewdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import id.ac.polbeng.samuel.viewdata.databinding.ActivityRecylerBinding

class RecylerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRecylerBinding

    // deklarasi data buah
    var dataBuah = arrayOf(
        "Alpukat",
        "Durian",
        "Jambu Air",
        "Manggis",
        "Strawberry"
    )

    // deklarasi gambar buah
    var dataGambar = arrayOf(
        R.drawable.alpukat,
        R.drawable.durian,
        R.drawable.jambuair,
        R.drawable.manggis,
        R.drawable.strawberry
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRecylerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // custom adapter
        val adapter = BuahAdapter(this, dataBuah, dataGambar)

        // layout manager
        val layoutManager = LinearLayoutManager(applicationContext)

        // tampilkan recyclerview
        binding.recylerView.adapter = adapter
        binding.recylerView.layoutManager = layoutManager
    }
}