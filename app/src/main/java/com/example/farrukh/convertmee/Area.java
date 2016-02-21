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


public class Area extends Fragment implements AdapterView.OnItemSelectedListener{

    String[] Aunits = {"Acre", "Square Mile", "Square Yards", "Square Foot", "Square Km", "Hectare", "Square Meter"};

    EditText text;
    TextView a, b, c, d, e, f, g;
    int mSelectedUnit;
    DecimalFormat form = new DecimalFormat("0.00");

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.area_layout,null);

        View myFragmentView = inflater.inflate(R.layout.area_layout, container, false); 
        Spinner spin = (Spinner) myFragmentView.findViewById(R.id.spinner);
        a = (TextView) myFragmentView.findViewById(R.id.textView9);
        b = (TextView) myFragmentView.findViewById(R.id.textView10);
        c = (TextView) myFragmentView.findViewById(R.id.textView11);
        d = (TextView) myFragmentView.findViewById(R.id.textView12);
        e = (TextView) myFragmentView.findViewById(R.id.textView13);
        f = (TextView) myFragmentView.findViewById(R.id.textView14);
        g = (TextView) myFragmentView.findViewById(R.id.textView15);

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


        ArrayAdapter aa = new ArrayAdapter(getActivity(), android.R.layout.simple_spinner_item, Aunits);
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
        double acre;
        double sqmile;
        double sqyard;
        double sqfoot;
        double sqkmeter;
        double hectre;
        double sqmeter;

        if (!s.toString().equals("") && s.toString().length() > 0) {

            ans = Double.parseDouble(s.toString());
        }

        if (mSelectedUnit == 0) {
            acre = (ans * 1);
            a.setText(form.format(acre));

            sqmile = (ans * 0.001562);
            b.setText(form.format(sqmile));

            sqyard = (ans * 4840);
            c.setText(form.format(sqyard));

            sqfoot = (ans * (43560));
            d.setText(form.format(sqfoot));

            sqkmeter = ((ans * 0.00404686));
            e.setText(form.format(sqkmeter));

            hectre = (ans * 0.404686);
            f.setText(form.format(hectre));

            sqmeter = (ans * 4047);
            g.setText(form.format(sqmeter));
        }

        if (mSelectedUnit == 1) {
            acre = (ans * 640);
            a.setText(form.format(acre));

            sqmile = (ans * 1);
            b.setText(form.format(sqmile));

            sqyard = (ans * 3097600);
            c.setText(form.format(sqyard));

            sqfoot = (ans * (27878400));
            d.setText(form.format(sqfoot));

            sqkmeter = ((ans * 2.58999));
            e.setText(form.format(sqkmeter));

            hectre = (ans * 258.999);
            f.setText(form.format(hectre));

            sqmeter = (ans * 2589988);
            g.setText(form.format(sqmeter));

        }

        if (mSelectedUnit == 2) {
            acre = (ans * 0.0002066);
            a.setText(form.format(acre));

            sqmile = (ans * 0.0000003228);
            b.setText(form.format(sqmile));

            sqyard = (ans * 1);
            c.setText(form.format(sqyard));

            sqfoot = (ans * (9));
            d.setText(form.format(sqfoot));

            sqkmeter = (ans * (8.3613e-7));
            e.setText(form.format(sqkmeter));

            hectre = (ans * 8.36130002162e-5);
            f.setText(form.format(hectre));

            sqmeter = (ans * 0.8361);
            g.setText(form.format(sqmeter));

        }

        if (mSelectedUnit == 3) {
            acre = (ans * 0.00002296);
            a.setText(form.format(acre));

            sqmile = (ans * 0.00000003587);
            b.setText(form.format(sqmile));

            sqyard = (ans * 0.1111);
            c.setText(form.format(sqyard));

            sqfoot = (ans * (1));
            d.setText(form.format(sqfoot));

            sqkmeter = ((ans * 9.2903e-8));
            e.setText(form.format(sqkmeter));

            hectre = (ans * 9.2903e-6);
            f.setText(form.format(hectre));

            sqmeter = (ans * 0.09290);
            g.setText(form.format(sqmeter));

        }

        if (mSelectedUnit == 4) {
            acre = (ans * 247.105);
            a.setText(form.format(acre));

            sqmile = (ans * 0.386101562516544);
            b.setText(form.format(sqmile));

            sqyard = (ans * 1195988.2000512466766);
            c.setText(form.format(sqyard));

            sqfoot = (ans * (10763893.800461219624));
            d.setText(form.format(sqfoot));

            sqkmeter = ((1));
            e.setText(form.format(sqkmeter));

            hectre = (ans * 99.999845630000081087);
            f.setText(form.format(hectre));

            sqmeter = (ans * 999998.45630000077654);
            g.setText(form.format(sqmeter));

        }

        if (mSelectedUnit == 5) {
            acre = (ans * 2.47105);
            a.setText(form.format(acre));

            sqmile = (ans * 0.00386101562516544);
            b.setText(form.format(sqmile));

            sqyard = (ans * 11959.88200051246713);
            c.setText(form.format(sqyard));

            sqfoot = (ans * (107638.93800461219507));
            d.setText(form.format(sqfoot));

            sqkmeter = ((ans * 0.0099999845630000076813));
            e.setText(form.format(sqkmeter));

            hectre = (ans * 1);
            f.setText(form.format(hectre));

            sqmeter = (ans * 9999.9845630000072561);
            g.setText(form.format(sqmeter));
        }

        if (mSelectedUnit == 6) {
            acre = (ans * 0.00024710514234328718151);
            a.setText(form.format(acre));

            sqmile = (ans * 3.861017849113862317e-7);
            b.setText(form.format(sqmile));

            sqyard = (ans * 1.19598888894151);
            c.setText(form.format(sqyard));

            sqfoot = (ans * (10.7639));
            d.setText(form.format(sqfoot));

            sqkmeter = ((ans * 1e-6));
            e.setText(form.format(sqkmeter));

            hectre = (ans * 1e-4);
            f.setText(form.format(hectre));

            sqmeter = (ans * 1);
            g.setText(form.format(sqmeter));

        }
    }
        
        
    }

