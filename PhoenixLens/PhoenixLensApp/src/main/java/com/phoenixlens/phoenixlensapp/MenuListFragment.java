package com.phoenixlens.phoenixlensapp;

import android.app.ListFragment;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by sylvianguessan on 8/20/14.
 */
public class MenuListFragment extends android.support.v4.app.ListFragment {

    String[] mTitles;

    MenuListAdapter mAdapter;
    LayoutInflater mInflater;

    @Override
    public void onListItemClick(ListView l, View v, int position, long id)
    {
        switch (position)
        {
            case 0:
            {
                ((HomeActivity) getActivity() ).goToImageCapture();
                 break;
            }
            case 1:
            {
                ((HomeActivity) getActivity() ).goToVideoCapture();
                break;
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mTitles = new String[]{getActivity().getString(R.string.image_capture)
                              , getActivity().getString(R.string.video_capture)
                              , getActivity().getString(R.string.image_editing)
                              ,getActivity().getString(R.string.image_object_detection)
                              ,getActivity().getString(R.string.video_motion_detection)
                              };
        mInflater = inflater;
        mAdapter = new  MenuListAdapter(
                mInflater.getContext(), mTitles);
        setListAdapter(mAdapter);
        return super.onCreateView(inflater, container, savedInstanceState);
    }


    @Override
    public void onResume() {
        super.onResume();
    }
    @Override
    public void onActivityCreated (Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        getListView().setDivider(new ColorDrawable(getActivity().getResources().getColor(R.color.White)));
        getListView().setDividerHeight(2);
    }

}