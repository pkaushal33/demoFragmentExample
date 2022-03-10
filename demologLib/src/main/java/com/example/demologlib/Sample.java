package com.example.demologlib;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Sample#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Sample extends Fragment {

    Button btnClick;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sample, container, false);

        btnClick = view.findViewById(R.id.btnClick);
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertMessage message = new AlertMessage("Button","button is clicked.");
                message.showAlert(getActivity());
            }
        });

        return view;
    }
}