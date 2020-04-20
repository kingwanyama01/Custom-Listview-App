package com.king.myfirstcustomlistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var users:ArrayList<Item> = ArrayList()

        //Start adding items to your arraylist
        users.add(Item(R.drawable.imgone,"King","0700234567"))
        users.add(Item(R.drawable.imgthree,"Immanuel","0700234567"))
        users.add(Item(R.drawable.imgtwo,"Jedida","0700234567"))
        users.add(Item(R.drawable.imgfour,"Nicole","0700234567"))
        users.add(Item(R.drawable.imgfive,"Esther","0700234567"))
        users.add(Item(R.drawable.imgsix,"Penalope","0700234567"))
        users.add(Item(R.drawable.imgseven,"Matilda","0700234567"))
        users.add(Item(R.drawable.imgeight,"Celine","0700234567"))
        users.add(Item(R.drawable.imgone,"Anthony","0700234567"))
        users.add(Item(R.drawable.imgtwo,"Brian","0700234567"))
        users.add(Item(R.drawable.imgthree,"Joseph","0700234567"))
        users.add(Item(R.drawable.imgfour,"Abdul","0700234567"))
        users.add(Item(R.drawable.imgfive,"Jeremy","0700234567"))
        users.add(Item(R.drawable.imgsix,"Israel","0700234567"))
        users.add(Item(R.drawable.imgseven,"Fortune","0700234567"))
        users.add(Item(R.drawable.imgeight,"Duncan","0700234567"))
        users.add(Item(R.drawable.imgone,"barack","0700234567"))

        mListContacts.adapter = CustomAdapter(applicationContext,users)
    }
}
