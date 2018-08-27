package com_.example.mkwan.learnchildren;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button nextButton;
    Button previousButton;
    TextView textView;
    MediaPlayer oneMediaPlayer;
    MediaPlayer twoMediaPlayer;
    MediaPlayer threeMediaPlayer;
    MediaPlayer fourMediaPlayer;
    MediaPlayer fiveMediaPlayer;
    MediaPlayer sixMediaPlayer;
    MediaPlayer sevenMediaPlayer;
    MediaPlayer eightMediaPlayer;
    MediaPlayer nineMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.numbers);
        nextButton = findViewById(R.id.next_b);
        previousButton = findViewById(R.id.previous_b);
        oneMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.one);
        twoMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.two);
        threeMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.three);
        fourMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.four);
        fiveMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.five);
        sixMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.six);
        sevenMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.seven);
        eightMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.eight);
        nineMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.nine);
        textView = findViewById(R.id.text_view);
        oneMediaPlayer.start();
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView.getText().equals(getString(R.string.one))) {
                    imageView.setImageResource(R.drawable.two);
                    textView.setTextColor(getResources().getColor(R.color.two));
                    textView.setText(R.string.two);
                    twoMediaPlayer.start();

                } else if (textView.getText().equals(getString(R.string.two))) {
                    imageView.setImageResource(R.drawable.three);
                    textView.setTextColor(getResources().getColor(R.color.three));
                    textView.setText(R.string.three);
                    threeMediaPlayer.start();
                } else if (textView.getText().equals(getString(R.string.three))) {
                    imageView.setImageResource(R.drawable.four);
                    textView.setTextColor(getResources().getColor(R.color.four));
                    textView.setText(R.string.four);
                    fourMediaPlayer.start();
                } else if (textView.getText().equals(getString(R.string.four))) {
                    imageView.setImageResource(R.drawable.five);
                    textView.setTextColor(getResources().getColor(R.color.five));
                    textView.setText(R.string.five);
                    fiveMediaPlayer.start();
                } else if (textView.getText().equals(getString(R.string.five))) {
                    imageView.setImageResource(R.drawable.six);
                    textView.setTextColor(getResources().getColor(R.color.six));
                    textView.setText(R.string.six);
                    sixMediaPlayer.start();
                } else if (textView.getText().equals(getString(R.string.six))) {
                    imageView.setImageResource(R.drawable.seven);
                    textView.setTextColor(getResources().getColor(R.color.seven));
                    textView.setText(R.string.seven);
                    sevenMediaPlayer.start();
                } else if (textView.getText().equals(getString(R.string.seven))) {
                    imageView.setImageResource(R.drawable.eight);
                    textView.setTextColor(getResources().getColor(R.color.eight));
                    textView.setText(R.string.eight);
                    eightMediaPlayer.start();
                } else if (textView.getText().equals(getString(R.string.eight))) {
                    imageView.setImageResource(R.drawable.nine);
                    textView.setTextColor(getResources().getColor(R.color.nine));
                    textView.setText(R.string.nine);
                    nineMediaPlayer.start();
                } else if (textView.getText().equals(getString(R.string.nine))) {
                    Toast.makeText(getApplicationContext(), getString(R.string.no_more_number), Toast.LENGTH_LONG).show();
                    nineMediaPlayer.start();
                }
            }
        });

        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView.getText().equals(getString(R.string.one))) {
                    oneMediaPlayer.start();
                    Toast.makeText(getApplicationContext(), getString(R.string.no_more_number), Toast.LENGTH_LONG).show();
                    oneMediaPlayer.start();
                } else if (textView.getText().equals(getString(R.string.two))) {
                    imageView.setImageResource(R.drawable.one);
                    textView.setTextColor(getResources().getColor(R.color.one));
                    textView.setText(R.string.one);
                    oneMediaPlayer.start();
                } else if (textView.getText().equals(getString(R.string.three))) {
                    imageView.setImageResource(R.drawable.two);
                    textView.setTextColor(getResources().getColor(R.color.two));
                    textView.setText(R.string.two);
                    twoMediaPlayer.start();
                } else if (textView.getText().equals(getString(R.string.four))) {
                    imageView.setImageResource(R.drawable.three);
                    textView.setTextColor(getResources().getColor(R.color.three));
                    textView.setText(R.string.three);
                    threeMediaPlayer.start();
                } else if (textView.getText().equals(getString(R.string.five))) {
                    imageView.setImageResource(R.drawable.four);
                    textView.setTextColor(getResources().getColor(R.color.four));
                    textView.setText(R.string.four);
                    fourMediaPlayer.start();
                } else if (textView.getText().equals(getString(R.string.six))) {
                    imageView.setImageResource(R.drawable.five);
                    textView.setTextColor(getResources().getColor(R.color.five));
                    textView.setText(R.string.five);
                    fiveMediaPlayer.start();
                } else if (textView.getText().equals(getString(R.string.seven))) {
                    imageView.setImageResource(R.drawable.six);
                    textView.setTextColor(getResources().getColor(R.color.six));
                    textView.setText(R.string.six);
                    sixMediaPlayer.start();
                } else if (textView.getText().equals(getString(R.string.eight))) {
                    imageView.setImageResource(R.drawable.seven);
                    textView.setTextColor(getResources().getColor(R.color.seven));
                    textView.setText(R.string.seven);
                    sevenMediaPlayer.start();
                } else if (textView.getText().equals(getString(R.string.nine))) {
                    imageView.setImageResource(R.drawable.eight);
                    textView.setTextColor(getResources().getColor(R.color.eight));
                    textView.setText(R.string.eight);
                    eightMediaPlayer.start();
                }
            }
        });
    }
}

