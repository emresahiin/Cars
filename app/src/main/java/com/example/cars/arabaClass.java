package com.example.cars;

public class arabaClass {
    private String marka_id;
    private String marka_adi;
    private String marka_logo;
    private String marka_desc;

    public arabaClass(String marka_id,String marka_adi,String marka_logo,String marka_desc){
     this.marka_id = marka_id;
     this.marka_adi = marka_adi;
     this.marka_logo = marka_logo;
     this.marka_desc = marka_desc;
    }

    public String getMarka_id() {
        return marka_id;
    }

    public String getMarka_adi() {
        return marka_adi;
    }

    public String getMarka_logo() {
        return marka_logo;
    }

    public String getMarka_desc() {
        return marka_desc;
    }
}


