package com.example.farrukh.convertmee;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Bmi extends Fragment
{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.bmi_layout,null);

        View myFragmentView = inflater.inflate(R.layout.bmi_layout, container, false);

        final Button b = (Button) myFragmentView.findViewById(R.id.button);

        final   EditText e1 = (EditText) myFragmentView.findViewById(R.id.editText3);
        final   EditText e2 = (EditText) myFragmentView.findViewById(R.id.editText4);
        final   TextView text = (TextView) myFragmentView.findViewById(R.id.textView19);
        final   TextView text1 = (TextView) myFragmentView.findViewById(R.id.textView20);




        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                final  String height = e1.getText().toString();
                final  String weight = e2.getText().toString();


                final float a = Float.parseFloat(height);
                final float c = Float.parseFloat(weight);
                final float ax= (float) (a / 3.2808);
                float bmi = (float) ( c  / ( ax * ax ) );

                text.setText(String.valueOf(bmi));

                if ( bmi < 18.5 ) {
                    text1.setTextColor(Color.parseColor("#ED9911"));
                    text1.setText(" < 18.5 - Underweight");

                }
                else if( bmi > 18.5 && bmi < 24.9) {

                    text1.setTextColor(Color.parseColor("#ED9911"));
                    text1.setText(" 18.5 - 24.9 Normal Weight");
                }
                else if( bmi > 25 && bmi < 29.9) {

                    text1.setTextColor(Color.parseColor("#F00C10"));
                    text1.setText(" 25 - 29.9 Overweight ");
                }
                else if( bmi > 30 && bmi < 34.9) {

                    text1.setTextColor(Color.parseColor("#0F0101"));
                    text1.setText(" 30 - 34.9 Obese ");
                }
                else if( bmi > 35 && bmi < 38.9) {

                    text1.setTextColor(Color.parseColor("#F00C10"));
                    text1.setText(" 35 - 38.9 Very Obese ");
                }
                else {

                    text1.setTextColor(Color.parseColor("#F00C10"));
                    text1.setText("above Morbidly Obese");
                }

            }
        });




        return myFragmentView;
    }
}