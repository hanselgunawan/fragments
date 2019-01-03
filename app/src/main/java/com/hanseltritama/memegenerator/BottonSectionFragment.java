package com.hanseltritama.memegenerator;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BottonSectionFragment extends Fragment{

    private TextView myTextView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.bottom_section_fragment, container, false);

        myTextView = view.findViewById(R.id.textView);

        return view;

    }

    public void setMemeText(String userText) {

        myTextView.setText(userText);

    }

}
