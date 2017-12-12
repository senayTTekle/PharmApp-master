package com.bhcc.app.pharmtech.view.legal;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bhcc.app.pharmtech.R;

/**
 * Created by zsousa on 10/31/17.
 */

public class LegalFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_legal, container, false);

        return view;
    }
}
