package com.melekalyaprak.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

public class FitnessMove implements Parcelable {
    private String fitnessName;
    private String fitnessPictures;
    private String fitnessDescription;
    private int fitnessCalorie;

    public FitnessMove(String fitnessName, String fitnessPictures, String fitnessDescription, int fitnessCalorie) {
        this.fitnessName = fitnessName;
        this.fitnessPictures = fitnessPictures;
        this.fitnessDescription = fitnessDescription;
        this.fitnessCalorie = fitnessCalorie;
    }

    public String getFitnessName() {
        return fitnessName;
    }

    public String getFitnessPictures() {
        return fitnessPictures;
    }

    public String getFitnessDescription() {
        return fitnessDescription;
    }

    public int getFitnessCalorie() {
        return fitnessCalorie;
    }

    protected FitnessMove(Parcel in) {
        fitnessName=in.readString();
        fitnessPictures=in.readString();
        fitnessDescription=in.readString();
        fitnessCalorie=in.readInt();

    }

    public static final Creator<FitnessMove> CREATOR = new Creator<FitnessMove>() {
        @Override
        public FitnessMove createFromParcel(Parcel in) {
            return new FitnessMove(in);
        }

        @Override
        public FitnessMove[] newArray(int size) {
            return new FitnessMove[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(fitnessName);
        parcel.writeString(fitnessPictures);
        parcel.writeString(fitnessDescription);
        parcel.writeInt(fitnessCalorie);
    }
}
