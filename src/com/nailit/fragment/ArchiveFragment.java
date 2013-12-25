package com.nailit.fragment;

import com.nailit.R;
import com.nailit.R.layout;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
 
public class ArchiveFragment extends Fragment {
     
    public ArchiveFragment(){}
     
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
  
        View rootView = inflater.inflate(R.layout.fragment_archive, container, false);
          
        return rootView;
    }
}