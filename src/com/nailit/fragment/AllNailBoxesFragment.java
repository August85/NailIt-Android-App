package com.nailit.fragment;

import java.util.ArrayList;

import com.nailit.R;
import com.nailit.R.layout;
import com.nailit.adapter.OuterNailWrapperModelAdapter;
import com.nailit.model.OuterNailWrapperModel;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.content.Context;

public class AllNailBoxesFragment extends ListFragment {

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		// String[] values = new String[] { "Android", "iPhone",
		// "WindowsMobile",
		// "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
		// "Linux", "OS/2" };

		ListView nailBoxListView;
		OuterNailWrapperModelAdapter adapter;
		ArrayList<OuterNailWrapperModel> outerNailWrappers = new ArrayList<OuterNailWrapperModel>();

		outerNailWrappers.add(new OuterNailWrapperModel("first Nailbox",
				"august", "hammer it!", 5, 5));
		outerNailWrappers.add(new OuterNailWrapperModel("second Nailbox",
				"august", "hammer it!", 6, 5));
		outerNailWrappers.add(new OuterNailWrapperModel("third Nailbox", "sid",
				"hammer it!", 8, 15));
		outerNailWrappers.add(new OuterNailWrapperModel("fourth Nailbox",
				"vaseem", "hammer it!", 25, 5));

		adapter = new OuterNailWrapperModelAdapter(getActivity()
				.getApplicationContext(), outerNailWrappers);

		nailBoxListView = (ListView) getActivity().findViewById(
				R.id.allnailboxesparentlistview);
		nailBoxListView.setAdapter(adapter);

		// ArrayAdapter<String> adapter = new
		// ArrayAdapter<String>(getActivity(),
		// android.R.layout.simple_list_item_1, values);
		setListAdapter(adapter);

		// View rootView =
		// inflater.inflate(R.layout.fragment_all_nailboxes_parent, container,
		// false);

		// return rootView;
	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		// do something with the data

	}

}
