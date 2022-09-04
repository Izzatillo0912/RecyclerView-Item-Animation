package arfo.developer.recyclerviewitemanimation

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import arfo.developer.recyclerviewitemabimation.R
import arfo.developer.recyclerviewitemabimation.databinding.ItemBinding

class Adapter(private val itemList : ArrayList<String>) : RecyclerView.Adapter<Adapter.ViewHolder>() {

    class ViewHolder(val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root)
    private lateinit var animation: Animation

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = itemList[position]

        if (!animResult1) {
            animResult1 = true
            animResult2 = false
            animResult3 = true
            animResult4 = true
            animation = AnimationUtils.loadAnimation(holder.binding.root.context, R.anim.slide_in)
        }
        else if (!animResult2)  {
            animResult1 = true
            animResult2 = true
            animResult3 = false
            animResult4 = true
            animation = AnimationUtils.loadAnimation(holder.binding.root.context, R.anim.fall_down)
        }
        else if (!animResult3)  {
            animResult1 = true
            animResult2 = true
            animResult3 = true
            animResult4 = false
            animation = AnimationUtils.loadAnimation(holder.binding.root.context, R.anim.rotate_in)
        }
        else if (!animResult4)  {
            animResult1 = false
            animResult2 = true
            animResult3 = true
            animResult4 = true
            animation = AnimationUtils.loadAnimation(holder.binding.root.context, R.anim.scale_up)
        }

        holder.itemView.startAnimation(animation)
        with(holder) {
            binding.textView.text = item
        }
    }

    override fun getItemCount() = itemList.size
}