package com.fs.projecttest01;

import android.os.Parcel;
import android.os.Parcelable;

public class Planvalue implements Parcelable {
    private int order;
    private int pvalue;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.order);
        dest.writeInt(this.pvalue);
    }

    public Planvalue() {
    }

    protected Planvalue(Parcel in) {
        this.order = in.readInt();
        this.pvalue = in.readInt();
    }

    public static final Parcelable.Creator<Planvalue> CREATOR = new Parcelable.Creator<Planvalue>() {
        public Planvalue createFromParcel(Parcel source) {
            return new Planvalue(source);
        }

        public Planvalue[] newArray(int size) {
            return new Planvalue[size];
        }
    };
}