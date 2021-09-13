package com.example.imageswipe;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class ADAPTER extends PagerAdapter {
    private Context cxt;
    private int[] ImageAraay=new int[]{R.drawable.morris,R.drawable.apj,R.drawable.alone,R.drawable.strrugle,R.drawable.succeess};
    ADAPTER(Context context) {cxt=context;}


    @Override
    public int getCount() {
        return ImageAraay.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView=new ImageView(cxt);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(ImageAraay[position]);
        container.addView(imageView,0);
        return imageView;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView) object);
    }
}
