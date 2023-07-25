package com.example.myrosarioprayer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.example.myrosarioprayer.databinding.FragmentRv03Binding;
import com.example.myrosarioprayer.databinding.FragmentRv04Binding;
import com.example.myrosarioprayer.support.RosarioActions;

public class Rv04Fragment extends Fragment {

    private FragmentRv04Binding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentRv04Binding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonSecondAction4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewNested) {
//resetting
                /*TextView myTextView01 = (TextView) view.findViewById(R.id.textview_first);
                myTextView01.setEnabled(false);
                TextView myTextView02 = (TextView) view.findViewById(R.id.textview_second);
                myTextView02.setEnabled(false);
                TextView myTextView03 = (TextView) view.findViewById(R.id.textview_third);
                myTextView03.setEnabled(false);
                TextView myTextView04 = (TextView) view.findViewById(R.id.textview_fourth);
                myTextView04.setEnabled(false);*/

//setting
                TextView myTextViewDummy = new TextView(view.getContext());
                TextView myTextView1 = (TextView) view.findViewById(R.id.textview_fourth);
//                TextView myTextView2 = (TextView) view.findViewById(R.id.textview_second);
                myTextViewDummy.setEnabled(false);
                myTextView1.setEnabled(true);
                RosarioActions.agisciUno(view, myTextViewDummy, myTextViewDummy, myTextViewDummy, myTextViewDummy, myTextView1);

            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


}
