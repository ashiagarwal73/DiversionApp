package org.upesacm.diversionapp.ViewPagerFragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import org.upesacm.diversionapp.R;

public class page6 extends android.support.v4.app.Fragment {
    Callback callback;
    Button b91, b92, b93, b94, b95, b96, b97, b98, b99;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_page6, container, false);

        b91 = view.findViewById(R.id.click91);
        b91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callback.clickToNextFrom91((Button) view.findViewById(R.id.click91));
                b92.setVisibility(View.GONE);
                b93.setVisibility(View.GONE);

            }
        });
        b92 = view.findViewById(R.id.click92);
        b92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callback.clickToNextFrom92((Button) view.findViewById(R.id.click92));
                b91.setVisibility(View.GONE);
                b93.setVisibility(View.GONE);
            }
        });
        b93 = view.findViewById(R.id.click93);
        b93.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callback.clickToNextFrom93((Button) view.findViewById(R.id.click93));
                b92.setVisibility(View.GONE);
                b91.setVisibility(View.GONE);
            }
        });
        b94 = view.findViewById(R.id.click94);
        b94.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callback.clickToNextFrom94((Button) view.findViewById(R.id.click94));
                b95.setVisibility(View.GONE);
                b96.setVisibility(View.GONE);
            }
        });
        b95 = view.findViewById(R.id.click95);
        b95.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callback.clickToNextFrom95((Button) view.findViewById(R.id.click95));
                b94.setVisibility(View.GONE);
                b96.setVisibility(View.GONE);
            }
        });
        b96 = view.findViewById(R.id.click96);
        b96.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callback.clickToNextFrom96((Button) view.findViewById(R.id.click96));
                b94.setVisibility(View.GONE);
                b95.setVisibility(View.GONE);
            }
        });
        b97 = view.findViewById(R.id.click97);
        b97.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callback.clickToNextFrom97((Button) view.findViewById(R.id.click97));
                b98.setVisibility(View.GONE);
                b99.setVisibility(View.GONE);
            }
        });
        b98 = view.findViewById(R.id.click98);
        b98.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callback.clickToNextFrom98((Button) view.findViewById(R.id.click98));
                b97.setVisibility(View.GONE);
                b99.setVisibility(View.GONE);
            }
        });
        b99 = view.findViewById(R.id.click99);
        b99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callback.clickToNextFrom99((Button) view.findViewById(R.id.click99));
                b98.setVisibility(View.GONE);
                b97.setVisibility(View.GONE);
            }
        });
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        callback = (page6.Callback) context;
    }

    public interface Callback {
        void clickToNextFrom91(Button button);

        void clickToNextFrom92(Button button);

        void clickToNextFrom93(Button button);

        void clickToNextFrom94(Button button);

        void clickToNextFrom95(Button button);

        void clickToNextFrom96(Button button);

        void clickToNextFrom97(Button button);

        void clickToNextFrom98(Button button);

        void clickToNextFrom99(Button button);

    }
}