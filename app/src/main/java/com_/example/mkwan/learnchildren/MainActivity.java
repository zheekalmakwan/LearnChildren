package com_.example.mkwan.learnchildren;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.numbers);
        nextButton=findViewById(R.id.next_b);
        previousButton=findViewById(R.id.previous_b);
        oneMediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.one);
        twoMediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.two);
        textView=findViewById(R.id.text_view);
        oneMediaPlayer.start();
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView.getText().equals("One")){
                    imageView.setImageResource(R.drawable.two);
                    textView.setTextColor(getResources().getColor(R.color.two));
                    textView.setText("Two");
                    twoMediaPlayer.start();

                }
                else if(textView.getText().equals("Two")){
                    imageView.setImageResource(R.drawable.three);
                    textView.setTextColor(getResources().getColor(R.color.three));
                    textView.setText("Three");
                }

                else if(textView.getText().equals("Three")){
                    imageView.setImageResource(R.drawable.four);
                    textView.setTextColor(getResources().getColor(R.color.four));
                    textView.setText("Four");
                }

                else if(textView.getText().equals("Four")){
                    imageView.setImageResource(R.drawable.five);
                    textView.setTextColor(getResources().getColor(R.color.five));
                    textView.setText("Five");
                }


                else if(textView.getText().equals("Five")){
                    imageView.setImageResource(R.drawable.six);
                    textView.setTextColor(getResources().getColor(R.color.six));
                    textView.setText("Six");
                }


                else if(textView.getText().equals("Six")){
                    imageView.setImageResource(R.drawable.seven);
                    textView.setTextColor(getResources().getColor(R.color.seven));
                    textView.setText("Seven");
                }

                else if(textView.getText().equals("Seven")){
                    imageView.setImageResource(R.drawable.eight);
                    textView.setTextColor(getResources().getColor(R.color.three));
                    textView.setText("Eight");
                }

                else if(textView.getText().equals("Eight")){
                    imageView.setImageResource(R.drawable.nine);
                    textView.setTextColor(getResources().getColor(R.color.three));
                    textView.setText("Nine");
                }

                else if(textView.getText().equals("Nine")){
                    Toast.makeText(getApplicationContext(),"no more number",Toast.LENGTH_LONG).show();
                }
            }
        });

        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView.getText().equals("One")){
                    oneMediaPlayer.start();
                    Toast.makeText(getApplicationContext(),"no more number",Toast.LENGTH_LONG).show();
                }
                else if(textView.getText().equals("Two")){
                    imageView.setImageResource(R.drawable.one);
                    textView.setTextColor(getResources().getColor(R.color.one));
                    textView.setText("One");
                }

                else if(textView.getText().equals("Three")){
                    imageView.setImageResource(R.drawable.two);
                    textView.setTextColor(getResources().getColor(R.color.two));
                    textView.setText("Two");
                }

                else if(textView.getText().equals("Four")){
                    imageView.setImageResource(R.drawable.three);
                    textView.setText("Three");
                }


                else if(textView.getText().equals("Five")){
                    imageView.setImageResource(R.drawable.four);
                    textView.setText("Four");
                }


                else if(textView.getText().equals("Six")){
                    imageView.setImageResource(R.drawable.five);
                    textView.setText("Five");
                }

                else if(textView.getText().equals("Seven")){
                    imageView.setImageResource(R.drawable.six);
                    textView.setText("Six");
                }

                else if(textView.getText().equals("Eight")){
                    imageView.setImageResource(R.drawable.seven);
                    textView.setText("Seven");
                }

                else if(textView.getText().equals("Nine")){
                    imageView.setImageResource(R.drawable.eight);
                    textView.setText("Eight");
                }
            }
        });
    }


  /*  private  int getImageId(ImageView iv)
    {
        return (Integer) iv.getTag();
    }*/
}
