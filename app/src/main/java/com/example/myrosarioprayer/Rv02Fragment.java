package com.example.myrosarioprayer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.example.myrosarioprayer.databinding.FragmentRv02Binding;
import com.example.myrosarioprayer.support.RosarioActions;
import com.example.myrosarioprayer.support.RosarioConsts;

import java.time.LocalDate;

public class Rv02Fragment extends Fragment {

    private FragmentRv02Binding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentRv02Binding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RosarioActions.recitaMisteroDelGiorno = true;

        TextView myTextViewSignalMisteryMk2 = (TextView)  binding.textviewSignalMisteryMk2;
        if (myTextViewSignalMisteryMk2 != null) {

            LocalDate ld = LocalDate.now();
            int misteryDayIndex = ld.getDayOfWeek().getValue();

            String s2 = RosarioConsts.schemeDayMisteryGiovanniPaoloII[misteryDayIndex].symbol + "° " + RosarioConsts.schemeDayMisteryGiovanniPaoloII[misteryDayIndex].textPrayerTooltip;
            myTextViewSignalMisteryMk2.setText(s2);

        }

        binding.buttonFirstAction.setOnClickListener(new View.OnClickListener() {
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
                TextView myTextView1 = (TextView) view.findViewById(R.id.textview_first);
//                TextView myTextView2 = (TextView) view.findViewById(R.id.textview_second);
                myTextViewDummy.setEnabled(false);
                myTextView1.setEnabled(true);
                RosarioActions.agisciUno(view, myTextViewDummy, myTextViewDummy, myTextView1, myTextViewDummy, myTextViewDummy);

            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
