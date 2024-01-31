package com.example.weatherx;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


public class AboutFragment extends Fragment {
    TextView insta;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_about, container, false);

        TextView git_link = rootView.findViewById(R.id.git_link);
        git_link.setMovementMethod(LinkMovementMethod.getInstance());
        TextView button = rootView.findViewById(R.id.button);
        button.setMovementMethod(LinkMovementMethod.getInstance());

        return rootView;



    }


}