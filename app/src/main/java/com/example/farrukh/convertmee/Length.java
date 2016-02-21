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

public class Length extends Fragment implements AdapterView.OnItemSelectedListener

{
    String[] Lunits = {"Inches", "Feet", "Yards", "Miles", "Km", "Meters", "Centimeters"};

    EditText text;
    TextView a, b, c, d, e, f, g;
    int mSelectedUnit;
    DecimalFormat form = new DecimalFormat("0.00");
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // return inflater.inflate(R.layout.length_layout,null);


        View myFragmentView = inflater.inflate(R.layout.length_layout, container, false); //get laength.xml
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


        ArrayAdapter aa = new ArrayAdapter(getActivity(), android.R.layout.simple_spinner_item, Lunits);
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
        if (!s.toString().equals("") && s.toString().length() > 0) {

            ans = Double.parseDouble(s.toString());
        }

        if (mSelectedUnit == 0) {
            double inches = (ans * 1);
            a.setText(form.format(inches));

            double feet = (ans * 0.0833);
            b.setText(form.format(feet));

            double yards = (ans * 0.02777778);
            c.setText(form.format(yards));

            double miles = (ans * (1 / 63360));
            d.setText(form.format(miles));

            double kilometers = ((ans / 39370));
            e.setText(form.format(kilometers));

            double meters = (ans * 0.0254);
            f.setText(form.format(meters));

            double centimeters = (ans * 2.54);
            g.setText(form.format(centimeters));
        }

        if (mSelectedUnit == 1) {
            double inches = (ans * 12);
            a.setText(form.format(inches));

            double feet = (ans * 1);
            b.setText(form.format(feet));

            double yards = (ans * 0.3333333);
            c.setText(form.format(yards));

            double miles = (ans * (0.0001893939));
            d.setText(form.format(miles));

            double kilometers = (ans * 0.0003048);
            e.setText(form.format(kilometers));

            double meters = (ans * 0.3048);
            f.setText(form.format(meters));

            double centimeters = (ans * 30.48);
            g.setText(form.format(centimeters));

        }

        if (mSelectedUnit == 2) {
            double inches = (ans * 36);
            a.setText(form.format(inches));

            double feet = (ans * 3);
            b.setText(form.format(feet));

            double yards = (ans * 1);
            c.setText(form.format(yards));

            double miles = (ans * (0.00056818181818182));
            d.setText(form.format(miles));

            double kilometers = (ans * 0.0009144);
            e.setText(form.format(kilometers));

            double meters = (ans * 	0.9144);
            f.setText(form.format(meters));

            double centimeters = (ans * 91.44);
            g.setText(form.format(centimeters));

        }

        if (mSelectedUnit == 3) {
            double inches = (ans * 63360);
            a.setText(form.format(inches));

            double feet = (ans * 5280);
            b.setText(form.format(feet));

            double yards = (ans * 1760);
            c.setText(form.format(yards));

            double miles = (ans * (1));
            d.setText(form.format(miles));

            double kilometers = (ans * 1.609344);
            e.setText(form.format(kilometers));

            double meters = (ans * 1609.344);
            f.setText(form.format(meters));

            double centimeters = (ans * 160934.4);
            g.setText(form.format(centimeters));

        }

        if (mSelectedUnit == 4) {
            double inches = (ans * 39370.078740157);
            a.setText(form.format(inches));

            double feet = (ans * 3280.8398950131);
            b.setText(form.format(feet));

            double yards = (ans * 1093.6132983377);
            c.setText(form.format(yards));

            double miles = (ans * (0.62137119223733));
            d.setText(form.format(miles));

            double kilometers = (ans * 1);
            e.setText(form.format(kilometers));

            double meters = (ans * 1000);
            f.setText(form.format(meters));

            double centimeters = (ans * 30.48);
            g.setText(form.format(100000));

        }

        if (mSelectedUnit == 5) {
            double inches = (ans * 39.370078740157);
            a.setText(form.format(inches));

            double feet = (ans * 3.2808398950131);
            b.setText(form.format(feet));

            double yards = (ans * 1.0936132983377);
            c.setText(form.format(yards));

            double miles = (ans * (0.00062137119223733));
            d.setText(form.format(miles));

            double kilometers = (ans * 	0.001);
            e.setText(form.format(kilometers));

            double meters = (ans * 1);
            f.setText(form.format(meters));

            double centimeters = (ans * 100);
            g.setText(form.format(centimeters));

        }

        if (mSelectedUnit == 6) {
            double inches = (ans * 0.39370078740157);
            a.setText(form.format(inches));

            double feet = (ans * 0.032808398950131);
            b.setText(form.format(feet));

            double yards = (ans * 0.010936132983377);
            c.setText(form.format(yards));

            double miles = (ans * (0.0000062137119223733));
            d.setText(form.format(miles));

            double kilometers = (ans * 0.00001);
            e.setText(form.format(kilometers));

            double meters = (ans * 0.01);
            f.setText(form.format(meters));

            double centimeters = (ans * 1);
            g.setText(form.format(centimeters));

        }
    }
}
