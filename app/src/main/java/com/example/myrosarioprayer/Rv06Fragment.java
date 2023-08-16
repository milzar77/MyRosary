package com.example.myrosarioprayer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.example.myrosarioprayer.databinding.FragmentRv05Binding;
import com.example.myrosarioprayer.databinding.FragmentRv06Binding;
import com.example.myrosarioprayer.support.RosarioActions;

public class Rv06Fragment extends Fragment {

    private FragmentRv06Binding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentRv06Binding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonFirstAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewNested) {
                TextView myTextViewDummy = new TextView(view.getContext());
                TextView myTextView1 = (TextView) view.findViewById(R.id.textview_sixth);
                TextView myTextViewProgressive = (TextView) view.findViewById(R.id.tvProgressive2);
                RosarioActions.agisciAumChant(view, myTextView1, myTextViewProgressive);

            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


}
