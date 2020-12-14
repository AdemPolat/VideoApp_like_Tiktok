package com.adempolat.tiktoklite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class LifeActivity : AppCompatActivity() {

    var arrVideoModel = ArrayList<VideoModel>()
    var videoAdapter:VideoAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life)

        arrVideoModel.add(VideoModel("Old street at night",
            "Avenue at night with old buildings, while cars pass with their lights on, and people walking on the sidewalk.",
            "https://assets.mixkit.co/videos/preview/mixkit-old-street-at-night-3456-large.mp4"))

        arrVideoModel.add(VideoModel("Woman sitting reading in pajamas",
            "Woman sitting on her back holding a book she is reading, while turning the page, has red painted nails, and blonde hair.",
            "https://assets.mixkit.co/videos/preview/mixkit-woman-sitting-reading-in-pajamas-4950-large.mp4"))

        arrVideoModel.add(VideoModel("Anti-virus control staff disinfects public park",
            "Person in anti-virus safety clothing, with gloves, gas mask, glasses, while disinfecting the swings in a park on a sunny day.",
            "https://assets.mixkit.co/videos/preview/mixkit-anti-virus-control-staff-disinfects-public-park-5151-large.mp4"))

        arrVideoModel.add(VideoModel("Pipes of an organ high up in a church",
            "Pipes from a church organ on a wooden cabinet near the pink ceiling.",
            "https://assets.mixkit.co/videos/preview/mixkit-pipes-of-an-organ-high-up-in-a-church-22725-large.mp4"))








        videoAdapter = VideoAdapter(arrVideoModel)
        viewPager.adapter = videoAdapter
    }
}