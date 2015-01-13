package com.jbrink.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by JDB on 01/11/2015.
 */
/**
* A detail fragment containing a simple view.
*/
public class DetailFragment extends Fragment {

    public DetailFragment() {
    }

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setHasOptionsMenu(false);
        }

        @Override
        public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
            // getActivity().getMenuInflater().inflate(R.menu.menu_main, menu);
            super.onCreateOptionsMenu(menu, inflater);
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {


            return super.onOptionsItemSelected(item);
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_detail, container, false);
            String detailMsg = null;
            Intent intent = getActivity().getIntent();
            if(intent != null && intent.hasExtra(Intent.EXTRA_TEXT)){
                detailMsg = intent.getStringExtra(Intent.EXTRA_TEXT);
                TextView detailview = (TextView) rootView.findViewById(R.id.detail_textview);
                detailview.setText(detailMsg);
            }

            return rootView;
        }

}
