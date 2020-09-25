package ssjprajwol.com.chitwantravelapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantFragment extends Fragment {

    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Munch Time Cafe","Bharatpur","9:00 AM- 10:00 PM",
                "56- 70$","4/5",R.drawable.munch));

        WordAdapter adapter = new WordAdapter(getContext(),words);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);


        return rootView;
    }
}