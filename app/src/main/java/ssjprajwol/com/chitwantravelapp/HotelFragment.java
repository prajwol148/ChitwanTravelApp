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

public class HotelFragment extends Fragment {

    private RecyclerView mRecyclerView; //This will contain recycle view created in XML in word_list
    private RecyclerView.LayoutManager mLayoutManager; //This layoutManager will align items in list


    public HotelFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();


        words.add(new Word("Hotel Royal Century","Bharatpur Height, Bharatpur","Always Open","NPR 5,305","+97756525865","4.5/5",R.drawable.royal,getString(R.string.info_royalcentury),"https://g.page/royalcentury?share"));
        words.add(new Word("Hotel Red Karpet","Bharatpur,Chitwan","Always Open","NPR 4,700","+9779855063890","3.5/5",R.drawable.karpet,getString(R.string.info_royalcentury),"https://goo.gl/maps/NnryCXFgRzePftcm7"));
        words.add(new Word("Hotel Jungle Wildlife Camp","Sauraha, Ratnanagar","Always Open","NPR 2,800","+97756580093","4.5/5",R.drawable.wildlife,getString(R.string.info_royalcentury),"https://goo.gl/maps/QdXJJEWmBqjTvq5u5"));
        words.add(new Word("Hotel Mona Lisa","Sauraha, Ratnanagar","Always Open","NPR 4,400","+97756580331","4.5/5",R.drawable.monalisa,getString(R.string.info_royalcentury),"https://goo.gl/maps/NchkTJssGPdLLXXs6"));
        words.add(new Word("Hotel Gangotri","Pulchowk, Naraynghat","Always Open","NPR 3,850","+97756525746","3.5/5",R.drawable.gangotari,getString(R.string.info_royalcentury),"https://goo.gl/maps/qJTbEqNrBJZXAybG8"));
        words.add(new Word("Hotel GreenPark","Sauraha, Ratnanagar","Always Open","NPR 4,450","+97756580510","4.7/5",R.drawable.greenpark,getString(R.string.info_royalcentury),"https://goo.gl/maps/frPaZiApD1KDgtuD6"));
        words.add(new Word("Kabilash Resort","Kabilash, Bharatpur","Always Open","NPR 3,850","+9779855051900","4.2/5",R.drawable.kabilash,getString(R.string.info_royalcentury),"https://goo.gl/maps/75fZRFyfitign3cT8"));
        words.add(new Word("Landmark Fprest Park","Sauraha, Ratnanagar","Always Open","NPR 6,850","+97714004706","4.7/5",R.drawable.landmark,getString(R.string.info_royalcentury),"https://goo.gl/maps/PraqNKcpWWj9fY1d7"));
        words.add(new Word("Hotel Seven Star","Sauraha, Ratnanagar","Always Open","NPR 3,850","+97756580207","4.2/5",R.drawable.sevenstar,getString(R.string.info_royalcentury),"https://goo.gl/maps/C7GzJUCHrLRvL4G89"));
        words.add(new Word("Sapana Village Lodge","Sauraha, Ratnanagar","Always Open","NPR 4,950","+97756580308","4.4/5",R.drawable.sapana,getString(R.string.info_royalcentury),"https://goo.gl/maps/6vKS8Jv6B8Lumum86"));



        mRecyclerView = rootView.findViewById(R.id.list);
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