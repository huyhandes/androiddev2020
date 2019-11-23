package vn.edu.usth.weatheractivity;
import android.graphics.Typeface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ForecastFragment extends Fragment {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        final String days[] = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat","Sun"};

        ViewGroup v = (ViewGroup) inflater.inflate(R.layout.activity_weather,null,false);
        LinearLayout linearLayout = v.findViewById(R.id.main_activity);
        for(int i=0; i<10; ++i){
            View row = inflater.inflate(R.layout.weather_row,container,false);
            ((TextView)row.findViewById(R.id.day)).setText(days[i%7]);
            ((ImageView)row.findViewById(R.id.weather)).setImageResource(R.drawable.daycloudyful);
            linearLayout.addView(row);
        }
        return v;
    }
}
