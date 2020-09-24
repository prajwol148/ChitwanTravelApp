package ssjprajwol.com.chitwantravelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Restaurant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Munch Time Cafe","Bharatpur","5:00 - 6:00",
                "56- 70$","4/5",R.drawable.greenpark));

        WordAdapter adapter = new WordAdapter(this,words);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}