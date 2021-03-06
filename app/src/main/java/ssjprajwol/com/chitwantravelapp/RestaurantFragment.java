package ssjprajwol.com.chitwantravelapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantFragment extends Fragment {
    private RecyclerView mRecyclerView; //This will contain recycle view created in XML in word_list
    private RecyclerView.LayoutManager mLayoutManager; //This layoutManager will align items in list


    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Munch Time Cafe","Milan Road, Bharatpur","8:00 AM- 9:00 PM",
                "Economical","+97756525095","4/5",R.drawable.munch,getString(R.string.info_munch_time),"https://goo.gl/maps/ha17sCs4pe48Yojr6"));

        words.add(new Word("Greasy Spoon Restaurant","Sauraha Road, Sauraha","7:00 AM- 10:00 PM",
                "Lavish","+97756580057","4/5",R.drawable.greasy,getString(R.string.info_greasy),"https://goo.gl/maps/GE2hUVJFir15GDS66"));

        words.add(new Word("Friends Cafe","Hatti Chowk, Sauraha","9:00 AM- 10:00 PM",
                "Lavish","+9779806857620","4/5",R.drawable.friends,getString(R.string.info_friends),"https://goo.gl/maps/QJ6RW5K99gBjFMo47"));

        words.add(new Word("Kc's Restaurant and Bar","Rhino Statue, Sauraha","7:00 AM- 10:00 PM",
                "Lavish","+97756525095","4/5",R.drawable.kc,getString(R.string.info_kc),"https://g.page/kc-s-restaurant-bar?share"));


        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.list);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getContext());
        WordAdapter mAdapter = new WordAdapter(getContext(),words);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        mAdapter.setOnItemClickListener(new WordAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View itemView, int position) {
                // Get the {@link Word} object at the given position the user clicked on
                Word place = words.get(position);
                Intent intent = new Intent(getActivity(),place_info_Activity.class);
                intent.putExtra("Place",place);
                startActivity(intent);
            }
        });

        return rootView;
    }
}