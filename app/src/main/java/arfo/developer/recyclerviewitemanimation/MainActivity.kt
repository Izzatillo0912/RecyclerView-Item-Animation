package arfo.developer.recyclerviewitemanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import arfo.developer.recyclerviewitemabimation.databinding.ActivityMainBinding

var animResult1 = false
var animResult2 = true
var animResult3 = true
var animResult4 = true

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val itemList : ArrayList<String> = ArrayList()

        itemList.add("Izzatillo Umarov")
        itemList.add("Izzatillo Umarov")
        itemList.add("Izzatillo Umarov")
        itemList.add("Izzatillo Umarov")
        itemList.add("Izzatillo Umarov")
        itemList.add("Izzatillo Umarov")
        itemList.add("Izzatillo Umarov")
        itemList.add("Izzatillo Umarov")
        itemList.add("Izzatillo Umarov")
        itemList.add("Izzatillo Umarov")
        itemList.add("Izzatillo Umarov")
        itemList.add("Izzatillo Umarov")
        itemList.add("Izzatillo Umarov")
        itemList.add("Izzatillo Umarov")
        itemList.add("Izzatillo Umarov")
        itemList.add("Izzatillo Umarov")
        itemList.add("Izzatillo Umarov")
        itemList.add("Izzatillo Umarov")
        itemList.add("Izzatillo Umarov")
        itemList.add("Izzatillo Umarov")
        itemList.add("Izzatillo Umarov")
        itemList.add("Izzatillo Umarov")
        itemList.add("Izzatillo Umarov")
        itemList.add("Izzatillo Umarov")
        itemList.add("Izzatillo Umarov")
        itemList.add("Izzatillo Umarov")
        itemList.add("Izzatillo Umarov")
        itemList.add("Izzatillo Umarov")
        itemList.add("Izzatillo Umarov")
        itemList.add("Izzatillo Umarov")
        itemList.add("Izzatillo Umarov")
        itemList.add("Izzatillo Umarov")
        itemList.add("Izzatillo Umarov")
        itemList.add("Izzatillo Umarov")
        itemList.add("Izzatillo Umarov")
        itemList.add("Izzatillo Umarov")
        itemList.add("Izzatillo Umarov")
        itemList.add("Izzatillo Umarov")
        itemList.add("Izzatillo Umarov")
        itemList.add("Izzatillo Umarov")
        itemList.add("Izzatillo Umarov")
        itemList.add("Izzatillo Umarov")

        val adapter = Adapter(itemList)
        binding.rv.adapter = adapter
    }
}