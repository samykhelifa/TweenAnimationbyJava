package com.ryio6.tweenanimationbyjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements Animation.AnimationListener {

    private ImageView mImageView;

    private Animation mRotateAnim;
    private Animation mScaleAnim;
    private Animation mTranslateAnim;
    private Animation mAlphaAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageView = (ImageView) findViewById(R.id.volleyball);


    }

    public void scaleAnimation(View view) {

        mScaleAnim = new ScaleAnimation(

                1.0f, 1.5f,
                1.0f, 1.5f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f

        );
        mScaleAnim.setDuration(1000);
        mScaleAnim.setAnimationListener(this);
        mImageView.startAnimation(mScaleAnim);


    }

    public void translateAnimation(View view) {

        mTranslateAnim = new TranslateAnimation(

                Animation.ABSOLUTE, 0.0f,
                Animation.ABSOLUTE, 150f,
                Animation.ABSOLUTE, 0.0f,
                Animation.ABSOLUTE, 0.0f

        );
        mTranslateAnim.setDuration(1000);
        mTranslateAnim.setAnimationListener(this);
        mImageView.startAnimation(mTranslateAnim);


    }

    public void alphaAnimation(View view) {

        mAlphaAnim = new AlphaAnimation(1.0f, 0.0f);
        mAlphaAnim.setDuration(2000);
        mAlphaAnim.setAnimationListener(this);
        mImageView.startAnimation(mAlphaAnim);


    }

    public void rotateAnimation(View view) {

        mRotateAnim = new RotateAnimation(
                0.0f, -180f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        mRotateAnim.setDuration(1000);
        mRotateAnim.setRepeatMode(Animation.REVERSE);
        mRotateAnim.setRepeatCount(1);
        mRotateAnim.setAnimationListener(this);
        mImageView.startAnimation(mRotateAnim);


    }


    @Override
    public void onAnimationStart(Animation animation) {

        if (animation == mScaleAnim) {
            Toast.makeText(MainActivity.this, "Scale Animation Started ", Toast.LENGTH_SHORT).show();
        }

        if (animation == mRotateAnim) {
            Toast.makeText(MainActivity.this, "Rotate Animation Started ", Toast.LENGTH_SHORT).show();

        }

        if (animation == mTranslateAnim) {
            Toast.makeText(MainActivity.this, "Translate Animation Started ", Toast.LENGTH_SHORT).show();

        }

        if (animation == mAlphaAnim) {
            Toast.makeText(MainActivity.this, "Alpha Animation Started ", Toast.LENGTH_SHORT).show();

        }

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        Toast.makeText(MainActivity.this, "Animation Ended ", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onAnimationRepeat(Animation animation) {
        Toast.makeText(MainActivity.this, "Animation Repeated ", Toast.LENGTH_SHORT).show();

    }
}
