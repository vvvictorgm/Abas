package com.barbaburguer.abas.Fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.barbaburguer.abas.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class EmAlta extends Fragment {


    public EmAlta() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_em_alta, container, false);
    }

}