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

public class Weight extends Fragment implements AdapterView.OnItemSelectedListener {

    String[] Wunits = {"Gram", "Kilogram", "Pound", "Ounce", "Stone", "Tonne", "Imperial Ton"};

    EditText text;
    TextView a, b, c, d, e, f, g;
    int mSelectedUnit;
    DecimalFormat form = new DecimalFormat("0.00");

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.area_layout,null);

        View myFragmentView = inflater.inflate(R.layout.weight_layout, container, false);
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


        ArrayAdapter aa = new ArrayAdapter(getActivity(), android.R.layout.simple_spinner_item, Wunits);
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
        double gram;
        double kilogram;
        double pound;
        double ounce;
        double stone;
        double tonne;
        double imton;

        if (!s.toString().equals("") && s.toString().length() > 0) {

            ans = Double.parseDouble(s.toString());
        }

        if (mSelectedUnit == 0) {
            gram = (ans * 1);
            a.setText(form.format(gram));

            kilogram = (ans * 0.001);
            b.setText(form.format(kilogram));

            pound = (ans * 0.00220462);
            c.setText(form.format(pound));

            ounce = (ans * (0.035274));
            d.setText(form.format(ounce));

            stone = ((ans * 0.000157473));
            e.setText(form.format(stone));

            tonne = (ans * 1e-6);
            f.setText(form.format(tonne));

            imton = (ans * 9.8421e-7);
            g.setText(form.format(imton));
        }

        if (mSelectedUnit == 1) {
            gram = (ans * 1000.000479969300045);
            a.setText(form.format(gram));

            kilogram = (ans * 1);
            b.setText(form.format(kilogram));

            pound = (ans * 2.204623679999952568);
            c.setText(form.format(pound));

            ounce = (ans * (35.273978879999241087));
            d.setText(form.format(ounce));

            stone = ((ans * 0.15747311999999660803));
            e.setText(form.format(stone));

            tonne = (ans * 0.0010000004799693);
            f.setText(form.format(tonne));

            imton = (ans * 0.000984207);
            g.setText(form.format(imton));

        }

        if (mSelectedUnit == 2) {
            gram = (ans * 453.592);
            a.setText(form.format(gram));

            kilogram = (ans * 0.453592000004704);
            b.setText(form.format(kilogram));

            pound = (ans * 1);
            c.setText(form.format(pound));

            ounce = (ans * (15.999986948800007269));
            d.setText(form.format(ounce));

            stone = (ans * (0.071428513164285750703));
            e.setText(form.format(stone));

            tonne = (ans * 0.00045359200000470408561);
            f.setText(form.format(tonne));

            imton = (ans * 0.00044642820727678597442);
            g.setText(form.format(imton));

        }

        if (mSelectedUnit == 3) {
            gram = (ans * 28.349740849300012258);
            a.setText(form.format(gram));

            kilogram = (ans * 0.028349740849300014006);
            b.setText(form.format(kilogram));

            pound = (ans * 0.062500479999917132878);
            c.setText(form.format(pound));

            ounce = (ans * (1));
            d.setText(form.format(ounce));

            stone = ((ans * 0.0044643199999940801764));
            e.setText(form.format(stone));

            tonne = (ans * 2.83497408493e-5);
            f.setText(form.format(tonne));

            imton = (ans * 2.7902e-5);
            g.setText(form.format(imton));

        }

        if (mSelectedUnit == 4) {
            gram = (ans * 6350.29);
            a.setText(form.format(gram));

            kilogram = (ans * 6.35028999977318);
            b.setText(form.format(kilogram));

            pound = (ans * 13.999992988800009641);
            c.setText(form.format(pound));

            ounce = (ans * (223.99988782080015426));
            d.setText(form.format(ounce));

            stone = ((ans * 1));
            e.setText(form.format(stone));

            tonne = (ans * 0.0063502899997731794557);
            f.setText(form.format(tonne));

            imton = (ans * 0.0062499968700000041802);
            g.setText(form.format(imton));

        }

        if (mSelectedUnit == 5) {
            gram = (ans * 1000000.4799998030066);
            a.setText(form.format(gram));

            kilogram = (ans * 1000.0004799998030194);
            b.setText(form.format(kilogram));

            pound = (ans * 2204.6236800671999845);
            c.setText(form.format(pound));

            ounce = (ans * (35273.978881075199752));
            d.setText(form.format(ounce));

            stone = ((ans * 157.4731200048));
            e.setText(form.format(stone));

            tonne = (ans * 1);
            f.setText(form.format(tonne));

            imton = (ans * 0.984207);
            g.setText(form.format(imton));
        }

        if (mSelectedUnit == 6) {
            gram = (ans * 1.016e+6);
            a.setText(form.format(gram));

            kilogram = (ans * 1016.00000004792);
            b.setText(form.format(kilogram));

            pound = (ans * 2239.8965839040015453);
            c.setText(form.format(pound));

            ounce = (ans * (35838.345342464024725));
            d.setText(form.format(ounce));

            stone = ((ans * 159.99261313600010226));
            e.setText(form.format(stone));

            tonne = (ans * 1.0160000000479199045);
            f.setText(form.format(tonne));

            imton = (ans * 1);
            g.setText(form.format(imton));

        }
    }

}
