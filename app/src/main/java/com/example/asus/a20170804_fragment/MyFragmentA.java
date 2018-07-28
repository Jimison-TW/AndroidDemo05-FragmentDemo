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

public class MyFragmentA extends Fragment {

    Context context;
    Handler handler;

    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        context=getActivity();
        handler=new Handler();
    }

    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle saveInstanceState){
        View view=inflater.inflate(R.layout.fragment_a,container,false);
        return view;
    }

    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        TextView pincode=(TextView)getView().findViewById(R.id.pincode);
        showPinCode(pincode);
    }

    public void showPinCode(final TextView pincode){
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                int pcode=(int)(Math.random()*1000);
                pincode.setText(String.valueOf(pcode));
                showPinCode(pincode);
            }
        },3000);
    }

    public void onPause(){
        super.onPause();
    }

}
