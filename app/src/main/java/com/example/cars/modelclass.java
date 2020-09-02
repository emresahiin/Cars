package com.example.cars;

public class modelclass {
    private String model_id;
    private String marka_id;
    private String model_ad;
    private String model_logo;
    private String model_desc;

    public modelclass(String model_id,String marka_id, String model_ad, String model_logo, String model_desc)
    {
        this.model_id = model_id;
        this.marka_id = marka_id;
        this.model_ad = model_ad;
        this.model_logo = model_logo;
        this.model_desc = model_desc;
    }

    public String getModel_id() {
        return model_id;
    }

    public String getMarka_id() {
        return marka_id;
    }

    public String getModel_ad() {
        return model_ad;
    }

    public String getModel_logo() {
        return model_logo;
    }

    public String getModel_desc() {
        return model_desc;
    }
}
