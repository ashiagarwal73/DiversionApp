package org.upesacm.diversionapp.Activity;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import org.upesacm.diversionapp.R;
import org.upesacm.diversionapp.model.Participant;

public class LoginActivity extends AppCompatActivity {
    TextInputLayout loginId,password;
    FirebaseDatabase mFirebaseDatabase=FirebaseDatabase.getInstance();
    DatabaseReference mDatabaseReference=mFirebaseDatabase.getReference().child("Participant");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginId=findViewById(R.id.loginId);
        password=findViewById(R.id.password);

        getWindow().setBackgroundDrawableResource(R.drawable.login_background);
    }

    public void onSubmit(View view) {
        String userName=loginId.getEditText().getText().toString();
        final String userPassword=password.getEditText().getText().toString();
        if(!userName.equals("") && !userPassword.equals(""))
        {
            Query query = mDatabaseReference.orderByChild("loginId").equalTo(userName);
            query.addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    if(dataSnapshot.exists())
                    {
                        for(DataSnapshot dataSnapshot1:dataSnapshot.getChildren())
                        {
                            Participant participant=dataSnapshot1.getValue(Participant.class);
                            if(participant.getPassword().equals(userPassword)){
                               if(participant.getLocked()==0){
                                    participant.setLocked(1);
                                    mDatabaseReference.child(dataSnapshot1.getKey()).setValue(participant);
                                Intent intent=new Intent(LoginActivity.this,MainActivity.class);
                                startActivity(intent);
                                finish();

                                }
                                else {
                                    Toast.makeText(getApplicationContext(), "Already Logged In ", Toast.LENGTH_SHORT).show();

                                }
                            }
                            else {
                                Toast.makeText(getApplicationContext(), "Wrong Password ", Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "Please Enter correct Login Id ", Toast.LENGTH_SHORT).show();
                    }

                }
                @Override
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(getApplicationContext(), "Please Enter correct Login Id and Password", Toast.LENGTH_SHORT).show();
                }
            });
        }
        else {
            Toast.makeText(this, "Please Enter your Login Id and Password", Toast.LENGTH_SHORT).show();
        }

    }
}
