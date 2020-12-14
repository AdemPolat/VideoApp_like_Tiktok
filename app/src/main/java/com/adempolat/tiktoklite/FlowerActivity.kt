package com.adempolat.tiktoklite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class FlowerActivity : AppCompatActivity() {

    var arrVideoModel = ArrayList<VideoModel>()
    var videoAdapter:VideoAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flower)

        arrVideoModel.add(VideoModel("Tree with yellow flowers",
            "The branches of a tree wave in the breeze, with pointy leaves and small round flowers, with a clear blue sky and the sun shining in the background.",
            "https://assets.mixkit.co/videos/preview/mixkit-tree-with-yellow-flowers-1173-large.mp4"))

        arrVideoModel.add(VideoModel("Weeds waving in the breeze",
            "Tall dry grass waves in the breeze under a blue sky with white fluffy clouds.",
            "https://assets.mixkit.co/videos/preview/mixkit-weeds-waving-in-the-breeze-1178-large.mp4"))

        arrVideoModel.add(VideoModel("Yellow and white flowers in a tree",
            "White flowers with a yellow center in the branches of a tree with thick branches and green leaves, a blue sky in the background.",
            "https://assets.mixkit.co/videos/preview/mixkit-yellow-and-white-flowers-in-a-tree-1181-large.mp4"))

        arrVideoModel.add(VideoModel("Sun setting or rising over palm trees",
            "The sun sets or rises behind large palm trees, a calm ocean in front of them.",
            "https://assets.mixkit.co/videos/preview/mixkit-sun-setting-or-rising-over-palm-trees-1170-large.mp4"))

        arrVideoModel.add(VideoModel("Purple flowers",
            "Lilac bellflowers move gently in a breeze, a blue sky in the background.",
            "https://assets.mixkit.co/videos/preview/mixkit-purple-flowers-1184-large.mp4"))

        arrVideoModel.add(VideoModel("Leaves under a blue sky",
            "Small green leaves move gently in a breeze, a blue sky in the background.",
            "https://assets.mixkit.co/videos/preview/mixkit-leaves-under-a-blue-sky-1185-large.mp4"))

        arrVideoModel.add(VideoModel("White flowers in the breeze",
            "White flowers with yellow centers move gently in a breeze, a clear blue sky in the background.",
            "https://assets.mixkit.co/videos/preview/mixkit-white-flowers-in-the-breeze-1187-large.mp4"))

        arrVideoModel.add(VideoModel("Small pink flowers",
            "Small pink flowers move gently in a breeze, purple flowers and a blue sky in the background.",
            "https://assets.mixkit.co/videos/preview/mixkit-small-pink-flowers-1186-large.mp4"))

        arrVideoModel.add(VideoModel("Tree branches in the breeze",
            "Leaf covered branches of a tree sway in the breeze, a clear blue sky above.",
            "https://assets.mixkit.co/videos/preview/mixkit-tree-branches-in-the-breeze-1188-large.mp4"))


        arrVideoModel.add(VideoModel("Palm tree in front of the sun",
            "A palm tree stands in water, the sun setting or rising in the background.",
            "https://assets.mixkit.co/videos/preview/mixkit-palm-tree-in-front-of-the-sun-1191-large.mp4"))

        arrVideoModel.add(VideoModel("Pink flowers wave in the breeze",
            "Small pink flowers with yellow centers wave in the breeze, a clear blue sky in the background.",
            "https://assets.mixkit.co/videos/preview/mixkit-pink-flowers-wave-in-the-breeze-1168-large.mp4"))





        videoAdapter = VideoAdapter(arrVideoModel)
        viewPager.adapter = videoAdapter
    }
}