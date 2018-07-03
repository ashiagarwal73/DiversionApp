package org.upesacm.diversionapp;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class page5 extends android.support.v4.app.Fragment{
    Callback callback;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_page5,container,false);
        view.findViewById(R.id.click71).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callback.clickToNextFrom71((Button) view.findViewById(R.id.click71));
            }
        });
        view.findViewById(R.id.click72).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callback.clickToNextFrom72((Button) view.findViewById(R.id.click72));
            }
        });
        view.findViewById(R.id.click73).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callback.clickToNextFrom73((Button) view.findViewById(R.id.click73));
            }
        });
        view.findViewById(R.id.click81).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callback.clickToNextFrom81((Button) view.findViewById(R.id.click81));
            }
        });
        view.findViewById(R.id.click82).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callback.clickToNextFrom82((Button) view.findViewById(R.id.click82));
            }
        });
        view.findViewById(R.id.click83).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callback.clickToNextFrom83((Button) view.findViewById(R.id.click83));
            }
        });
        return view;    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        callback=(page5.Callback) context;
    }
    interface Callback{
        void clickToNextFrom71(Button button);
        void clickToNextFrom72(Button button);
        void clickToNextFrom73(Button button);
        void clickToNextFrom81(Button button);
        void clickToNextFrom82(Button button);
        void clickToNextFrom83(Button button);
    }
}