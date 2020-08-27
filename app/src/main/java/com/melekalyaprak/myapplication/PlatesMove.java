package com.melekalyaprak.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

public class PlatesMove implements Parcelable {
    private String platesName;
    private String platesPictures;
    private String platesDescription;
    private int platesCalorie;

    public PlatesMove(String platesName, String platesPictures, String platesDescription, int platesCalorie) {
        this.platesName = platesName;
        this.platesPictures = platesPictures;
        this.platesDescription = platesDescription;
        this.platesCalorie = platesCalorie;
    }

    public String getPlatesName() {
        return platesName;
    }

    public String getPlatesPictures() {
        return platesPictures;
    }

    public String getPlatesDescription() {
        return platesDescription;
    }

    public int getPlatesCalorie() {
        return platesCalorie;
    }

    protected PlatesMove(Parcel in) {
        platesName=in.readString();
        platesPictures=in.readString();
        platesDescription=in.readString();
        platesCalorie=in.readInt();
    }

    public static final Creator<PlatesMove> CREATOR = new Creator<PlatesMove>() {
        @Override
        public PlatesMove createFromParcel(Parcel in) {
            return new PlatesMove(in);
        }

        @Override
        public PlatesMove[] newArray(int size) {
            return new PlatesMove[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(platesName);
        parcel.writeString(platesPictures);
        parcel.writeString(platesDescription);
        parcel.writeInt(platesCalorie);
    }
}
