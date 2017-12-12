package com.bhcc.app.pharmtech.view;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import android.support.v4.app.DialogFragment;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.bhcc.app.pharmtech.R;
import com.bhcc.app.pharmtech.data.MedicineLab;
import com.bhcc.app.pharmtech.data.model.Medicine;
import com.bhcc.app.pharmtech.view.study.CardContainerFragment;

/**
 * Created by Bernard Heres on 11/27/2017.
 */

public class DailyDrugDialogFragment extends DialogFragment {

    private Medicine mMedicine;
    private static final String ARG_MEDICINE_ID = "arg: medicine id";

    public static DailyDrugDialogFragment newInstance(Medicine medicine){
        Bundle args = new Bundle();
        args.putSerializable(ARG_MEDICINE_ID, medicine);
        DailyDrugDialogFragment fragment = new DailyDrugDialogFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        mMedicine = (Medicine)getArguments().getSerializable(ARG_MEDICINE_ID);

        View v = getActivity().getLayoutInflater()
                .inflate(R.layout.fragment_daily_drug, null);

        TextView mDrugName = (TextView) v.findViewById(R.id.medicine_name_textview);
        mDrugName.setText(mMedicine.getGenericName());

        TextView mBrandName = (TextView) v.findViewById(R.id.medicine_brand_name_textview);
        mBrandName.setText("Brand Name: " + mMedicine.getBrandName());

        TextView mPurpose = (TextView) v.findViewById(R.id.medicine_purpose_textview);
        mPurpose.setText("Purpose: " + mMedicine.getPurpose());

        TextView mCategory = (TextView) v.findViewById(R.id.medicine_category_textview);
        mCategory.setText("Category: " + mMedicine.getCategory());

        TextView mDeaSch = (TextView) v.findViewById(R.id.medicine_deaSch_textview);
        mDeaSch.setText("DeaSch: " + mMedicine.getDeaSch());

        TextView mSpecial = (TextView) v.findViewById(R.id.medicine_special_textview);
        mSpecial.setText("Special: " + mMedicine.getSpecial());

        TextView mStudyTopic = (TextView) v.findViewById(R.id.medicine_study_topic_textview);
        mStudyTopic.setText("Study Topic: " + mMedicine.getStudyTopic());



        return new AlertDialog.Builder(getActivity())
                .setView(v)
                .setTitle(R.string.daily_drug_title)
                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        sendResult(Activity.RESULT_OK);
                    }
                })
                .create();
    }

    private void sendResult(int resultCode){
        if(getTargetFragment() == null){
            return;
        }
        Intent i = new Intent();
        i.putExtra(ARG_MEDICINE_ID, mMedicine);
        getTargetFragment()
                .onActivityResult(getTargetRequestCode(), resultCode, i);
    }
}
