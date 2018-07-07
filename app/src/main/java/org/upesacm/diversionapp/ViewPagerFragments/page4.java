package org.upesacm.diversionapp.ViewPagerFragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import org.upesacm.diversionapp.R;

public class page4 extends android.support.v4.app.Fragment{
    Callback callback;
    Button b61,b62,b63;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_page4,container,false);

        b61=view.findViewById(R.id.click61);
         b62=view.findViewById(R.id.click62);
         b63=view.findViewById(R.id.click63);
        b61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callback.clickToNextFrom61((Button) view.findViewById(R.id.click61));
                b62.setVisibility(View.GONE);
                b63.setVisibility(View.GONE);
            }
        });
        b62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callback.clickToNextFrom62((Button) view.findViewById(R.id.click62));
                b61.setVisibility(View.GONE);
                b63.setVisibility(View.GONE);
            }
        });
        b63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callback.clickToNextFrom63((Button) view.findViewById(R.id.click63));
                b61.setVisibility(View.GONE);
                b62.setVisibility(View.GONE);
            }
        });
        return view;    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        callback=(page4.Callback) context;
    }
    public interface Callback{
        void clickToNextFrom61(Button button);
        void clickToNextFrom62(Button button);
        void clickToNextFrom63(Button button);

    }
}