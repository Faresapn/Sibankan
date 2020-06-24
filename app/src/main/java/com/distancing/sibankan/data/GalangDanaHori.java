package com.distancing.sibankan.data;


import android.os.Parcel;
import android.os.Parcelable;


public class GalangDanaHori implements Parcelable {
    private int Image;

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getJenisgalang() {
        return jenisgalang;
    }

    public void setJenisgalang(String jenisgalang) {
        this.jenisgalang = jenisgalang;
    }

    public String getNamagalang() {
        return namagalang;
    }

    public void setNamagalang(String namagalang) {
        this.namagalang = namagalang;
    }

    public String getSisawaktu() {
        return sisawaktu;
    }

    public void setSisawaktu(String sisawaktu) {
        this.sisawaktu = sisawaktu;
    }

    public String getTerkumpul() {
        return terkumpul;
    }

    public void setTerkumpul(String terkumpul) {
        this.terkumpul = terkumpul;
    }

    private String jenisgalang,namagalang,sisawaktu,terkumpul;



    public GalangDanaHori(){

    }

    public GalangDanaHori(Parcel in) {
        this.Image = in.readInt();
        this.jenisgalang = in.readString();
        this.namagalang = in.readString();
        this.sisawaktu = in.readString();
        this.terkumpul = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.Image);
        dest.writeString(this.jenisgalang);
        dest.writeString(this.namagalang);
        dest.writeString(this.sisawaktu);
        dest.writeString(this.terkumpul);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<GalangDanaHori> CREATOR = new Creator<GalangDanaHori>() {
        @Override
        public GalangDanaHori createFromParcel(Parcel in) {
            return new GalangDanaHori(in);
        }

        @Override
        public GalangDanaHori[] newArray(int size) {
            return new GalangDanaHori[size];
        }
    };
}
