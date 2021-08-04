package com.example.pager;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class FragmentA extends Fragment {
    private EditText ettext;
    private Button mbtnnext;
    private MainActivity mainActivity;

    @Override
    public void onAttach(@NonNull  Context context) {
        super.onAttach(context);
        mainActivity= (MainActivity) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        inittview(view);
    }

    private void inittview(View view) {
       ettext=view.findViewById(R.id.etName);
       mbtnnext=view.findViewById(R.id.btnSend);
       mbtnnext.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
             String name=ettext.getText().toString();
              if(mainActivity!=null){
                  mainActivity.setdata(name);
              }
           }
       });
    }

}