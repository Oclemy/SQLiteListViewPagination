package com.tutorials.hp.sqlitelistviewpagination.mAdapterView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.tutorials.hp.sqlitelistviewpagination.R;
import com.tutorials.hp.sqlitelistviewpagination.mDB.Spacecraft;

import java.util.List;

/**
 * Created by Oclemy on 3/14/2017 for ProgrammingWizards Channel and http://www.camposha.info for ProgrammingWizards Channel and http://www.camposha.info.
 */
public class CustomAdapter extends BaseAdapter {

    Context c;
    List<Spacecraft> spacecrafts;
    LayoutInflater inflater;

    /*
    GET CONTEXT AS WELL AS LIST OF SPACECRAFTS
     */
    public CustomAdapter(Context c, List<Spacecraft> spacecrafts) {
        this.c = c;
        this.spacecrafts = spacecrafts;
    }

    /*
    TOTAL NUM OF SPACECRAFTS TO BIND
     */
    @Override
    public int getCount() {
        return spacecrafts.size();
    }

    /*
    GET SPACECRAFT
     */
    @Override
    public Object getItem(int position) {
        return spacecrafts.get(position);
    }

    /*
    SPACECRAFT ID
     */
    @Override
    public long getItemId(int position) {
        return position;
    }

    /*
    RETURN VIEW ITEM TO BE RENDERED IN LISTVIEW
     */
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if(inflater==null)
        {
            inflater= (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if(convertView==null)
        {
            convertView=inflater.inflate(R.layout.model,parent,false);
        }

        TextView nameTxt= (TextView) convertView.findViewById(R.id.nameTxt);
        TextView propTxt= (TextView) convertView.findViewById(R.id.propellantTxt);

        //BIND DATA

        nameTxt.setText(spacecrafts.get(position).getName());
        propTxt.setText(spacecrafts.get(position).getPropellant());

        //SET CLICK
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(c, spacecrafts.get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        });

        return convertView;
    }

}








