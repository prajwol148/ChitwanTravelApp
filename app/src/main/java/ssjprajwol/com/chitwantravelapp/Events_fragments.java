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

public class Events_fragments extends Fragment {
    private RecyclerView mRecyclerView; //This will contain recycle view created in XML in word_list
    private RecyclerView.LayoutManager mLayoutManager; //This layoutManager will align items in list


    public Events_fragments() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Tharu Cultural Dance","Harnari, Khairahani","5:00 PM- 10:30 PM",
                "N/A","N/A","4.5/5",R.drawable.tharu,getString(R.string.tharu),"https://goo.gl/maps/6zR88ejw3XKAT1gP7"));

        words.add(new Word("Chitwan Mahotsav","Narayanghat, Bharatpur","10:00 AM- 7:00 PM",
                "N/A","N/A","3.5/5",R.drawable.mahotsab,getString(R.string.mahotsav),"https://goo.gl/maps/dsyPf4jR63FvTbfR8"));


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

