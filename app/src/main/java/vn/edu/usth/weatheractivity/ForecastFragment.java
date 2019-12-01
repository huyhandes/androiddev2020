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

import java.util.Random;

public class ForecastFragment extends Fragment {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        ViewGroup v = (ViewGroup) inflater.inflate(R.layout.fragment_forecast,null,false);
        Random rd = new Random();
        LinearLayout linearLayout = v.findViewById(R.id.fragmentForcast);
        for(int i=0; i<10; ++i){
            View row = inflater.inflate(R.layout.weather_row,container,false);
            ((TextView)row.findViewById(R.id.day)).setText(day(i%7));
            ((TextView)row.findViewById(R.id.city)).setText("Paris");
            ((TextView)row.findViewById(R.id.temp)).setText(String.valueOf(rd.nextInt()%10+10) + "°C - " + String.valueOf(rd.nextInt()%10 +20) +"°C");
            ((ImageView)row.findViewById(R.id.weather)).setImageResource(R.drawable.daycloudyful);
            linearLayout.addView(row);
        }
        return v;
    }
    public String day(int i) {
        int value = 0;
        switch (i) {
            case 0:
                value = R.string.Mon;
                break;
            case 1:
                value = R.string.Tue;
                break;
            case 2:
                value = R.string.Wed;
                break;
            case 3:
                value = R.string.Thu;
                break;
            case 4:
                value = R.string.Fri;
                break;
            case 5:
                value = R.string.Sat;
                break;
            case 6:
                value = R.string.Sun;
                break;
        }
        return getResources().getString(value);
    }
}
