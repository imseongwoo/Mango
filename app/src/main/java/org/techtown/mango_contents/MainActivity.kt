package org.techtown.mango_contents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val items = mutableListOf<ContentsModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        items.add(
            ContentsModel(
                "http://www.mangoplate.com/restaurants/JYZYNprzM8",
                "https://mp-seoul-image-production-s3.mangoplate.com/37208_1635255570619739.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "고추만두국집"

            )
        )
        items.add(
            ContentsModel(
                "http://www.mangoplate.com/restaurants/JYZYNprzM8",
                "https://mp-seoul-image-production-s3.mangoplate.com/37208_1635255570619739.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "고추만두국집"

            )
        )

        items.add(
            ContentsModel(
                "http://www.mangoplate.com/restaurants/JYZYNprzM8",
                "https://mp-seoul-image-production-s3.mangoplate.com/37208_1635255570619739.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "고추만두국집"

            )
        )


        val recyclerView = findViewById<RecyclerView>(R.id.rv)      // 메인 리사이클러뷰
        val rvAdapter = RVAdapter(baseContext,items)
        recyclerView.adapter = rvAdapter

        recyclerView.layoutManager = GridLayoutManager(this,2)

    }
}