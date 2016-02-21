package com.example.farrukh.convertmee;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;


public class Temperature extends Fragment implements AdapterView.OnItemSelectedListener{

    String[] Tunits = {"Celsius", "Fahrenheit", "Kelvin"};

    EditText text;
    TextView a, b, xc;
    int mSelectedUnit;
    DecimalFormat form = new DecimalFormat("0.00");

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.area_layout,null);

        View myFragmentView = inflater.inflate(R.layout.temperature_layout, container, false);
        Spinner spin = (Spinner) myFragmentView.findViewById(R.id.spinner);
        a = (TextView) myFragmentView.findViewById(R.id.textView9);
        b = (TextView) myFragmentView.findViewById(R.id.textView10);
        xc = (TextView) myFragmentView.findViewById(R.id.textView16);


        text = (EditText) myFragmentView.findViewById(R.id.editText);

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {


            public void onItemSelected(AdapterView<?> parent, View view, final int position, long id) {
                mSelectedUnit = position;
                convert();
            }


            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        text.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {


            }

            @Override
            public void afterTextChanged(Editable s) {

                convert();
            }


        });


        ArrayAdapter aa = new ArrayAdapter(getActivity(), android.R.layout.simple_spinner_item, Tunits);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);


        return myFragmentView;
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void convert() {
        String s = text.getText().toString();
        double ans = 0;
        double c;
        double f;
        double k;


        if (!s.toString().equals("") && s.toString().length() > 0) {

            ans = Double.parseDouble(s.toString());
        }

        if (mSelectedUnit == 0) {
            c = (ans * 1);
            a.setText(form.format(c));

            f = (ans * 9/5 + 32);
            b.setText(form.format(f));

            k = (ans + 273.15);
            xc.setText(form.format(k));


        }

        if (mSelectedUnit == 1) {
            c = ((ans -  32)  * 5/9);
            a.setText(form.format(c));

            f = (ans * 1);
            b.setText(form.format(f));

            k = ((ans + 459.67) * 5/9);
            xc.setText(form.format(k));
        }

        if (mSelectedUnit == 2) {
            c = (ans - 273.15);
            a.setText(form.format(c));

            f = (ans * 9/5 - 459.67);
            b.setText(form.format(f));

            k = (ans * 1);
            xc.setText(form.format(k));

        }


    }



}
