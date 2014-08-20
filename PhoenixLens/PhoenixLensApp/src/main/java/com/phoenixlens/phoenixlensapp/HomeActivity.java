package com.phoenixlens.phoenixlensapp;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.phoenixlens.phoenixlensapp.fragments.ImageCaptureFragment;
import com.phoenixlens.phoenixlensapp.fragments.VideoCaptureFragment;


public  class HomeActivity extends FragmentActivity{

    private SlidingMenu menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle(getResources().getString(R.string.phoenix_lens_title));

        /*getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.content_frame, new MenuListFragment())
                .commit(); */



        // configure the SlidingMenu
        menu = new SlidingMenu(this);
        menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_MARGIN);
        menu.setShadowWidthRes(R.dimen.sliddingmenu_shadow_width);
       // menu.setShadowDrawable(R.drawable.slidd);
        menu.setBehindOffsetRes(R.dimen.slidingmenu_offset);
        menu.setFadeDegree(0.35f);
        menu.attachToActivity(this, SlidingMenu.SLIDING_WINDOW);
        menu.setMenu(R.layout.menu_frame);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.menu_frame,  new MenuListFragment())
                .commit();
        menu.toggle();
    }

    @Override
    public void onBackPressed() {
        if (menu.isMenuShowing()) {
            menu.showContent();
        } else {
            super.onBackPressed();
        }
    }

    public void goToImageCapture()
    {
         getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.content_frame, new ImageCaptureFragment())
                .commit();
        if (menu.isMenuShowing())
            menu.toggle();
    }

    public void goToVideoCapture()
    {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.content_frame, new VideoCaptureFragment())
                .commit();
        if (menu.isMenuShowing())
            menu.toggle();
    }



}
