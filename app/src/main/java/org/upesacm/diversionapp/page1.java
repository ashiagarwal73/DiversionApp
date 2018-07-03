package org.upesacm.diversionapp;

import android.app.Fragment;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class page1 extends android.support.v4.app.Fragment {
    Callback callback;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_page1, container, false);

        final Button button = view.findViewById(R.id.click);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callback.clickToNextFrom1(button);
            }
        });
        final Button button2 = view.findViewById(R.id.click2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callback.clickToNextFrom2(button2);
            }
        });
        return view;

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        callback = (Callback) context;
    }

    interface Callback {

        void clickToNextFrom1(Button button);

        void clickToNextFrom2(Button button);
    }
}