package com.bignerdranch.android.program2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class AmountFragment extends Fragment{
    private EditText mTitleField;
    private EditText mPercentField;
    private RadioGroup mRadioGroup;
    private Button mCalcButton;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_amount, container, false);

        //Editable text field for the bill amount
        mTitleField = (EditText) v.findViewById(R.id.amount_enter);
        mTitleField.addTextChangedListener(new TextWatcher(){
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //Left blank
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //Nothing
            }

            @Override
            public void afterTextChanged(Editable s) {
                //This one too
            }
        });

        //Editable text field for the tip percentage
        mPercentField = (EditText) v.findViewById(R.id.tip_enter);
        mPercentField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //Nothing yet
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //Nothing yet
            }

            @Override
            public void afterTextChanged(Editable s) {
                //Nothing yet
            }
        });

        //Rounding radio group
        mRadioGroup = (RadioGroup) v.findViewById(R.id.round_group);
        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                //Nothing yet
            }
        });

        //Calculation button
        mCalcButton = (Button) v.findViewById(R.id.calc_button);
        mCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Nothing yet
                Toast.makeText(getActivity().getBaseContext(), "Button was pressed", Toast.LENGTH_SHORT).show();
            }
        });

        /*mSolvedCheckBox = (CheckBox) v.findViewById(R.id.crime_solved);
        mSolvedCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mCrime.setSolved(isChecked);
            }
        });*/

        return v;
    }
}
