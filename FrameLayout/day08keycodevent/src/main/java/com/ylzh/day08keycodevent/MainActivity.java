package com.ylzh.day08keycodevent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private long endTime;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.text);
        textView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                registerForContextMenu(v);
                openContextMenu(v);
                return true;
            }
        });
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        long curTime = System.currentTimeMillis();
        if (curTime - endTime > 2000) {
            Toast.makeText(this, "再按一次回车退出", Toast.LENGTH_LONG).show();
            endTime = curTime;
        } else {
            finish();
            System.exit(0);
        }
        return true;
    }

//    @Override
//    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
//        View view = findViewById(R.id.text);
//        registerForContextMenu(view);
//        openContextMenu(view);
//        return true;
//    }
    // 上下文菜单
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add("收藏");
        menu.add("举报");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        Toast.makeText(this, item.toString(), Toast.LENGTH_LONG).show();
        return true;
    }
}
