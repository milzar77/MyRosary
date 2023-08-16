package com.example.myrosarioprayer.support;

import com.example.myrosarioprayer.R;

public enum ERosarioSymbol {

    SYM_PATER("\u2720"),//2670=♰ //002b=+ //269a=⚚ //26b5=⚵ //271D=✝ //2795=➕ //2720=✠

    SYM_PATER_POPE_INTENTION("\u2719"),//2670=♰ //002b=+ //269a=⚚ //26b5=⚵ //271D=✝ //2795=➕ //2720=✠ //2719=✙
    SYM_AVE("\u25CF"),//2022=• //25C9=◉ //25C8=◈ //25CF=● //26AB=⚫ //272A=✪ //2742=❂
    SYM_GLORIA( "\u2733" ),//2055=⁕ //2655=♕ //2605=★ //2600=☀ //2731=✱ //2733=✳

    SYM_GLORIA_POPE_INTENTION( "\u2600" ),//2055=⁕ //2655=♕ //2605=★ //2600=☀
    SYM_SALVE_1("\u2665"),//2665=♥ //2654=♔ //2655=♕
    SYM_SALVE_2("\u2655"),//2665=♥ //2654=♔ //2655=♕
    SYM_AVE_A01("\u2776"),//2776=❶
    SYM_AVE_A02("\u2777"),
    SYM_AVE_A03("\u2778"),
    SYM_AVE_A04("\u2779"),
    SYM_AVE_A05("\u277A"),
    SYM_AVE_A06("\u277B"),
    SYM_AVE_A07("\u277C"),
    SYM_AVE_A08("\u277D"),
    SYM_AVE_A09("\u277E"),
    SYM_AVE_A10("\u277F"),

    //roman latin numbers, AWFUL, TO BE USED ONLY FOR MISTERY AND DECINA #s SIGNAL
    SYM_AVE_B01("\u2160"),//2776=❶
    SYM_AVE_B02("\u2161"),
    SYM_AVE_B03("\u2162"),
    SYM_AVE_B04("\u2163"),
    SYM_AVE_B05("\u2164"),
    SYM_AVE_B06("\u2165"),
    SYM_AVE_B07("\u2166"),
    SYM_AVE_B08("\u2167"),
    SYM_AVE_B09("\u2168"),
    SYM_AVE_B10("\u2169"),

    SYM_AVE_B11("\u216A"),
    SYM_AVE_B12("\u216B"),


    SYM_MISTERI_GAUDIOSI("\u2160"),//2776=❶,
    SYM_MISTERI_DOLOROSI("\u2161"),
    SYM_MISTERI_GLORIOSI("\u2162"),
    SYM_MISTERI_LUMINOSI("\u2163"),

    SYM_BRAHMANANDASWAROOPA_1("\u2665"),//2665=♥

    SYM_AUM_1("*"),

    SYM_EMPTY("EMPTY")
    ;







    public String symbol;

    public String textSymbol;

    public String testoPreghiera;
    public String textPrayerTooltip;

    ERosarioSymbol(String s) {
        this.symbol = s;
        this.textSymbol = "";
        this.textPrayerTooltip = "Aut";
        switch (this.name()) {
            case "SYM_PATER":
            case "SYM_PATER_POPE_INTENTION":
                this.textPrayerTooltip = "Pater Noster";
                this.textSymbol = "PN";
                this.testoPreghiera = RosarioResourceLoader.getContext().getText(R.string.padre_nostro).toString();
                break;
            case "SYM_AVE":
                this.textPrayerTooltip = "Ave Mater";
                this.textSymbol = "AM";
                this.testoPreghiera = RosarioResourceLoader.getContext().getText(R.string.ave_mater).toString();
                break;
            case "SYM_GLORIA":
            case "SYM_GLORIA_POPE_INTENTION":
                this.textPrayerTooltip = "Gloria";
                this.textSymbol = "GL";
                this.testoPreghiera = RosarioResourceLoader.getContext().getText(R.string.gloria).toString();
                break;
            case "SYM_SALVE_1":
            case "SYM_SALVE_2":
                this.textPrayerTooltip = "Salve Regina";
                this.textSymbol = "SR";
                this.testoPreghiera = RosarioResourceLoader.getContext().getText(R.string.salve_regina).toString();
                break;
            case "SYM_AVE_A01":
            case "SYM_AVE_A02":
            case "SYM_AVE_A03":
            case "SYM_AVE_A04":
            case "SYM_AVE_A05":
            case "SYM_AVE_A06":
            case "SYM_AVE_A07":
            case "SYM_AVE_A08":
            case "SYM_AVE_A09":
            case "SYM_AVE_A10":
            case "SYM_AVE_B01":
            case "SYM_AVE_B02":
            case "SYM_AVE_B03":
            case "SYM_AVE_B04":
            case "SYM_AVE_B05":
            case "SYM_AVE_B06":
            case "SYM_AVE_B07":
            case "SYM_AVE_B08":
            case "SYM_AVE_B09":
            case "SYM_AVE_B10":
            case "SYM_AVE_B11":
            case "SYM_AVE_B12":
                this.textPrayerTooltip = "Ave Mater";
                this.textSymbol = "AM";
                this.testoPreghiera = RosarioResourceLoader.getContext().getText(R.string.ave_mater).toString();
                break;
            case "SYM_MISTERI_GAUDIOSI":
                this.textPrayerTooltip = "MISTERO DELLA GIOIA";
                this.textSymbol = "";
                this.testoPreghiera = "";
                break;
            case "SYM_MISTERI_DOLOROSI":
                this.textPrayerTooltip = "MISTERO DEL DOLORE";
                this.textSymbol = "";
                this.testoPreghiera = "";
                break;
            case "SYM_MISTERI_GLORIOSI":
                this.textPrayerTooltip = "MISTERO DELLA GLORIA";
                this.textSymbol = "";
                this.testoPreghiera = "";
                break;
            case "SYM_MISTERI_LUMINOSI":
                this.textPrayerTooltip = "MISTERO DELLA LUCE";
                this.textSymbol = "";
                this.testoPreghiera = "";
                break;
            case "SYM_BRAHMANANDASWAROOPA_1":
                this.textPrayerTooltip = "BRAHMA NANDA SWAROOPA";
                this.textSymbol = "BN";
                this.testoPreghiera = "Brahma Nanda Swaroopa, Isha Jagadisha; Akilannda Swaroopa, Isha Mageysha.";
                break;
            case "SYM_AUM_1":
                this.textPrayerTooltip = "AUM";
                this.textSymbol = "OM";
                this.testoPreghiera = "Aum";
                break;
            case "SYM_SOAM_1":
                this.textPrayerTooltip = "SO AM";
                this.textSymbol = "SO AM";
                this.testoPreghiera = "So Am";
                break;
            case "SYM_EMPTY":
                this.textPrayerTooltip = "EMPTY";
                this.textSymbol = "";
                this.testoPreghiera = "";
                break;
            default:
                throw new IllegalArgumentException("Invalid enum type!");
        }
    }

}
