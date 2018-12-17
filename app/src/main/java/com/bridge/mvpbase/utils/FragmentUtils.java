package com.bridge.mvpbase.utils;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class FragmentUtils {


    public static void addFragment(AppCompatActivity context, Fragment fragment,int viewID) {
        FragmentTransaction ft = context.getSupportFragmentManager()
                .beginTransaction();
        ft.add( viewID, fragment).commit();
    }
    public static void replaceFragment(AppCompatActivity context, Fragment fragment,int viewID) {
        FragmentTransaction ft = context.getSupportFragmentManager()
                .beginTransaction();
        ft.replace( viewID, fragment).commit();
    }
}
