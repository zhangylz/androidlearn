package com.ylzh.day07intentcategoryhome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHome = (Button)findViewById(R.id.btnHome);
        btnHome.setOnClickListener(onClickListener);
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btnHome:
                    Intent intent = new Intent();
                    intent.setAction(intent.ACTION_MAIN);
                    intent.addCategory(intent.CATEGORY_HOME);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "Go to Home Ok", Toast.LENGTH_LONG).show();
                    break;
            }
        }
    };
}
