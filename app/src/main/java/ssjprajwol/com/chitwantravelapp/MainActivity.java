package ssjprajwol.com.chitwantravelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Inflating MainActivity class with activity_main layout.

        Button button= findViewById(R.id.button); //Finding and setting button
        TextView textView = findViewById(R.id.textview);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Hotel.class); //Defining the event listener inline and custom behaviour for the event
                startActivity(intent);
            }
        });

        // I could have used onCLick in XML file rather then setting EventListener here as it could be more easier, but I did not. The reason is that the
        //functionality of onClickListener is more than onClick. You cannot control the functionality of onClick outside of it's host activity which is not same incase
        // of onClickListener. Plus, I am going to use fragments for this app which also requires onClickListener.

        button.setOnClickListener(new View.OnClickListener() {  //setting EventListener in button and creating object instance of EventListener in same line
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Restaurant.class); //Defining the event listener inline and custom behaviour for the event
                startActivity(intent);
            }
        });
    }
}