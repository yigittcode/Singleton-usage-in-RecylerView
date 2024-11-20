package com.yigit.landmarkbook;



import androidx.annotation.NonNull;

import java.io.Serializable;

public class Landmark implements Serializable {

    final String name;
    final String country;
    final int image;

    public Landmark(String name, String country, int image) {
        this.name = name;
        this.country = country;
        this.image = image;
    }

    @NonNull
    @Override
    public String toString() {
        return name;
    }
}
