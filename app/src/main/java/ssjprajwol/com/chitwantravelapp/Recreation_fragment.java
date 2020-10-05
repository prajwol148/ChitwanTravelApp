package ssjprajwol.com.chitwantravelapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class Recreation_fragment extends Fragment {
    private RecyclerView mRecyclerView; //This will contain recycle view created in XML in word_list
    private RecyclerView.LayoutManager mLayoutManager; //This layoutManager will align items in list

    public Recreation_fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView=  inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Chitwan Elephant Safari","Sauraha","8:00 AM- 4:00 PM",
                "Npr.2500-4500 per ride","+9779863599717","4/5",R.drawable.elephant,getString(R.string.info_elep_safari),"https://goo.gl/maps/EJRxe66YitrZ8yYR6"));
        words.add(new Word("Chitwan National Park Jeep Safari","Sauraha","8:00 AM- 4:00 PM",
                "Npr.5000-9000 per ride","+97756580400","4/5",R.drawable.jeep,getString(R.string.jeep),"https://goo.gl/maps/EJRxe66YitrZ8yYR6"));

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