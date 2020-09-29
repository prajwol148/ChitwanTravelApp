package ssjprajwol.com.chitwantravelapp;

import android.graphics.Typeface;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

import static android.Manifest.permission.ACCESS_FINE_LOCATION;
public class MainScreen extends Fragment {
    private static final String OPEN_WEATHER_MAP_URL="";
    private static final String OPEN_WEATHER_MAP_API="";

    TextView cityField, detailsField, currentTemperatureField, humidityField, pressureField, weatherIcon, updateField;
    static String latitude, longitude;

    public MainScreen() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_main_screen, container, false);




        ImageSlider imageSlider = (ImageSlider) view.findViewById(R.id.slider);

        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://images.thrillophilia.com/image/upload/s--5mtTUpYq--/c_fill,f_auto,fl_strip_profile,h_600,q_auto,w_975/v1/images/photos/000/053/727/original/Jungle_Safari_Chitwan.JPG.jpg?1458199183","Elephant Safari"));
        slideModels.add(new SlideModel("https://www.mountainvehiclenepal.com/wp-content/uploads/2019/01/kathmandu-chitwan-front.jpg","Elephant Bathing"));
        slideModels.add(new SlideModel("https://media.tacdn.com/media/attractions-splice-spp-674x446/06/74/b8/1b.jpg","Jungle Safari"));
        slideModels.add(new SlideModel("https://www.nepaltour.info/wp-content/uploads/2017/06/chitwan-jungle-safari-tour.jpg","Sunset"));
        slideModels.add(new SlideModel("https://www.myrepublica.com/uploads/media/Lamo-Jharna-chitwan.jpg","Lamo Jharana"));
        slideModels.add(new SlideModel("https://i.ytimg.com/vi/1G57DZ3f3mI/hqdefault.jpg","Narayani River Side"));
        slideModels.add(new SlideModel("https://www.crtravels.com.np/wp-content/uploads/2017/11/fhewa-lake-kyaking-990x490.jpg","Canoeing"));
        slideModels.add(new SlideModel("https://www.dustravel.com/image/image.php?src=https://www.dustravel.com/image/catalog/A%20RARA/canyoning.jpg&w=750&h=443","Canyoning"));

        imageSlider.setImageList(slideModels,true);
        return view;

    }

}