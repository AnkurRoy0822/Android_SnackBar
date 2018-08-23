package com.example.jhumpi.snackbar;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void normal(View view){

        Snackbar.make(findViewById(R.id.coordinatorLayout),"SnackBar",Snackbar.LENGTH_SHORT).show();
    }
    public void custom(View view1){
        Snackbar sn  = Snackbar.make(findViewById(R.id.coordinatorLayout),"Change button color",Snackbar.LENGTH_SHORT);
        sn.setAction("Change", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button b = (Button) findViewById(R.id.btn1);
                b.setBackgroundColor(000);

            }
        });
        sn.show();
    }
}
