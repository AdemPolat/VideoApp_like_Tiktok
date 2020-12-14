package com.adempolat.tiktoklite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class SkyActivity : AppCompatActivity() {

    var arrVideoModel = ArrayList<VideoModel>()
    var videoAdapter:VideoAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sky)

        arrVideoModel.add(VideoModel("Paddleboarder",
            "A person paddle boarding, one bird flying across the clear sky in the background.",
            "https://assets.mixkit.co/videos/preview/mixkit-paddleboarder-1166-large.mp4"))

        arrVideoModel.add(VideoModel("Sun over hills",
            "The sun sets or rises over hills, a body of water beneath them.",
            "https://assets.mixkit.co/videos/preview/mixkit-sun-over-hills-1183-large.mp4"))

        arrVideoModel.add(VideoModel("Leaves under a blue sky",
            "Small green leaves move gently in a breeze, a blue sky in the background.",
            "https://assets.mixkit.co/videos/preview/mixkit-leaves-under-a-blue-sky-1185-large.mp4"))

        arrVideoModel.add(VideoModel("Close view to the limit of a mountain summit",
            "Slopes near the limit of a Canadian mountain summit with snow and pine trees on a sunny day, as tourists ski and the cliff is covered by clouds.",
            "https://assets.mixkit.co/videos/preview/mixkit-close-view-to-the-limit-of-a-mountain-summit-3354-large.mp4"))

        arrVideoModel.add(VideoModel("Clouds in the sky flowing with the wind",
            "Clouds in the sky moving and flowing with the wind, with the sky in the background turquoise blue, and the clouds navy blue.",
            "https://assets.mixkit.co/videos/preview/mixkit-clouds-in-the-sky-flowing-with-the-wind-21584-large.mp4"))









        videoAdapter = VideoAdapter(arrVideoModel)
        viewPager.adapter = videoAdapter
    }
}