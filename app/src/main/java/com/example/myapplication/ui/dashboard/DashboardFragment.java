package com.example.myapplication.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.R;
import com.example.myapplication.S_Appliance;
import com.example.myapplication.S_Electrician;
import com.example.myapplication.S_acrepair;
import com.example.myapplication.S_plumber;
import com.example.myapplication.S_tiffin_activity;
import com.example.myapplication.databinding.FragmentDashboardBinding;

public class DashboardFragment extends Fragment {

    private FragmentDashboardBinding binding;
    ImageView  v;
    ImageView  x;
    ImageView  y;
    ImageView  z;
    ImageView  w;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

              binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        ImageView button =  root.findViewById(R.id.tiffin);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getContext(), S_tiffin_activity.class);
                startActivity(i);

            }
        });

        ImageView button1 =  root.findViewById(R.id.acrepair);
        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View y)
            {
                Intent i = new Intent(getContext(), S_acrepair.class);
                startActivity(i);

            }
        });


        ImageView button2 =  root.findViewById(R.id.appliance);
        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View x)
            {

                Intent i = new Intent(getContext(), S_Appliance.class);
                startActivity(i);

            }
        });

        ImageView button3 =  root.findViewById(R.id.electric);
        button3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View z)
            {

                Intent i = new Intent(getContext(), S_Electrician.class);
                startActivity(i);

            }
        });


        ImageView button4 =  root.findViewById(R.id.plumber);
        button4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View w)
            {

                Intent i = new Intent(getContext(), S_plumber.class);
                startActivity(i);

            }
        });


        return root;


    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;


    }


}