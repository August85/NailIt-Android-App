package com.nailit.adapter;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nailit.R;
import com.nailit.model.OuterNailWrapperModel;

public class OuterNailWrapperModelAdapter extends BaseAdapter {
    
    private Context context;
    private ArrayList<OuterNailWrapperModel> outerNailWrapperItems;
    
    public OuterNailWrapperModelAdapter(Context con, ArrayList<OuterNailWrapperModel> model) {
        this.context = con;
        this.outerNailWrapperItems = model;        
    }

    @Override
    public int getCount() {
        return outerNailWrapperItems.size();
    }

    @Override
    public Object getItem(int position) {
        return outerNailWrapperItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater)
                    context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.fragment_my_nails, null);
        }
          
        ImageView imgIcon = (ImageView) convertView.findViewById(R.id.outernailicon);
        TextView nailerName = (TextView) convertView.findViewById(R.id.firstlineouternailbox);
        TextView nailBoxName = (TextView) convertView.findViewById(R.id.secondlineouternailbox);
          
        imgIcon.setImageResource(outerNailWrapperItems.get(position).getIcon());        
        nailerName.setText(outerNailWrapperItems.get(position).getNailerName());
        nailBoxName.setText(outerNailWrapperItems.get(position).getNailBoxName());
         
        // displaying count
        // check whether it set visible or not
//        if(navDrawerItems.get(position).getCounterVisibility()){
//            txtCount.setText(navDrawerItems.get(position).getCount());
//        }else{
//            // hide the counter view
//            txtCount.setVisibility(View.GONE);
//        }
         
        return convertView;
    }

}
