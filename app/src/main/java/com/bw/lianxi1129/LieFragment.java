package com.bw.lianxi1129;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class LieFragment extends Fragment {


    private Button bt;
    private ViewPager vp;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=View.inflate(getContext(),R.layout.fragment_lie,null);
        bt = view.findViewById(R.id.bt);
        vp = view.findViewById(R.id.vp);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(getActivity(),Main2Activity.class);
                startActivity(it);
            }
        });
        return view;

    }

}
