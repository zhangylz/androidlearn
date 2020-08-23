package com.ylzh.day07intentactiondata;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnCall;
    private Button btnMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCall = (Button)findViewById(R.id.btnCall);
        btnMessage = (Button)findViewById(R.id.btnMessage);

        btnCall.setOnClickListener(onClickListener);
        btnMessage.setOnClickListener(onClickListener);
    }

    public View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            Button button = (Button)v;
            switch (button.getId()) {
                case R.id.btnCall:
                    intent.setAction(intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:17351098691"));
                    break;
                case R.id.btnMessage:
                    intent.setAction(intent.ACTION_SENDTO);
                    intent.setData(Uri.parse("smsto:5554"));
                    intent.putExtra("sms_body", "Welcome to Android");
                    break;
                default:
                    return;
            }
            startActivity(intent);
        }
    };
}
