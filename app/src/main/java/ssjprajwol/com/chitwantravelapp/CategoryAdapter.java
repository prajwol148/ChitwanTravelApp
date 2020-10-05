package ssjprajwol.com.chitwantravelapp;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
@SuppressWarnings("deprecation")
public class CategoryAdapter extends FragmentPagerAdapter {
    private Context Context;
    public CategoryAdapter(Context context, FragmentManager fm) {

        super(fm);
        Context =context;
    }

    public Fragment getItem(int position) {
        if(position == 0) {
            return new MainScreen();
        }
        else if(position == 1) {
            return new HotelFragment();
        }
        else if(position == 2) {
            return new RestaurantFragment();
        }
        else if(position == 3) {
            return new Recreation_fragment();
        }
        else if(position == 4) {
            return new Events_fragments();
        }
        else if(position == 5) {
            return new Shopping_fragment();
        }
        else if(position == 6) {
            return new Sports_fragment();
        }
        else {
            return new MainScreen();
        }
    }

    @Override
    public int getCount() {
        return 7;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return Context.getString(R.string.Hotel);}
        else if (position == 1) {
            return Context.getString(R.string.Restaurants);}
        else if (position == 2) {
            return Context.getString(R.string.Recreation);}
        else {
            return Context.getString(R.string.Home);
        }
    }
}
