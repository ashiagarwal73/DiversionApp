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

public class page7 extends android.support.v4.app.Fragment{
    Callback callback;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_page7,container,false);
        Button button=view.findViewById(R.id.click10);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callback.clickToNextFrom10((Button) view.findViewById(R.id.click10));
            }
        });

        return view;

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        callback=(page7.Callback) context;
    }
    interface Callback{
        void clickToNextFrom10( Button button);

    }
}