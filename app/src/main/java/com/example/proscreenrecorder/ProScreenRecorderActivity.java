package com.example.proscreenrecorder;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ProScreenRecorderActivity extends AppCompatActivity {

    Button btnStart, btnStop;
    ImageButton btnSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStart = findViewById(R.id.btn_start);
        btnStop = findViewById(R.id.btn_stop);
        btnSettings = findViewById(R.id.btn_settings);

        btnStart.setOnClickListener(v -> {
            Toast.makeText(this, "Recording started", Toast.LENGTH_SHORT).show();
            btnStart.setVisibility(View.GONE);
            btnStop.setVisibility(View.VISIBLE);
        });

        btnStop.setOnClickListener(v -> {
            Toast.makeText(this, "Recording stopped", Toast.LENGTH_SHORT).show();
            btnStart.setVisibility(View.VISIBLE);
            btnStop.setVisibility(View.GONE);
        });

        btnSettings.setOnClickListener(v -> {
            Toast.makeText(this, "Settings clicked", Toast.LENGTH_SHORT).show();
        });
    }
}