package au.edu.swin.sdmd.w07_books

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //List of 100 numbers
        val books = listOf(
            Book("Atomic Habits", 5.0F, "atomic_habits"),
            Book("The Alchemist", 4.0F, "the_alchemist"),
            Book("The Subtle Art Of Not Giving a F*ck", 3.0F, "the_subtle"),
            Book("Think Like a Monk", 3.0F,"think_like_a_monk")
        )


        val listOfBooks = findViewById<RecyclerView>(R.id.bookList)

        listOfBooks.adapter = Adapter(books)
        listOfBooks.layoutManager = LinearLayoutManager(this)

    }

}