package ssjprajwol.com.chitwantravelapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Context context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView =convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate
                    (R.layout.list_item,parent,false);
        }
        Word currentWord = getItem(position);

        TextView item_name = listItemView.findViewById(R.id.item_name);
        item_name.setText(currentWord.getItem_title());

        TextView item_address = listItemView.findViewById(R.id.item_address);
        item_address.setText(currentWord.getItem_address());

        TextView item_price = listItemView.findViewById(R.id.item_price);
        item_price.setText(currentWord.getItem_price());

        TextView item_time = listItemView.findViewById(R.id.item_time);
        item_time.setText(currentWord.getItem_time());

        TextView item_rating = listItemView.findViewById(R.id.item_rating);
        item_rating.setText(currentWord.getItem_rating());

        ImageView item_image = listItemView.findViewById(R.id.item_image);
        item_image.setImageResource(currentWord.getImageResourceId());
        item_image.setVisibility(View.VISIBLE);

        return listItemView;
    }
}
