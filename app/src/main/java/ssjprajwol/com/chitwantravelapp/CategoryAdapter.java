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
            return new HotelFragment();
        }
        else {
            return new RestaurantFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return Context.getString(R.string.Hotel);}
        else if (position == 1) {
            return Context.getString(R.string.Restaurants);}
        else {
            return Context.getString(R.string.Home);
        }
    }
}
