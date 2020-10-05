package ssjprajwol.com.chitwantravelapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class WordAdapter extends RecyclerView.Adapter<WordAdapter.WordViewHolder> {

    private ArrayList<Word> mWords;
    private Context mContext;
    private OnItemClickListener mListener;

    public WordAdapter(Context context,ArrayList<Word> words) {
        mWords = words;
        mContext = context;
    }

    // Define listener member variable

    // Define the listener interface
    public interface OnItemClickListener {
        void onItemClick(View itemView, int position);
    }

    // Define the method that allows the parent activity or fragment to define the listener
    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = listener;
    }


    public static class WordViewHolder extends RecyclerView.ViewHolder {
        public TextView item_name;
        public TextView item_address;
        public TextView item_price;
        public TextView item_time;
        public TextView item_rating;
        public ImageView item_image;

        public WordViewHolder(final View itemView, final OnItemClickListener listener) {
            super(itemView);
            item_name = itemView.findViewById(R.id.item_name);

            item_address = itemView.findViewById(R.id.item_address);

            item_price = itemView.findViewById(R.id.item_price);

            item_time = itemView.findViewById(R.id.item_time);

            item_rating = itemView.findViewById(R.id.item_rating);

            item_image = itemView.findViewById(R.id.item_image);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (listener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            listener.onItemClick(itemView, position);
                        }
                    }
                }
                    });

        }
    }



    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        WordViewHolder viewHolder = new WordViewHolder(v, mListener);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {
        Word currentWord = mWords.get(position);

        holder.item_image.setImageResource(currentWord.getImageResourceId());
        holder.item_name.setText(currentWord.getItem_title());
        holder.item_address.setText(currentWord.getItem_address());
        holder.item_price.setText(currentWord.getItem_price());
        holder.item_time.setText(currentWord.getItem_time());
        holder.item_rating.setText(currentWord.getItem_rating());

    }

    @Override
    public int getItemCount() {
        return mWords.size();
    }

}



/*public class WordAdapter extends ArrayAdapter<Word> {

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
}*/
