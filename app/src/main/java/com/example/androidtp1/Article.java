package com.example.androidtp1;

import android.os.Parcel;
import android.os.Parcelable;

public class Article implements Parcelable
{
    private int id;
    private String name;
    private String description;
    private String url;

    private float price;
    private float rating;

    private boolean isBuyed;

    public Article() {
    }

    public Article(int id, String name, String description, String url, float price, float rating,boolean isBuyed) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.url = url;
        this.price = price;
        this.rating = rating;
        this.isBuyed = isBuyed;
    }

    protected Article(Parcel in) {
        id = in.readInt();
        name = in.readString();
        description = in.readString();
        url = in.readString();
        price = in.readFloat();
        rating = in.readFloat();
        isBuyed = in.readByte() != 0;
    }

    public static final Creator<Article> CREATOR = new Creator<Article>() {
        @Override
        public Article createFromParcel(Parcel in) {
            return new Article(in);
        }

        @Override
        public Article[] newArray(int size) {
            return new Article[size];
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public float getPrice() {
        return price;
    }

    public void setPrix(float price) {
        this.price = price;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public boolean isBuyed() {
        return isBuyed;
    }

    public void setIsBuyed(boolean buyed) {
        isBuyed = buyed;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", nom='" + name + '\'' +
                ", description='" + description + '\'' +
                ", url='" + url + '\'' +
                ", prix=" + price +
                ", note=" + rating +
                ", achat=" + isBuyed +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(id);
        parcel.writeString(name);
        parcel.writeString(description);
        parcel.writeString(url);
        parcel.writeFloat(price);
        parcel.writeFloat(rating);
        parcel.writeByte((byte) (isBuyed ? 1 : 0));
    }
}
