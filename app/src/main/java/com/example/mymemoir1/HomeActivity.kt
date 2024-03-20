package com.example.mymemoir1
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val buttonViewGoals: Button = findViewById(R.id.buttonViewGoals)
        val buttonSetGoals: Button = findViewById(R.id.buttonSetGoals)

        buttonViewGoals.setOnClickListener {
            val intent = Intent(this, ViewGoalsActivity::class.java)
            startActivity(intent)
        }

        buttonSetGoals.setOnClickListener {
            val intent = Intent(this, SetGoalsActivity::class.java)
            startActivity(intent)
        }
    }
}