package com.example.responsmp3.model;

import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.DiffUtil;

import com.bumptech.glide.Glide;

import java.util.Objects;

public class Data {
    private String id;
    private String name;
    private boolean isAvailable;
    private String imageUrl;

    public Data(String id, String name, boolean isAvailable, String imageUrl) {
        this.id = id;
        this.name = name;
        this.isAvailable = isAvailable;
        this.imageUrl = imageUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Data{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", isAvailable=" + isAvailable +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data = (Data) o;
        return isAvailable() == data.isAvailable() &&
                getId().equals(data.getId()) &&
                getName().equals(data.getName()) &&
                getImageUrl().equals(data.getImageUrl());
    }

    public static DiffUtil.ItemCallback<Data> itemCallback = new DiffUtil.ItemCallback<Data>() {
        @Override
        public boolean areItemsTheSame(@NonNull Data oldItem, @NonNull Data newItem) {
            return oldItem.getId().equals(newItem.getId());
        }

        @Override
        public boolean areContentsTheSame(@NonNull Data oldItem, @NonNull Data newItem) {
            return oldItem.equals(newItem);
        }
    };
    @BindingAdapter("android:dataImage")
    public static void loadImage(ImageView imageView, String imageUrl) {
        Glide.with(imageView)
                .load(imageUrl)
                .fitCenter()
                .into(imageView);
    }
}
