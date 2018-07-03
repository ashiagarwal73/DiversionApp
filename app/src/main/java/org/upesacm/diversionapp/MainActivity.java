package org.upesacm.diversionapp;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import org.upesacm.diversionapp.questions.Question1;

public class MainActivity extends AppCompatActivity implements page1.Callback,page2.Callback,page3.Callback
,page4.Callback,page5.Callback,page6.Callback,page7.Callback,Question1.Question1Callback
{
    ViewPagerCustomDuration mViewPager;
    ImageView mImageView;
    Button b;
    boolean ques1Done,ques2Done,ques3Done,ques4Done,ques5Done,ques61Done,ques62Done,ques63Done,ques71Done;
    boolean ques72Done,ques73Done,ques81Done,ques82Done,ques83Done,ques91Done,ques92Done,ques93Done,ques94Done;
    boolean ques95Done,ques96Done,ques97Done,ques98Done,ques99Done,ques10Done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewPager=(ViewPagerCustomDuration)findViewById(R.id.viewpager);
        PagerAdapter pagerAdapter=new PagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(pagerAdapter);
        mViewPager.setClipToPadding(false);
        mViewPager.setScrollDurationFactor(20);
        mViewPager.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        mImageView=findViewById(R.id.me);

    }


    private void moveXY(float targetX,float targetY) {
        AnimatorSet animSetXY = new AnimatorSet();

        ObjectAnimator y = ObjectAnimator.ofFloat(mImageView,
                "translationY", targetY);

        ObjectAnimator x = ObjectAnimator.ofFloat(mImageView,
                "translationX", targetX);

        animSetXY.playTogether(x, y);
        animSetXY.setDuration(1000);
        animSetXY.start();
    }
    void moveX(float x)
    {
        ObjectAnimator animator=ObjectAnimator.ofFloat(mImageView,"translationX",x);
        animator.setDuration(1000);
        animator.start();
    }
    void moveY(float y)
    {
        ObjectAnimator animator=ObjectAnimator.ofFloat(mImageView,"translationY",y);
        animator.setDuration(2000);
        animator.start();
    }


    @Override
    public void clickToNextFrom1(Button button) {
    new Question1().show(getSupportFragmentManager(),"text_type");
    b=button;
    }

    @Override
    public void clickToNextFrom2(Button button) {
        moveY(1000f);
        moveX(0f);
        mViewPager.setCurrentItem(1);
        button.setBackgroundResource(R.drawable.selected);
        b=button;
    }

    @Override
    public void clickToNextFrom3(Button button) {
        moveXY(200f,400f);
        mViewPager.setCurrentItem(1);
        button.setBackgroundResource(R.drawable.selected);

        b=button;
    }

    @Override
    public void clickToNextFrom4(Button button) {
        moveXY(120f,800f);
        mViewPager.setCurrentItem(2);
        button.setBackgroundResource(R.drawable.selected);

        b=button;
    }
    @Override
    public void clickToNextFrom5(Button button) {
        moveXY(300f,600f);
        button.setBackgroundResource(R.drawable.selected);
        b=button;
    }
    @Override
    public void clickToNextFrom61(Button button) {
        moveXY(100f,400f);
        mViewPager.setCurrentItem(3);
        mViewPager.getChildAt(4).findViewById(R.id.click72).setVisibility(View.GONE);
        mViewPager.getChildAt(4).findViewById(R.id.click73).setVisibility(View.GONE);
        mViewPager.getChildAt(4).findViewById(R.id.click82).setVisibility(View.GONE);
        mViewPager.getChildAt(4).findViewById(R.id.click83).setVisibility(View.GONE);
        mViewPager.getChildAt(5).findViewById(R.id.click94).setVisibility(View.GONE);
        mViewPager.getChildAt(5).findViewById(R.id.click95).setVisibility(View.GONE);
        mViewPager.getChildAt(5).findViewById(R.id.click96).setVisibility(View.GONE);
        mViewPager.getChildAt(5).findViewById(R.id.click97).setVisibility(View.GONE);
        mViewPager.getChildAt(5).findViewById(R.id.click98).setVisibility(View.GONE);
        mViewPager.getChildAt(5).findViewById(R.id.click99).setVisibility(View.GONE);

        button.setBackgroundResource(R.drawable.selected);
        b=button;

    }

    @Override
    public void clickToNextFrom62(Button button) {
        mViewPager.setCurrentItem(3);
        button.setBackgroundResource(R.drawable.selected);
        mViewPager.getChildAt(4).findViewById(R.id.click71).setVisibility(View.GONE);
        mViewPager.getChildAt(4).findViewById(R.id.click73).setVisibility(View.GONE);
        mViewPager.getChildAt(4).findViewById(R.id.click81).setVisibility(View.GONE);
        mViewPager.getChildAt(4).findViewById(R.id.click83).setVisibility(View.GONE);
        mViewPager.getChildAt(5).findViewById(R.id.click91).setVisibility(View.GONE);
        mViewPager.getChildAt(5).findViewById(R.id.click92).setVisibility(View.GONE);
        mViewPager.getChildAt(5).findViewById(R.id.click93).setVisibility(View.GONE);
        mViewPager.getChildAt(5).findViewById(R.id.click97).setVisibility(View.GONE);
        mViewPager.getChildAt(5).findViewById(R.id.click98).setVisibility(View.GONE);
        mViewPager.getChildAt(5).findViewById(R.id.click99).setVisibility(View.GONE);
    }

    @Override
    public void clickToNextFrom63(Button button) {
        mViewPager.setCurrentItem(3);
        button.setBackgroundResource(R.drawable.selected);
        mViewPager.getChildAt(4).findViewById(R.id.click71).setVisibility(View.GONE);
        mViewPager.getChildAt(4).findViewById(R.id.click72).setVisibility(View.GONE);
        mViewPager.getChildAt(4).findViewById(R.id.click81).setVisibility(View.GONE);
        mViewPager.getChildAt(4).findViewById(R.id.click82).setVisibility(View.GONE);
        mViewPager.getChildAt(5).findViewById(R.id.click91).setVisibility(View.GONE);
        mViewPager.getChildAt(5).findViewById(R.id.click92).setVisibility(View.GONE);
        mViewPager.getChildAt(5).findViewById(R.id.click93).setVisibility(View.GONE);
        mViewPager.getChildAt(5).findViewById(R.id.click94).setVisibility(View.GONE);
        mViewPager.getChildAt(5).findViewById(R.id.click95).setVisibility(View.GONE);
        mViewPager.getChildAt(5).findViewById(R.id.click96).setVisibility(View.GONE);
    }

    @Override
    public void clickToNextFrom71(Button button) {
        moveY(300f);
        moveX(0f);
        mViewPager.setCurrentItem(4);

        button.setBackgroundResource(R.drawable.selected);
        b=button;
    }

    @Override
    public void clickToNextFrom72(Button button) {
        mViewPager.setCurrentItem(4);
        button.setBackgroundResource(R.drawable.selected);

    }

    @Override
    public void clickToNextFrom73(Button button) {
        mViewPager.setCurrentItem(4);
        button.setBackgroundResource(R.drawable.selected);


    }

    @Override
    public void clickToNextFrom81(Button button) {
        moveXY(400f,500f);
        button.setBackgroundResource(R.drawable.selected);
        b=button;
    }

    @Override
    public void clickToNextFrom82(Button button) {
        button.setBackgroundResource(R.drawable.selected);
        mViewPager.setCurrentItem(5);
    }

    @Override
    public void clickToNextFrom83(Button button) {

        button.setBackgroundResource(R.drawable.selected);
    }

    @Override
    public void clickToNextFrom91(Button button) {
        moveXY(0f,30f);
        mViewPager.setCurrentItem(5);
        button.setBackgroundResource(R.drawable.selected);
        b=button;
    }

    @Override
    public void clickToNextFrom92(Button button) {
        mViewPager.setCurrentItem(5);
        button.setBackgroundResource(R.drawable.selected);

    }

    @Override
    public void clickToNextFrom93(Button button) {
        mViewPager.setCurrentItem(5);
        button.setBackgroundResource(R.drawable.selected);
    }

    @Override
    public void clickToNextFrom94(Button button) {
        mViewPager.setCurrentItem(5);
        button.setBackgroundResource(R.drawable.selected);
    }

    @Override
    public void clickToNextFrom95(Button button) {
        mViewPager.setCurrentItem(5);
        button.setBackgroundResource(R.drawable.selected);

    }

    @Override
    public void clickToNextFrom96(Button button) {
        mViewPager.setCurrentItem(5);
        button.setBackgroundResource(R.drawable.selected);
    }

    @Override
    public void clickToNextFrom97(Button button) {
        mViewPager.setCurrentItem(5);
        button.setBackgroundResource(R.drawable.selected);
    }

    @Override
    public void clickToNextFrom98(Button button) {
        mViewPager.setCurrentItem(5);
        button.setBackgroundResource(R.drawable.selected);
    }

    @Override
    public void clickToNextFrom99(Button button) {
        mViewPager.setCurrentItem(5);
        button.setBackgroundResource(R.drawable.selected);
    }

    @Override
    public void clickToNextFrom10(Button button) {
        moveXY(400f,700f);
        mViewPager.setCurrentItem(6);
        button.setBackgroundResource(R.drawable.selected);
        b=button;

    }

    @Override
    public void question1() {
    moveY(450f);
        b.setBackgroundResource(R.drawable.selected);
    }

}
