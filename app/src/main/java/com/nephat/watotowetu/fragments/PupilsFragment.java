package com.nephat.watotowetu.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.nephat.watotowetu.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PupilsFragment extends Fragment {

    private static final String TAG = "PupilsFragment";
    private HomeworksFragment homeworksFragment = new HomeworksFragment();
    
    private LinearLayout sheilaLayout;

    public PupilsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mView =  inflater.inflate(R.layout.fragment_pupils, container, false);

        sheilaLayout = mView.findViewById(R.id.linearLayout4);

        sheilaLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getFragmentManager() != null) {
                    FragmentTransaction fragmentTransaction= getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, homeworksFragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }  else {
                    Log.d(TAG, "onClick: You clicked Sheila");
                }
            }
        });
        return mView;
    }

}
