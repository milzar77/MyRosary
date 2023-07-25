package com.example.myrosarioprayer.support;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.example.myrosarioprayer.R;

import java.time.LocalDate;

public class RosarioActions {

    private static Integer prayerIndex = 0;
    private static Integer globalPrayerIndex = 0;
    private static Integer theMorningStarPrayerIndex = 0;

    private static Integer TOTAL_MISTERY = 4;

    private static Integer decinaIndex = 0;

    private static Integer misteryIndex = 0;

    private static Integer misteryDayIndex = 0;

    private static String graniPrecedenti = "";

    public static Boolean recitaMisteroDelGiorno = false;

    public static void agisciSantaRita(@NonNull View view, TextView myTextView1, TextView myTextView2, TextView myTextView3, TextView myTextView4) {

        if (misteryIndex==0) {
            if (prayerIndex < RosarioConsts.schemeMantraForAllOfUs2.length) {
                if (myTextView4 != null)
                    myTextView4.append(RosarioConsts.schemeMantraForAllOfUs2[prayerIndex].symbol);
                prayerIndex++;
            } else {
                prayerIndex = 0;
                graniPrecedenti = "";
                misteryIndex++;
            }
        }

    }

    public static void agisciUno(@NonNull View view, TextView...myTextView)  {

        Boolean riseTheMorningStar = false;

        if (myTextView[4].isEnabled()) {
            TOTAL_MISTERY = 3;
        } else {
            TOTAL_MISTERY = 4;
        }

        if (misteryIndex<TOTAL_MISTERY) {

            if (globalPrayerIndex < RosarioConsts.schemeMantraForAllOfUs.length * RosarioConsts.MANTRA_TOTALCOUNT_FORALLOFUS) {
                if (prayerIndex < RosarioConsts.schemeMantraForAllOfUs.length) {
                    //jta.setText(currentText + RosarioConsts.schemeMantraForAllOfUs[prayerIndex].textSymbol);
                    if (myTextView[0].isEnabled())
                        myTextView[0].append(RosarioConsts.schemeMantraForAllOfUs[prayerIndex].symbol);
                    if (myTextView[2].isEnabled())
                        myTextView[2].append(RosarioConsts.schemeMantraForAllOfUs[prayerIndex].symbol);
                    if (myTextView[3].isEnabled())
                        myTextView[3].append(RosarioConsts.schemeMantraForAllOfUs2[prayerIndex].symbol);
                    graniPrecedenti = graniPrecedenti + RosarioConsts.schemeMantraForAllOfUs[prayerIndex].symbol;
                    if (myTextView[1].isEnabled())
                        myTextView[1].setText(graniPrecedenti);
                    if (myTextView[4].isEnabled())
                        myTextView[4].setText(graniPrecedenti);

                    prayerIndex++;
                } else {
                    decinaIndex++;
                    prayerIndex = 0;
                    graniPrecedenti = "";
                    //jta.setText(currentText + "\n" + RosarioConsts.schemeMantraForAllOfUs[prayerIndex].textSymbol);
                    if (myTextView[0].isEnabled())
                        myTextView[0].append("\n" + RosarioConsts.schemeMantraForAllOfUs[prayerIndex].symbol);
                    if (myTextView[2].isEnabled())
                        myTextView[2].append("\n" + RosarioConsts.schemeMantraForAllOfUs[prayerIndex].symbol);
                    if (myTextView[3].isEnabled())
                        myTextView[3].append("\n" + RosarioConsts.schemeMantraForAllOfUs2[prayerIndex].symbol);

                    graniPrecedenti = graniPrecedenti + RosarioConsts.schemeMantraForAllOfUs[prayerIndex].symbol;
                    if (myTextView[1].isEnabled())
                        myTextView[1].setText(graniPrecedenti);
                    if (myTextView[4].isEnabled())
                        myTextView[4].setText(graniPrecedenti);

                    prayerIndex++;
                }
            } else {
                if (prayerIndex==12) {
                    prayerIndex = 0;
                    graniPrecedenti = "";
                }

                if (prayerIndex < RosarioConsts.schemeMantraForThePope1.length) {
                    //jta.setText(currentText + RosarioConsts.schemeMantraForThePope[prayerIndex].textSymbol);
                    if (myTextView[0].isEnabled())
                        myTextView[0].append(RosarioConsts.schemeMantraForThePope1[prayerIndex].symbol);
                    if (myTextView[2].isEnabled())
                        myTextView[2].append( (prayerIndex==0?"\n":"") + RosarioConsts.schemeMantraForThePope2[prayerIndex].symbol);
                    if (myTextView[3].isEnabled())
                        myTextView[3].append(RosarioConsts.schemeMantraForThePope2[prayerIndex].symbol);

                    graniPrecedenti = graniPrecedenti + RosarioConsts.schemeMantraForThePope1[prayerIndex].symbol;
                    if (myTextView[1].isEnabled())
                        myTextView[1].setText(graniPrecedenti);
                    if (myTextView[4].isEnabled())
                        myTextView[4].setText(graniPrecedenti);

                    prayerIndex++;
                } else {

                    if (globalPrayerIndex < (RosarioConsts.schemeMantraForAllOfUs.length * RosarioConsts.MANTRA_TOTALCOUNT_FORALLOFUS) + (RosarioConsts.schemeMantraForThePope1.length * RosarioConsts.MANTRA_TOTALCOUNT_FORTHEPOPE)) {
                        /*prayerIndex = 0;
                        graniPrecedenti = "";*/
                        //jta.setText(currentText + "\n" + RosarioConsts.schemeMantraForThePope[prayerIndex].textSymbol);
                        if (myTextView[0].isEnabled())
                            myTextView[0].append("\n" + RosarioConsts.schemeMantraForThePope1[prayerIndex].symbol);
                        if (myTextView[2].isEnabled())
                            myTextView[2].append("\n" + RosarioConsts.schemeMantraForThePope2[prayerIndex].symbol);
                        if (myTextView[3].isEnabled())
                            myTextView[3].append("\n" + RosarioConsts.schemeMantraForThePope2[prayerIndex].symbol);

                        graniPrecedenti = graniPrecedenti + RosarioConsts.schemeMantraForThePope1[prayerIndex].symbol;
                        if (myTextView[1].isEnabled())
                            myTextView[1].setText(graniPrecedenti);
                        if (myTextView[4].isEnabled())
                            myTextView[4].setText(graniPrecedenti);

                        prayerIndex++;
                    } else {
                        if (theMorningStarPrayerIndex < TOTAL_MISTERY && !recitaMisteroDelGiorno) {
                            System.out.println("Rise the Morning Star");
                            //prayerIndex = 0;
                            //jta.setText(currentText + RosarioConsts.schemeMantraForTheMorningStar[theMorningStarPrayerIndex].textSymbol);
                            if (myTextView[0].isEnabled())
                                myTextView[0].append(RosarioConsts.schemeMantraForTheMorningStar1[theMorningStarPrayerIndex].symbol);
                            if (myTextView[2].isEnabled())
                                myTextView[2].append(RosarioConsts.schemeMantraForTheMorningStar2[theMorningStarPrayerIndex].symbol);
                            if (myTextView[3].isEnabled())
                                myTextView[3].append(RosarioConsts.schemeMantraForTheMorningStar2[theMorningStarPrayerIndex].symbol);

                            graniPrecedenti = graniPrecedenti + RosarioConsts.schemeMantraForTheMorningStar1[theMorningStarPrayerIndex].symbol;
                            if (myTextView[1].isEnabled())
                                myTextView[1].setText(graniPrecedenti);
                            if (myTextView[4].isEnabled())
                                myTextView[4].setText(graniPrecedenti);

                            riseTheMorningStar = true;

                            theMorningStarPrayerIndex++;

                            /*theMorningStarPrayerIndex++;
                            misteryIndex++;

                            //partial reset
                            prayerIndex = 0;
                            globalPrayerIndex = 0;
                            //theMorningStarPrayerIndex = 0;
                            decinaIndex = 0;
                            graniPrecedenti = "";*/

                        } else {
                            if (!recitaMisteroDelGiorno) {
                                theMorningStarPrayerIndex = 0;
                            } else {
                                if (theMorningStarPrayerIndex==99) {
                                    ;
                                } else {
                                    if (myTextView[0].isEnabled())
                                        myTextView[0].append(RosarioConsts.schemeMantraForTheMorningStar1[theMorningStarPrayerIndex].symbol);
                                    if (myTextView[2].isEnabled())
                                        myTextView[2].append(RosarioConsts.schemeMantraForTheMorningStar2[theMorningStarPrayerIndex].symbol);
                                    if (myTextView[3].isEnabled())
                                        myTextView[3].append(RosarioConsts.schemeMantraForTheMorningStar2[theMorningStarPrayerIndex].symbol);

                                    graniPrecedenti = graniPrecedenti + RosarioConsts.schemeMantraForTheMorningStar1[theMorningStarPrayerIndex].symbol;
                                    if (myTextView[1].isEnabled())
                                        myTextView[1].setText(graniPrecedenti);
                                    if (myTextView[4].isEnabled())
                                        myTextView[4].setText(graniPrecedenti);

                                    theMorningStarPrayerIndex = 99;
                                }
                            }
/*
                            //partial reset
                            prayerIndex = 0;
                            globalPrayerIndex = 0;
                            //theMorningStarPrayerIndex = 0;
                            decinaIndex = 0;
                            graniPrecedenti = "";
 */
                        }
                    }
                }
            }

        } else {

            System.out.println("Rosario finished! @ " + misteryIndex);

        }

        myTextView[0].setEnabled(false);myTextView[1].setEnabled(false);myTextView[2].setEnabled(false);myTextView[3].setEnabled(false);myTextView[4].setEnabled(false);

        TextView myTextViewSignal = (TextView) view.findViewById(R.id.textview_signal_decina);
        TextView myTextViewSignalMistery = (TextView) view.findViewById(R.id.textview_signal_mistery);
        if (myTextViewSignal != null) {

            String s1 = RosarioConsts.schemeMantraForAllOfUs3[decinaIndex].symbol + "^ Decina";
            //String s1 = ""+(decinaIndex + 1);
            if (misteryIndex<TOTAL_MISTERY && decinaIndex<5)
                myTextViewSignal.setText(s1);


            String s2 = RosarioConsts.schemeMantraForAllOfUs3[misteryIndex].symbol + "° " + RosarioConsts.schemeDayMistery[misteryIndex+1].textPrayerTooltip;
            if (misteryIndex<TOTAL_MISTERY)
                myTextViewSignalMistery.setText(s2);

        }

        TextView myTextViewSignalMisteryMk2 = (TextView) view.findViewById(R.id.textview_signal_mistery_mk2);
        if (myTextViewSignalMisteryMk2 != null) {

            LocalDate ld = LocalDate.now();
            misteryDayIndex = ld.getDayOfWeek().getValue();

            String s2 = RosarioConsts.schemeDayMisteryGiovanniPaoloII[misteryDayIndex].symbol + "° " + RosarioConsts.schemeDayMisteryGiovanniPaoloII[misteryDayIndex].textPrayerTooltip;
            myTextViewSignalMisteryMk2.setText(s2);
            //theMorningStarPrayerIndex=99;

        }

        globalPrayerIndex++;

        if (recitaMisteroDelGiorno) {
            return;
        }

        if (riseTheMorningStar) {
            //theMorningStarPrayerIndex++;
            misteryIndex++;

            //partial reset
            prayerIndex = 0;
            globalPrayerIndex = 0;
            //theMorningStarPrayerIndex = 0;
            decinaIndex = 0;
            graniPrecedenti = "";
        }





    }

    public static void restartRosario() {

        prayerIndex = 0;
        globalPrayerIndex = 0;
        theMorningStarPrayerIndex = 0;

        decinaIndex = 0;
        misteryIndex = 0;

        graniPrecedenti = "";

    }

    public static void clearRosario(TextView myTextView1, TextView myTextView2, TextView myTextView3, TextView myTextView4) {

        //assert(myTextView1!=null) : "Elemento visuale nullo!";
        //assert(myTextView2!=null) : "Elemento visuale nullo!";

        restartRosario();

        if (myTextView1!=null) myTextView1.setText("");
        if (myTextView2!=null) myTextView2.setText("");
        if (myTextView3!=null) myTextView3.setText("");
        if (myTextView4!=null) myTextView4.setText("");

    }

}
