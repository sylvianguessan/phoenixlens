package com.phoenixlens.phoenixlensapp.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.phoenixlens.phoenixlensapp.R;

/**
 * Created by sylvianguessan on 8/20/14.
 */
public class VideoCaptureFragment extends android.support.v4.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_capture_video,
                container, false);
        return view;
    }

}
