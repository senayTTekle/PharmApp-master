package com.bhcc.app.pharmtech.view.about;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bhcc.app.pharmtech.R;

/**
 * Created by zsousa on 11/28/17.
 */

public class AboutFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view1 = inflater.inflate(R.layout.activity_about, container, false);

        return view1;
    }

}
