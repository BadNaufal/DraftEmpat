package android.com.draftempat;

/**
 * Created by BDINZ on 12/07/2018.
 */


import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class SplashScreenActivity extends AppCompatActivity {


    private static int splashinterval= 5000;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {
                // TODO Auto-generated method stub
                Intent i = new Intent(SplashScreenActivity.this, LoginActivity.class);
                startActivity(i); // menghubungkan activity splashscren ke main activity dengan intent

                this.finish();
            }

            private void finish() {
                // TODO Auto-generated method stub

            }
        }, splashinterval);

    };
}

