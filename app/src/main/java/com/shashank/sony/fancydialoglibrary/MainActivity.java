package com.shashank.sony.fancydialoglibrary;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.shashank.sony.fancydialoglib.Animation;
import com.shashank.sony.fancydialoglib.FancyAlertDialog;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        FancyAlertDialog.Builder
                .with(this)
                .setTitle("Rate us if you like the app")
                .setMessage("Do you really want to Exit ?")
                .setNegativeBtnText("Cancel")
                .setPositiveBtnText("Rate")
                .setAnimation(Animation.POP)
                .isCancellable(true)
                .setIcon(R.drawable.ic_star_border_black_24dp, View.VISIBLE)
                .onPositiveClicked(dialog -> Toast.makeText(MainActivity.this, "Rate", Toast.LENGTH_SHORT).show())
                .onNegativeClicked(dialog -> Toast.makeText(MainActivity.this, "Cancel", Toast.LENGTH_SHORT).show())
                .build()
                .show();
    }
}
