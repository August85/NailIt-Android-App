package com.nailit.fragment;

import java.util.ArrayList;

import com.nailit.R;
import com.nailit.R.layout;
import com.nailit.adapter.OuterNailWrapperModelAdapter;
import com.nailit.model.OuterNailWrapperModel;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.content.Context;

//allnailboxesparentlistview

public class AllNailBoxesFragment extends Fragment  {
	 @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,
	            Bundle savedInstanceState) {
	  
	     ListView nailBoxListView;
	     OuterNailWrapperModelAdapter adapter;
	     ArrayList<OuterNailWrapperModel> outerNailWrappers = new ArrayList<OuterNailWrapperModel>();
	     
	     
	     outerNailWrappers.add(new OuterNailWrapperModel("first Nailbox", "august", "hammer it!", 5, 5));
	     outerNailWrappers.add(new OuterNailWrapperModel("second Nailbox", "august", "hammer it!", 6, 5));
	     outerNailWrappers.add(new OuterNailWrapperModel("third Nailbox", "sid", "hammer it!", 8, 15));
	     outerNailWrappers.add(new OuterNailWrapperModel("fourth Nailbox", "vaseem", "hammer it!", 25, 5));
	     
	     adapter = new OuterNailWrapperModelAdapter(getActivity().getApplicationContext(), outerNailWrappers);
	     
	     
	     nailBoxListView = (ListView) getActivity().findViewById(R.id.allnailboxesparentlistview);
	     nailBoxListView.setAdapter(adapter);
	     
        View rootView = inflater.inflate(R.layout.fragment_all_nailboxes, container, false);
          
        return rootView;
	    }
}
