package au.edu.swin.sdmd.w07_books

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class Adapter(private val books: List<Book>) : RecyclerView.Adapter<Adapter.ViewHolder>()  {

    //Create View Holder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        //set up the cells in the layout row file to show the data in the array
        val view = layoutInflater
            .inflate(R.layout.book_layout, parent, false) as View
        return ViewHolder(view)
    }

    //Get data count
    override fun getItemCount() = books.size

    //Bind adapter and viewHolder to the data position
    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        val item = books[position]
        holder.bind(item)
    }

    //Set view with click listener
    inner class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        //Set number view created on activity_row file TextView
        private val image = view.findViewById<ImageView>(R.id.imageView)
        private val title = view.findViewById<TextView>(R.id.bookTittle)
        private val rating = view.findViewById<RatingBar>(R.id.ratingBar)

        fun bind(item: Book) {
            title.text = item.name
            rating.rating = item.score
            val bookImage = view.context.resources.getIdentifier(item.image ,
                "drawable", view.context.packageName)
            image.setImageResource(bookImage)
        }

    }
}