package com.teka.myapplication.splash;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;
import androidx.databinding.ObservableField;

import com.teka.myapplication.R;

public class SplashModel {
    public static ObservableField<String> profileImage = new ObservableField<>();
    public static ObservableField<String> getProfileImage() {
        return profileImage;
    }

   // like this we will get image from drawable in databinding
    @BindingAdapter({"android:profileImage"})
    public static void loadImage(ImageView view, String imageUrl) {
      view.setImageResource(R.drawable.teka_logo);
    }

}
