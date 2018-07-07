package org.upesacm.diversionapp.questions;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.upesacm.diversionapp.R;

import fr.tvbarthel.lib.blurdialogfragment.SupportBlurDialogFragment;

public class Question4 extends SupportBlurDialogFragment {
    Question4Callback question4Callback;
    TextView question, hint;
    EditText answer;
    private final String CORRECT_ANSWER = "";
    private final String HINT1 = "";
    private boolean hint_1_used;
    private boolean hint_2_used;
    private final String HINT2 = "";
    private int score;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.text_type, container, false);
        setCancelable(false);
        question = view.findViewById(R.id.question);
        answer = view.findViewById(R.id.answer);
        hint = view.findViewById(R.id.hint);
        view.findViewById(R.id.submit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer.getText().toString().equalsIgnoreCase(CORRECT_ANSWER)) {
                    if (hint_2_used) {
                        score = 10;
                        question4Callback.question4(score);
                        dismiss();
                    } else if (hint_1_used) {
                        score = 20;
                        question4Callback.question4(score);
                        dismiss();
                    } else {
                        score = 30;
                        question4Callback.question4(score);
                        dismiss();
                    }
                } else {
                    if (!hint_1_used) {
                        hint.setText(HINT1);
                        hint_1_used = true;
                    } else {
                        hint.setText(HINT2);
                        hint_2_used = true;
                    }
                }
            }
        });
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        question4Callback=(Question4Callback)context;
    }
    public interface Question4Callback{
        public void question4(int score);
    }
}
