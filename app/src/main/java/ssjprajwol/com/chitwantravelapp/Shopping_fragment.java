package ssjprajwol.com.chitwantravelapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Shopping_fragment extends Fragment {
    private RecyclerView mRecyclerView; //This will contain recycle view created in XML in word_list
    private RecyclerView.LayoutManager mLayoutManager; //This layoutManager will align items in list


    public Shopping_fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Bhatbhateni Super Market","Birendra Cmapus Chowk, Bharatpur","5:00 PM- 10:30 PM",
                "Affordable","+97756531923","4.5/5",R.drawable.bhatbhateni,getString(R.string.cg),"https://goo.gl/maps/dx4b1Se6s1pjsTXU6"));

        words.add(new Word("CG Landmark","Narayanghat, Bharatpur","7:30 AM- 8:30 PM",
                "Affordable","+97756520200","4/5",R.drawable.cg,getString(R.string.bhatbhateni),"https://goo.gl/maps/n2fjzcCRQ2KquiwLA"));


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


