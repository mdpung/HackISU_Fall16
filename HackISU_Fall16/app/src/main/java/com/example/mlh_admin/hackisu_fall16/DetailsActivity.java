package com.example.mlh_admin.hackisu_fall16;

import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by MLH-Admin on 9/17/2016.
 */
public class DetailsActivity extends ActionBarActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_activity);

        String title = getIntent().getStringExtra("title");
        int position = getIntent().getIntExtra("imagePosition", -1);

        TypedArray imgs = getResources().obtainTypedArray(R.array.image_ids);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imgs.getResourceId(position, -1));




        //Bitmap bitmap = getIntent().getParcelableExtra("image");

        TextView titleTextView = (TextView) findViewById(R.id.title);
        titleTextView.setText(title);

        ImageView imageView = (ImageView) findViewById(R.id.image);
        imageView.setImageBitmap(bitmap);
    }
}
