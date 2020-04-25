package com.nephat.watotowetu.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nephat.watotowetu.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PupilsFragment extends Fragment {

    public PupilsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pupils, container, false);
    }
}
