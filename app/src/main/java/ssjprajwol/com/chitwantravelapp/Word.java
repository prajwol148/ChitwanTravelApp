package ssjprajwol.com.chitwantravelapp;

import android.widget.ImageView;

public class Word {
    private String item_title;
    private String item_address;
    private String item_time;
    private String item_price;
    private String item_rating;

    private int mImageResourceId;

    public Word(String item_title, String item_address, String item_time, String item_price, String item_rating, int ImageResourceId) {
        this.item_title = item_title;
        this.item_address = item_address;
        this.item_time = item_time;
        this.item_price = item_price;
        this.item_rating = item_rating;
        this.mImageResourceId = ImageResourceId;
    }

    public String getItem_title() {
        return item_title;
    }

    public String getItem_address() {
        return item_address;
    }

    public String getItem_time() {
        return item_time;
    }

    public String getItem_price() {
        return item_price;
    }

    public String getItem_rating() {
        return item_rating;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}
