package com.example.thehungrydeveloper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CardView startersCard, mainsCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startersCard = findViewById(R.id.card_view_starters);
        mainsCard = findViewById(R.id.card_view_mains);

        mainsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainCourseActivityIntent = new Intent(MainActivity.this, MainCourseActivity.class);
                startActivity(mainCourseActivityIntent);
            }
        });

        startersCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startersActivityIntent = new Intent(MainActivity.this, StarterActivity.class);
                startActivity(startersActivityIntent);
            }
        });

        TextView emailView = findViewById(R.id.text_view_email_address);
        emailView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launchEmailAppIntent = new Intent(Intent.ACTION_SENDTO);
                launchEmailAppIntent.setData(Uri.parse("mailto:testemail@m.com"));

                startActivity(launchEmailAppIntent);

            }
        });
    }
}