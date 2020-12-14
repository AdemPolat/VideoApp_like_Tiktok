package com.adempolat.tiktoklite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class ColourfulActivity : AppCompatActivity() {

    var arrVideoModel = ArrayList<VideoModel>()
    var videoAdapter:VideoAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_colourful)

        arrVideoModel.add(VideoModel("Hand holding a rubik cube that seems to melt on a pink background",
            "A woman's hand with pink painted fingernails, close up view on a pink background, while holding a Rubik's cube, on top of a mixture of blue and pink paints, spilling from her hand, giving the illusion that the cube melts.",
            "https://assets.mixkit.co/videos/preview/mixkit-hand-holding-a-rubik-cube-that-seems-to-melt-on-13765-large.mp4"))

        arrVideoModel.add(VideoModel("Filling a cup with coffee, on a surface with allegory to wake up",
            "An empty mug viewed from above on a diagonally divided purple and yellow surface with the words ON and OFF on each side, as a person fills the mug with American coffee, and turns it around so that the ear of the mug is now ON side.",
            "https://assets.mixkit.co/videos/preview/mixkit-filling-a-cup-with-coffee-on-a-surface-with-allegory-13766-large.mp4"))

        arrVideoModel.add(VideoModel("A slice of flower pizza on a yellow background",
            "Placing a slice of pizza with many pink and lilac flowers on a yellow background with a spatula, viewed from above while the shot slowly opens.",
            "https://assets.mixkit.co/videos/preview/mixkit-a-slice-of-flower-pizza-on-a-yellow-background-13767-large.mp4"))

        arrVideoModel.add(VideoModel("Conceptual video of a pink banana on a pink and lilac background",
            "Background of pink and purple colors dividing the shot just in half, while one hand places a pink peel banana, as it passes through the middle line, the half that crosses it comes out peeled.",
            "https://assets.mixkit.co/videos/preview/mixkit-conceptual-video-of-a-pink-banana-on-a-pink-and-13768-large.mp4"))

        arrVideoModel.add(VideoModel("Representation of a sunrise made with homemade materials",
            "Representation of the sun rising behind the clouds illuminating the scene, made with homemade materials, such as a yellow balloon and some cotton.",
            "https://assets.mixkit.co/videos/preview/mixkit-representation-of-a-sunrise-made-with-homemade-materials-13769-large.mp4"))

        arrVideoModel.add(VideoModel("Blue plastic skull covered with a pink liquid on a blue background",
            "Blue plastic skull on a background of the same color, seen up close while a thick pink liquid is spilled on it.",
            "https://assets.mixkit.co/videos/preview/mixkit-blue-plastic-skull-covered-with-a-pink-liquid-on-a-13770-large.mp4"))

        arrVideoModel.add(VideoModel("Spaghetti caramel",
            "Sugared rubber strips, served on a purple plastic plate, on a turquoise blue surface, while a person takes a bit with a plastic fork like spaghetti, and the shot opens slowly.",
            "https://assets.mixkit.co/videos/preview/mixkit-spaghetti-caramel-13771-large.mp4"))

        arrVideoModel.add(VideoModel("Filling a glass cup with small sweets on a pink background",
            "Thin empty glass cup, while a girl's hand fills it with many small candies until it overflows, on a pink background.",
            "https://assets.mixkit.co/videos/preview/mixkit-filling-a-glass-cup-with-small-sweets-on-a-pink-13772-large.mp4"))

        arrVideoModel.add(VideoModel("Lemons placed on a green surface",
            "Lemons placed on an emerald green surface, illuminated by a light that travels from one side to the other, while the shot opens slowly.",
            "https://assets.mixkit.co/videos/preview/mixkit-lemons-placed-on-a-green-surface-13774-large.mp4"))

        arrVideoModel.add(VideoModel("Round spotlight that glows full of colorful candies on a pink background",
            "Round glass spotlight full of yellow, white, blue and green candy, placed at the bottom of the shot, with a pink background that is clarified with a light that turns on and off.",
            "https://assets.mixkit.co/videos/preview/mixkit-round-spotlight-that-glows-full-of-colorful-candies-on-a-13773-large.mp4"))

        arrVideoModel.add(VideoModel("Eye of a woman peeking out of the hole of a pink paper screen",
            "Pink screen rotates with a hole in the center, while a woman pokes out her brown eye, blinks and looks around.",
            "https://assets.mixkit.co/videos/preview/mixkit-eye-of-a-woman-peeking-out-of-the-hole-of-13775-large.mp4"))

        arrVideoModel.add(VideoModel("Pink heart on a mirror with the sky and clouds in the background",
            "Pink heart placed on a reflective surface, with the blue sky and clouds moving fast in the background.",
            "https://assets.mixkit.co/videos/preview/mixkit-pink-heart-on-a-mirror-with-the-sky-and-clouds-13776-large.mp4"))

        arrVideoModel.add(VideoModel("Taking three glazed donuts in a row on a pink background",
            "Three chocolate-glazed donuts placed in a row on a pink background, while the take slowly moves away and 3 hands take each of the donuts.",
            "https://assets.mixkit.co/videos/preview/mixkit-taking-three-glazed-donuts-in-a-row-on-a-pink-13777-large.mp4"))

        arrVideoModel.add(VideoModel("Cell phone filled with a pink liquid like a glass on a blue background",
            "Smartphone from the front on a blue background while a person serves it as if it were a glass with a pink liquid, which appears on the screen as it is filling.",
            "https://assets.mixkit.co/videos/preview/mixkit-cell-phone-filled-with-a-pink-liquid-like-a-glass-13778-large.mp4"))





        videoAdapter = VideoAdapter(arrVideoModel)
        viewPager.adapter = videoAdapter
    }
}