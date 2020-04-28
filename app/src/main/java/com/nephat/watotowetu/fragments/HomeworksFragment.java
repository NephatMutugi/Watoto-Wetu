package com.nephat.watotowetu.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.nephat.watotowetu.R;

public class HomeworksFragment extends Fragment {

    private static final String TAG = "HomeworksFragment";
    private DescriptionFragment descriptionFragment = new DescriptionFragment();
    //Widgets
    private ImageView imageView1;
    private ImageView imageView2;
    private ImageView imageView3;
    private ImageView imageView4;
    private TextView textMath;
    private TextView textScience;
    private TextView textCRE;
    private TextView textSwahili;

    public HomeworksFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mView = inflater.inflate(R.layout.fragment_homeworks, container, false);

        imageView1 = mView.findViewById(R.id.imageHWork1);
        imageView2 = mView.findViewById(R.id.imageHWork2);
        imageView3 = mView.findViewById(R.id.imageHWork3);
        imageView4 = mView.findViewById(R.id.imageHWork4);
        textMath = mView.findViewById(R.id.mathText);
        textScience = mView.findViewById(R.id.scienceText);
        textCRE = mView.findViewById(R.id.creText);
        textSwahili = mView.findViewById(R.id.swahiliText);

        //final Intent intent = new Intent(getActivity(), HomeworkActivity.class);


        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toDescription();
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toDescription();
            }
        });

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toDescription();
            }
        });

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toDescription();
            }
        });

        textMath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toDescription();
            }
        });

        textScience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toDescription();
            }
        });

        textCRE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toDescription();
            }
        });

        textSwahili.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toDescription();
            }
        });

        return mView;
    }

    private void toDescription(){
        if (getFragmentManager() != null) {
            FragmentTransaction fragmentTransaction= getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, descriptionFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }  else {
            Log.d(TAG, "onClick: You clicked Sheila");
        }
    }
}
