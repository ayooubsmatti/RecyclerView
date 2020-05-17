package com.ayoubsmatti.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {
    private TextView name,info;
    private Bundle extras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        name = findViewById(R.id.nameinfoid);
        info = findViewById(R.id.infoinfo);
        extras = getIntent().getExtras();
        if (extras!=null){
            name.setText(extras.getString("name"));
            info.setText(extras.getString("description"));
        }
    }
}
