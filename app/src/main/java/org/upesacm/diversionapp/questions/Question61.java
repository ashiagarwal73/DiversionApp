package org.upesacm.diversionapp.questions;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.upesacm.diversionapp.R;

import fr.tvbarthel.lib.blurdialogfragment.SupportBlurDialogFragment;

public class Question61 extends SupportBlurDialogFragment {
    Question61Callback question61Callback;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.text_type, container, false);
        view.findViewById(R.id.submit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                question61Callback.question61();
                dismiss();
            }
        });
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
         question61Callback=(Question61Callback)context;
    }
    interface Question61Callback{
        public void question61();
    }
}
