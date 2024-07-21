package com.dicoding.assesmennews.ui.detail

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import com.dicoding.assesmennews.R
import com.dicoding.assesmennews.data.local.entity.NewsEntity
import com.dicoding.assesmennews.databinding.ActivityDetailBinding
import com.dicoding.assesmennews.utils.DateFormatter

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val news = intent.getParcelableExtra<NewsEntity>("news")
        if (news != null) {
            displayNewsDetails(news)
        }
    }

    private fun displayNewsDetails(news: NewsEntity) {
        binding.tvDetailTitle.text = news.title
        binding.tvDetailPublishedDate.text = DateFormatter.formatDate(news.publishedAt)
        binding.tvDetailSummary.text = getkalimatAwal(news.summary)

        Glide.with(this)
            .load(news.urlToImage)
            .into(binding.imgDetailPoster)

        binding.tvMoreInfo.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse(news.url)
            }
            startActivity(intent)
        }
    }

    private fun getkalimatAwal(summary: String): String {
        val indexOfFirstPeriod = summary.indexOf('.')
        return if (indexOfFirstPeriod != -1) {
            summary.substring(0, indexOfFirstPeriod + 1)
        } else {
            summary
        }
    }
}