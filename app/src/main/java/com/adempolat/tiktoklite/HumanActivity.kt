package com.adempolat.tiktoklite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class HumanActivity : AppCompatActivity() {

    var arrVideoModel = ArrayList<VideoModel>()
    var videoAdapter:VideoAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_human)

        arrVideoModel.add(VideoModel("Abstract image of a man with rays coming out of his eyes",
            "Conceptual video of the image of a man in black and white, wearing a shirt and suspenders, with yellow rays coming out of his eyes.",
            "https://assets.mixkit.co/videos/preview/mixkit-abstract-image-of-a-man-with-rays-coming-out-of-32692-large.mp4"))

        arrVideoModel.add(VideoModel("Woman in a floral shirt dancing",
            "Woman with tattoos, at a fate, dancing at night at a festival.",
            "https://assets.mixkit.co/videos/preview/mixkit-woman-in-a-floral-shirt-dancing-1228-large.mp4"))

        arrVideoModel.add(VideoModel("Women taking photos on a balcony",
            "Women dressed in black with sunglasses taking pictures on a balcony with the city in the background.",
            "https://assets.mixkit.co/videos/preview/mixkit-women-taking-photos-on-a-balcony-3191-large.mp4"))

        arrVideoModel.add(VideoModel("Two boyfriends chat on the rooftop in a city",
            "Two men dressed in casual fashion chat on the roof of a building during the day.",
            "https://assets.mixkit.co/videos/preview/mixkit-two-boyfriends-chat-on-the-rooftop-in-a-city-3203-large.mp4"))








        videoAdapter = VideoAdapter(arrVideoModel)
        viewPager.adapter = videoAdapter
    }
}