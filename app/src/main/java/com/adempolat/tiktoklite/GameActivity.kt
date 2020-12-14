package com.adempolat.tiktoklite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class GameActivity : AppCompatActivity() {

    var arrVideoModel = ArrayList<VideoModel>()
    var videoAdapter:VideoAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        arrVideoModel.add(VideoModel("Footballer headbutting the ball",
            "Footballer playing with the ball with his head on an urban court at night.",
            "https://assets.mixkit.co/videos/preview/mixkit-footballer-headbutting-the-ball-2923-large.mp4"))

        arrVideoModel.add(VideoModel("Soccer football player tries an overhead kick",
            "Soccer football player wearing sports uniform receives the ball with the chest and tries an overhead kick.",
            "https://assets.mixkit.co/videos/preview/mixkit-soccer-football-player-tries-an-overhead-kick-2915-large.mp4"))

        arrVideoModel.add(VideoModel("Man playing with a tower of poker chips",
            "Hand of a man playing with a tower of poker chips, takes them and drops them on the same column, seen up close.",
            "https://assets.mixkit.co/videos/preview/mixkit-man-playing-with-a-tower-of-poker-chips-5251-large.mp4"))

        arrVideoModel.add(VideoModel("Woman playing cards betting a few chips",
            "Woman playing cards, takes a few chips and throws them to bet them, seen from the game table, with cards, chips and a glass with an alcoholic drink",
            "https://assets.mixkit.co/videos/preview/mixkit-woman-playing-cards-betting-a-few-chips-5252-large.mp4"))

        arrVideoModel.add(VideoModel("Domino effect on dark background",
            "A straight line of dominoes are knocked down and fall slowly one after the other, onto a black surface seen in detail as the shot zooms out.",
            "https://assets.mixkit.co/videos/preview/mixkit-domino-effect-on-dark-background-5253-large.mp4"))

        arrVideoModel.add(VideoModel("Girl moving small figures from a board game",
            "A girl's hand moving plastic figures in the shape of people, on top of a board of a board game.",
            "https://assets.mixkit.co/videos/preview/mixkit-girl-moving-small-figures-from-a-board-game-5343-large.mp4"))




        videoAdapter = VideoAdapter(arrVideoModel)
        viewPager.adapter = videoAdapter
    }
}