package com.example.myrosarioprayer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.example.myrosarioprayer.databinding.FragmentRv01Binding;
import com.example.myrosarioprayer.support.RosarioActions;

public class Rv01Fragment extends Fragment {

    private FragmentRv01Binding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentRv01Binding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RosarioActions.recitaMisteroDelGiorno = false;

        binding.buttonSecondAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewNested) {
//                TextView myTextView1 = (TextView) view.findViewById(R.id.textview_first);
                TextView myTextView2 = (TextView) view.findViewById(R.id.textview_second);
                RosarioActions.agisciUno(view, null, myTextView2, null, null);

            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
        RosarioActions.restartRosario();
    }

}
