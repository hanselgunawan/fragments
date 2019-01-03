package com.hanseltritama.memegenerator;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class TopSectionFragment extends Fragment {

    private EditText topTextInput;
    private Button myBtn;

    TopSectionListener topSectionCommander;

    public interface TopSectionListener{
        void createMeme(String customText);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try {

            topSectionCommander = (TopSectionListener) context;

        } catch (Exception e) {

            throw new ClassCastException(context.toString());

        }

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.top_section_fragment, container, false);

        topTextInput = view.findViewById(R.id.editText);
        myBtn = view.findViewById(R.id.button);

        myBtn.setOnClickListener(
            new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    buttonClicked(view);
                }
            }
        );

        return view;

    }

    public void buttonClicked(View view) {

        topSectionCommander.createMeme(topTextInput.getText().toString());

    }
}
