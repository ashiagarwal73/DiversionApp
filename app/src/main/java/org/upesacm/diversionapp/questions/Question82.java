package org.upesacm.diversionapp.questions;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.upesacm.diversionapp.R;

import fr.tvbarthel.lib.blurdialogfragment.SupportBlurDialogFragment;

public class Question82 extends SupportBlurDialogFragment {
    Question82Callback question82Callback;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.text_type, container, false);
        view.findViewById(R.id.submit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                question82Callback.question82();
                dismiss();
            }
        });
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
         question82Callback=(Question82Callback)context;
    }
    interface Question82Callback{
        public void question82();
    }
}
