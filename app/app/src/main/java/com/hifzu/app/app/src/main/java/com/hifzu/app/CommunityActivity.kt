package com.hifzu.app

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.*

class CommunityActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.setPadding(24, 30, 24, 24)
        layout.setBackgroundColor(Color.rgb(20, 20, 35))

        val title = TextView(this)
        title.text = "🌍 HIFZU COMMUNITY"
        title.textSize = 26f
        title.setTextColor(Color.WHITE)
        title.gravity = Gravity.CENTER

        layout.addView(title)

        val features = listOf(
            "➕ Create Community",
            "🔍 Explore Communities",
            "👥 My Communities",
            "🎙 Community Voice Rooms",
            "💬 Community Chat",
            "👑 Admin & Moderators",
            "🔔 Notifications"
        )

        for (feature in features) {
            val button = Button(this)
            button.text = feature
            layout.addView(button)
        }

        setContentView(layout)
    }
}
