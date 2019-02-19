package com.example.myapplication;

import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

//import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    private EditText name;
    private EditText code;
    private TextView attempts;
    private Button Login;
    private Button Cancel;
    private int counter = 5;
    private TextView txtcopytext;

//    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        attempts = findViewById(R.id.attempts);
        attempts.setText("Number of attempts remaining: 5");
//        mAuth = FirebaseAuth.getInstance();
        
        
        
//        name = findViewById(R.id.ename);

        code = findViewById(R.id.ecode);
//        if (code.length() == 0) {
//                code.setError("Enter Code");
//
//            }else {
//                name.getText();
//        }
        Login = findViewById(R.id.Login);
        

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(code.getText().toString());
            }
        });
    }



    public void validate(String code) {


//        if (code.length() == 0) {
//            code.setError("This field is required");
//        }

        if (code.equalsIgnoreCase("z9M2wl1U9d0")) {

            Intent intent = new Intent(MainActivity.this, Title.class);
            startActivity(intent);
            Toast.makeText(getApplicationContext(), "Login successful, welcome!" ,
                    Toast.LENGTH_LONG).show();

        }else{

//            Toast toast = Toast.makeText(getApplicationContext(), "Incorrect Code",
//                    Toast.LENGTH_SHORT);
//                    toast.setGravity(Gravity.CENTER, 0, 190);
//                    toast.show();

            counter--;

            attempts.setText("Number of attempts remaining:" +String.valueOf(counter));

            if(counter==0){
                Login.setEnabled(false);
                Toast.makeText(getApplicationContext(), "App locked! Restart App and try again. "
                                ,
                        Toast.LENGTH_LONG).show();

//                {
//                    Intent mIntent = getIntent();
//                    finish();
//                    startActivity(mIntent);
//                }


                Snackbar.make(findViewById(android.R.id.content), "Incorrect Authentication Code.", Snackbar.LENGTH_LONG)
                        .show();

//                {
//                    Intent mIntent = getIntent();
//                    finish();
//                    startActivity(mIntent);
//                    Login.setEnabled(false);
//                }


            }





//            name.setText("");


//        } else {
//            code.setError("Enter the exact Name and Code sent to you");


        }

//        Login.setEnabled(false);

        txtcopytext = (TextView) findViewById(R.id.heartbreak);
        registerForContextMenu(txtcopytext);

    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        // user has long pressed your TextView
        menu.add(0, v.getId(), 0,
                "Copy");

        // cast the received View to TextView so that you can get its text
        TextView yourTextView = (TextView) v;

        // place your TextView's text in clipboard
        ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
        clipboard.setText(yourTextView.getText());
    }

}


