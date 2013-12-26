package com.nailit.model;

public class OuterNailWrapperModel {

    private String nailBoxName;
    private String nailerName;
    private String hammerItAgain;
    private int noOfNails;
    private int icon;
    
    public OuterNailWrapperModel(String nailboxname, String nailername, String hammeritagain, int noofnails, int icon) {
        this.nailBoxName = nailboxname;
        this.nailerName = nailername;
        this.hammerItAgain = hammeritagain;
        this.noOfNails = noofnails;
        this.icon = icon;
    }
    
    public String getNailBoxName() {
        return nailBoxName;
    }
    public void setNailBoxName(String nailBoxName) {
        this.nailBoxName = nailBoxName;
    }
    public String getNailerName() {
        return nailerName;
    }
    public void setNailerName(String nailerName) {
        this.nailerName = nailerName;
    }
    public String getHammerItAgain() {
        return hammerItAgain;
    }
    public void setHammerItAgain(String hammerItAgain) {
        this.hammerItAgain = hammerItAgain;
    }
    public int getNoOfNails() {
        return noOfNails;
    }
    public void setNoOfNails(int noOfNails) {
        this.noOfNails = noOfNails;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
    
    
    
}
