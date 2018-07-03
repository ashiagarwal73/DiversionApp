package org.upesacm.diversionapp;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class page3 extends android.support.v4.app.Fragment{
    Callback callback;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_page3,container,false);
        view.findViewById(R.id.click4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callback.clickToNextFrom4((Button) view.findViewById(R.id.click4));
            }
        });
        view.findViewById(R.id.click5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callback.clickToNextFrom5((Button) view.findViewById(R.id.click5));
            }
        });
        return view;    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        callback=(page3.Callback) context;
    }
    interface Callback{
        void clickToNextFrom4(Button button);
        void clickToNextFrom5(Button button);
    }
}