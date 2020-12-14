package com.adempolat.tiktoklite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MusicActivity : AppCompatActivity() {

    var arrVideoModel = ArrayList<VideoModel>()
    var videoAdapter:VideoAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_music)

        arrVideoModel.add(VideoModel("Wooden neck of an electric guitar",
            "Wooden neck of a six-string electric guitar on a gray background.",
            "https://assets.mixkit.co/videos/preview/mixkit-wooden-neck-of-an-electric-guitar-2425-large.mp4"))

        arrVideoModel.add(VideoModel("Guitarist playing a guitar",
            "Guitarist with tattoos on his hand and a leopard textured jacket is playing an electric guitar",
            "https://assets.mixkit.co/videos/preview/mixkit-guitarist-playing-a-guitar-3282-large.mp4"))

        arrVideoModel.add(VideoModel("Man playing drums with sepia filter",
            "Man playing the drums of a battery, seen from near and behind him, with sepia filter.",
            "https://assets.mixkit.co/videos/preview/mixkit-man-playing-drums-with-sepia-filter-3610-large.mp4"))

        arrVideoModel.add(VideoModel("Pop-rock band performing a song",
            "Pop-rock band performing a song with a guitarist and a drummer.",
            "https://assets.mixkit.co/videos/preview/mixkit-pop-rock-band-performing-a-song-5121-large.mp4"))

        arrVideoModel.add(VideoModel("Man with dark glasses and hat while tuning his banjo",
            "Young man wearing sunglasses, a flashy shirt and brown hat, as he sharpens his banjo, with an artistically sculpted relief wall in the background.",
            "https://assets.mixkit.co/videos/preview/mixkit-man-with-dark-glasses-and-hat-while-tuning-his-banjo-13760-large.mp4"))

        arrVideoModel.add(VideoModel("Young woman in sunglasses playing inspired guitar",
            "Young woman wearing sunglasses, and a striking baggy top, inspired acoustic guitar playing, with some plants behind her.",
            "https://assets.mixkit.co/videos/preview/mixkit-young-woman-in-sunglasses-playing-inspired-guitar-13758-large.mp4"))

        videoAdapter = VideoAdapter(arrVideoModel)
        viewPager.adapter = videoAdapter
    }
}