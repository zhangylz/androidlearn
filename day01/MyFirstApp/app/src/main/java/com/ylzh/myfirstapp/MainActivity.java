package com.ylzh.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.ylzh.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // 为ActionBar扩展菜单项
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.activity_main_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // 处理动作按钮的点击事件
        switch (item.getItemId()) {
            case R.id.action_search:
                openSearch();
                break;
            case R.id.action_settings:
                openSettings();
                break;
            case R.id.create:
                Toast toast = Toast.makeText(MainActivity.this, "create...", Toast.LENGTH_SHORT);
                toast.show();
                break;
            case R.id.open:
                Toast toast1 = Toast.makeText(MainActivity.this, "open...", Toast.LENGTH_SHORT);
                toast1.show();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }

    public void openSearch() {
        System.out.println("openSearch");
    }
    public void openSettings() {
        System.out.println("openSettings");
    }
}