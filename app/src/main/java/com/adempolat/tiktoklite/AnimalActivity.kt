package com.adempolat.tiktoklite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class AnimalActivity : AppCompatActivity() {

    var arrVideoModel = ArrayList<VideoModel>()
    var videoAdapter:VideoAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal)

        arrVideoModel.add(VideoModel("Multicolor frog closing its eyes, closeup shot",
            "Multicolor frog closing its eyes on a trunk at nature, closeup shot. Animal closeup, little frog, toad, anuran, amphibian. Vertical video of a frog.",
            "https://assets.mixkit.co/videos/preview/mixkit-multicolor-frog-closing-its-eyes-closeup-shot-1468-large.mp4"))

        arrVideoModel.add(VideoModel("Panting dog",
            "A brown and white dog pants and sticks its tongue out.",
            "https://assets.mixkit.co/videos/preview/mixkit-panting-dog-1548-large.mp4"))

        arrVideoModel.add(VideoModel("Woman petting a cat",
            "A woman sits in a yellow chair inside a home, petting a black cat that sits on her lap.",
            "https://assets.mixkit.co/videos/preview/mixkit-woman-petting-a-cat-1542-large.mp4"))

        arrVideoModel.add(VideoModel("Video of a cat played four times with different colored backgrounds",
            "Video of a white and black cat flipping to various sides, placed four times in the shot with backgrounds of different colors such as pink, purple, green and blue.",
            "https://assets.mixkit.co/videos/preview/mixkit-video-of-a-cat-played-four-times-with-different-colored-13784-large.mp4"))

        arrVideoModel.add(VideoModel("Dog standing on a log",
            "A brown and white collie stand still on a log, then jumps off.",
            "https://assets.mixkit.co/videos/preview/mixkit-dog-standing-on-a-log-1555-large.mp4"))

        arrVideoModel.add(VideoModel("White cat with blue eyes",
            "Closeup shot of a white cat with deep blue eyes.",
            "https://assets.mixkit.co/videos/preview/mixkit-white-cat-with-blue-eyes-1545-large.mp4"))

        arrVideoModel.add(VideoModel("Black cat in a cat house",
            "A black cat with green eyes gazes out from its cat house.",
            "https://assets.mixkit.co/videos/preview/mixkit-black-cat-in-a-cat-house-1541-large.mp4"))





        videoAdapter = VideoAdapter(arrVideoModel)
        viewPager.adapter = videoAdapter
    }
}