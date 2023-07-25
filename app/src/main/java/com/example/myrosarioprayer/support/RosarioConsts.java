package com.example.myrosarioprayer.support;

import android.graphics.Color;

public class RosarioConsts {

    public static final Integer MANTRA_TOTALCOUNT_FORALLOFUS = 5;

    public static final Integer MANTRA_TOTALCOUNT_FORTHEPOPE = 1;

    public static final ERosarioSymbol[] schemeMantraForAllOfUs = {
            ERosarioSymbol.SYM_PATER,
            ERosarioSymbol.SYM_AVE_A01,ERosarioSymbol.SYM_AVE_A02,ERosarioSymbol.SYM_AVE_A03,ERosarioSymbol.SYM_AVE_A04,ERosarioSymbol.SYM_AVE_A05,
            ERosarioSymbol.SYM_AVE_A06,ERosarioSymbol.SYM_AVE_A07,ERosarioSymbol.SYM_AVE_A08,ERosarioSymbol.SYM_AVE_A09,ERosarioSymbol.SYM_AVE_A10,
            ERosarioSymbol.SYM_GLORIA
    };


    public static final ERosarioSymbol[] schemeMantraForAllOfUs2 = {
            ERosarioSymbol.SYM_PATER,ERosarioSymbol.SYM_PATER,ERosarioSymbol.SYM_PATER,
            ERosarioSymbol.SYM_AVE_A01,ERosarioSymbol.SYM_AVE_A02,ERosarioSymbol.SYM_AVE_A03,
            ERosarioSymbol.SYM_GLORIA,ERosarioSymbol.SYM_GLORIA,ERosarioSymbol.SYM_GLORIA
    };

    public static final ERosarioSymbol[] schemeMantraForAllOfUs3 = {
            ERosarioSymbol.SYM_AVE_B01,
            ERosarioSymbol.SYM_AVE_B02,ERosarioSymbol.SYM_AVE_B03,ERosarioSymbol.SYM_AVE_B04,ERosarioSymbol.SYM_AVE_B05,ERosarioSymbol.SYM_AVE_B06,
            ERosarioSymbol.SYM_AVE_B07,ERosarioSymbol.SYM_AVE_B08,ERosarioSymbol.SYM_AVE_B09,ERosarioSymbol.SYM_AVE_B10,ERosarioSymbol.SYM_AVE_B11,
            ERosarioSymbol.SYM_AVE_B12
    };

    public static final ERosarioSymbol[] schemeMantraForAllOfUs4 = {
            ERosarioSymbol.SYM_PATER,
            ERosarioSymbol.SYM_AVE_B01,ERosarioSymbol.SYM_AVE_B02,ERosarioSymbol.SYM_AVE_B03,ERosarioSymbol.SYM_AVE_B04,ERosarioSymbol.SYM_AVE_B05,
            ERosarioSymbol.SYM_AVE_B06,ERosarioSymbol.SYM_AVE_B07,ERosarioSymbol.SYM_AVE_B08,ERosarioSymbol.SYM_AVE_B09,ERosarioSymbol.SYM_AVE_B10,
            ERosarioSymbol.SYM_GLORIA
    };

    public static final ERosarioSymbol[] schemeMantraForThePope1 = {
            ERosarioSymbol.SYM_PATER_POPE_INTENTION,
            ERosarioSymbol.SYM_AVE,ERosarioSymbol.SYM_AVE,ERosarioSymbol.SYM_AVE,
            ERosarioSymbol.SYM_GLORIA_POPE_INTENTION
    };

    public static final ERosarioSymbol[] schemeMantraForThePope2 = {
            ERosarioSymbol.SYM_PATER_POPE_INTENTION,
            ERosarioSymbol.SYM_AVE,ERosarioSymbol.SYM_AVE,ERosarioSymbol.SYM_AVE,
            ERosarioSymbol.SYM_GLORIA
    };

    public static final ERosarioSymbol[] schemeMantraForTheMorningStar1 = {
            ERosarioSymbol.SYM_SALVE_1,ERosarioSymbol.SYM_SALVE_2,ERosarioSymbol.SYM_SALVE_1,ERosarioSymbol.SYM_SALVE_2
            //litanie mariane con nomi di Maria
    };

    public static final ERosarioSymbol[] schemeMantraForTheMorningStar2 = {
            ERosarioSymbol.SYM_SALVE_2,ERosarioSymbol.SYM_SALVE_1,ERosarioSymbol.SYM_SALVE_2,ERosarioSymbol.SYM_SALVE_1
            //litanie mariane con nomi di Maria
    };

    public static final ERosarioSymbol[] schemeDayMisteryGiovanniPaoloII = {
            ERosarioSymbol.SYM_EMPTY,ERosarioSymbol.SYM_MISTERI_GAUDIOSI,ERosarioSymbol.SYM_MISTERI_DOLOROSI,ERosarioSymbol.SYM_MISTERI_GLORIOSI,ERosarioSymbol.SYM_MISTERI_LUMINOSI,ERosarioSymbol.SYM_MISTERI_DOLOROSI,ERosarioSymbol.SYM_MISTERI_GAUDIOSI,ERosarioSymbol.SYM_MISTERI_GLORIOSI
            //litanie mariane con nomi di Maria
    };

    public static final ERosarioSymbol[] schemeDayMistery = {
            ERosarioSymbol.SYM_EMPTY,ERosarioSymbol.SYM_MISTERI_GAUDIOSI,ERosarioSymbol.SYM_MISTERI_DOLOROSI,ERosarioSymbol.SYM_MISTERI_GLORIOSI,ERosarioSymbol.SYM_MISTERI_LUMINOSI,ERosarioSymbol.SYM_MISTERI_DOLOROSI,ERosarioSymbol.SYM_MISTERI_GAUDIOSI,ERosarioSymbol.SYM_MISTERI_GLORIOSI
            //litanie mariane con nomi di Maria
    };

    /*
BG=48,70,111
FG=90,113,156
     */

    public static final Color bgColor1 = Color.valueOf(48/255F, 70/255F, 111/255F, 1.0f);//new Color(48,70,111);

    public static final Color bgColor2 = Color.valueOf(90/255F, 113/255F, 156/255F, 1.0f);//new Color(90,113,156);

    public static final Color fgColor1 = Color.valueOf(255/255F, 205/255F, 0/255F, 1.0f);//new Color(255,205,0);

}
