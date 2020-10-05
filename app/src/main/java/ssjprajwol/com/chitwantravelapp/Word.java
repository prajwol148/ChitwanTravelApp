package ssjprajwol.com.chitwantravelapp;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

public class Word implements Parcelable {
    private String item_title;
    private String item_address;
    private String item_time;
    private String item_price;
    private String phoneNumber;
    private String item_rating;
    private int mImageResourceId;

    private String address_link;

    private String item_description;


    public Word(String item_title, String item_address, String item_time, String item_price, String phoneNumber, String item_rating, int mImageResourceId, String item_description, String address_link) {
        this.item_title = item_title;
        this.item_address = item_address;
        this.item_time = item_time;
        this.item_price = item_price;
        this.phoneNumber = phoneNumber;
        this.item_rating = item_rating;
        this.mImageResourceId = mImageResourceId;
        this.item_description = item_description;
        this.address_link = address_link;
    }

    protected Word(Parcel in) {
        item_title = in.readString();
        item_address = in.readString();
        item_time = in.readString();
        phoneNumber = in.readString();
        item_price = in.readString();
        item_rating = in.readString();
        mImageResourceId = in.readInt();
        item_description = in.readString();
        address_link = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(item_title);
        dest.writeString(item_address);
        dest.writeString(item_time);
        dest.writeString(phoneNumber);
        dest.writeString(item_price);
        dest.writeString(item_rating);
        dest.writeInt(mImageResourceId);
        dest.writeString(item_description);
        dest.writeString(address_link);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Word> CREATOR = new Creator<Word>() {
        @Override
        public Word createFromParcel(Parcel in) {
            return new Word(in);
        }

        @Override
        public Word[] newArray(int size) {
            return new Word[size];
        }
    };

    public String getItem_title() {
        return item_title;
    }

    public String getItem_address() {
        return item_address;
    }

    public String getItem_time() {
        return item_time;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getItem_price() {
        return item_price;
    }

    public String getItem_rating() {
        return item_rating;
    }

    public String getAddress_link() {
        return address_link;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getItem_description() {
        return item_description;
    }

}
