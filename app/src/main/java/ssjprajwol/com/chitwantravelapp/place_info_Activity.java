package ssjprajwol.com.chitwantravelapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.appbar.CollapsingToolbarLayout;

public class place_info_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_info);



        Intent intent = getIntent();
        final Word word = intent.getParcelableExtra("Place");

        getSupportActionBar().setTitle(word.getItem_title());
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout place = findViewById(R.id.collapseToolbar);
        place.setTitle(word.getItem_title());


        ImageView placeImage = findViewById(R.id.image);
        placeImage.setImageResource(word.getImageResourceId());


        TextView description = findViewById(R.id.item_description);
        description.setText(word.getItem_description());

        TextView openingTime = findViewById(R.id.opening_time);
        openingTime.setText(word.getItem_time());

        TextView rating = findViewById(R.id.item_rating);
        rating.setText(word.getItem_rating());

        TextView phoneNumber = findViewById(R.id.item_number);

        phoneNumber.setText(word.getPhoneNumber());

        TextView address= findViewById(R.id.address);
        address.setText(word.getItem_address());

        TextView price= findViewById(R.id.price);
        price.setText(word.getItem_price());

        LinearLayout location = findViewById(R.id.location);



        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse(word.getAddress_link()));
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}