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
        View v = inflater.inflate(R.layout.activity_weather, null,false);
        LinearLayout linearLayout = v.findViewById(R.id.main_activity);
        TextView day = new TextView(getActivity());
        day.setText("Thursday");
        day.setPadding(10,10,10,10);
        day.setTextSize(35);
        day.setTypeface(null, Typeface.BOLD);
        day.setGravity(Gravity.CENTER);
        ImageView weatherIcon = new ImageView(getActivity());
        weatherIcon.setImageResource(R.drawable.dayrainyful);
        weatherIcon.setScaleType(ImageView.ScaleType.CENTER);
        weatherIcon.setScaleX((float) 0.5);
        weatherIcon.setScaleY((float) 0.5);
        weatherIcon.setAdjustViewBounds(true);

        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setGravity(Gravity.CENTER);
        linearLayout.addView(day);
        linearLayout.addView(weatherIcon);

        v.setBackgroundColor(0xFFFFFFFF);
        return v;
    }
}
