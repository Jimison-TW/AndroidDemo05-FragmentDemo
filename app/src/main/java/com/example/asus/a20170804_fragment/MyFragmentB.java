package com.example.asus.a20170804_fragment;

/**
 * Created by ASUS on 2017/8/4.
 */
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;

import android.widget.*;


public class MyFragmentB extends Fragment {
    Context context;
    TextView textView1;
    Button button1;

    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        context=getActivity();
    }

    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle saveInstanceState){
        View view=inflater.inflate(R.layout.fragment_b,container,false);
        return view;
    }

    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        button1=(Button)getView().findViewById(R.id.button1);
        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView pincode=(TextView)getActivity().findViewById(R.id.pincode);
                Toast.makeText(context,pincode.getText(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void onPause(){
        super.onPause();
    }
}
