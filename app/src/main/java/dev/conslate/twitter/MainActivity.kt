package dev.conslate.twitter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.conslate.twitter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displaytweets()
    }

    fun displaytweets(){
        var tweet1=twitter("conslatekoyo","You are remarkable","@conskoyo","2345","300","3456","345","345","80","")
        var tweet2=twitter("maryanngathanga","Wake up and code, the world is watching","@conskoyo","2345","300","3456","345","345","80","")
        var tweet3=twitter("esterowiti","If you dont take sight of the ladder, you are doomed to fall","@esterowiti","200","2344","345","780","7890","150","")
        var tweet4=twitter("jessericky","You are remarkable","@cjessericky","13200","12345","2500","","","","")
        var tweet5=twitter("shamimigard","","@sharlymay","10900","10699","17654","","","","")
        var tweet6=twitter("yonahokoth","You are remarkable","@joshuaresta","13456","23456","12347","","","","")
        var tweet7=twitter("swabrinayusuf","We try again tomorrow","@swabrinaokello","12345","12500","34567","","","","")

        var twitterList= listOf(tweet1,tweet2,tweet3,tweet4,tweet5,tweet6,tweet7)
        var twitterAdapter=TwitterRecyclerAdapter(twitterList)
        binding.rvtwitter.layoutManager=LinearLayoutManager(this)
        binding.rvtwitter.adapter=twitterAdapter

    }
}