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

public class Sports_fragment extends Fragment {
    private RecyclerView mRecyclerView; //This will contain recycle view created in XML in word_list
    private RecyclerView.LayoutManager mLayoutManager; //This layoutManager will align items in list


    public Sports_fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Brothers Futsal and Badminton","Bharatpur","7:00 AM- 10:00 PM",
                "Npr.1100","056533981","3/5",R.drawable.brothers,"Situated in, Brothers Futsal and Badminton provides both sports and is the first futsal in Chitwan.","https://goo.gl/maps/aNiPJ36enkJVB3Tu8"));

        words.add(new Word("SandBox Video Game Parlour","Mini Ring Road, Bharatpur","7:30 AM- 9:00 PM",
                "Npr.200/hour","+9779806826883","4.8/5",R.drawable.game,"One of the few game parlour in Chitwan. It is equipped with latest hardwares and games. ","https://goo.gl/maps/5atjTMthnniFXwQ37"));


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


