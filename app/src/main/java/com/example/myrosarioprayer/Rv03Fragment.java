package com.example.myrosarioprayer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.example.myrosarioprayer.databinding.FragmentRv03Binding;
import com.example.myrosarioprayer.support.RosarioActions;
import com.example.myrosarioprayer.support.RosarioConsts;

import java.time.LocalDate;

public class Rv03Fragment extends Fragment {

    private FragmentRv03Binding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentRv03Binding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonFirstAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewNested) {
                TextView myTextViewDummy = new TextView(view.getContext());
                TextView myTextView1 = (TextView) view.findViewById(R.id.textview_third);
//                TextView myTextView2 = (TextView) view.findViewById(R.id.textview_second);
                RosarioActions.agisciSantaRita(view, null, null, null, myTextView1);

            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


}
