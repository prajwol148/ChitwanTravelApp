package ssjprajwol.com.chitwantravelapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelFragment extends Fragment {


    public HotelFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Hotel Red Karpet","LionsChowk, Bharatpur","Always Open","NPR 4,700","3.5/5",R.drawable.karpet));
        words.add(new Word("Hotel Royal Century","Bharatpur Height, Bharatpur","Always Open","NPR 5,305","4.5/5",R.drawable.royal));
        words.add(new Word("Hotel Jungle Wildlife Camp","Bharatpur, Chitwan","Always Open","NPR 2,800","4.5/5",R.drawable.wildlife));
        words.add(new Word("Hotel Mona Lisa","Bharatpur, Chitwan","Always Open","NPR 4,400","4.5/5",R.drawable.monalisa));
        words.add(new Word("Hotel Gangotri","Pulchowk, Naraynghat","Always Open","NPR 3,850","3.5/5",R.drawable.gangotari));
        words.add(new Word("Hotel GreenPark","Sauraha, Ratnanagar","Always Open","NPR 4,450","4.7/5",R.drawable.greenpark));
        words.add(new Word("Kabilash Resort","Kabilash, Bharatpur","Always Open","NPR 3,850","4.2/5",R.drawable.kabilash));
        words.add(new Word("Hotel Landmark","Sauraha, Ratnanagar","Always Open","NPR 6,850","4.7/5",R.drawable.landmark));
        words.add(new Word("Hotel Seven Star","Sauraha, Ratnanagar","Always Open","NPR 3,850","4.2/5",R.drawable.sevenstar));
        words.add(new Word("Sapana Village Lodge","Sauraha, Ratnanagar","Always Open","NPR 4,950","4.4/5",R.drawable.sapana));


        WordAdapter adapter = new WordAdapter(getContext(),words);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;

    }
}