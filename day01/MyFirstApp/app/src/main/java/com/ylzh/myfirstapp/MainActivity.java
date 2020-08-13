package com.ylzh.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Fragment;

import android.app.FragmentTransaction;
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
        // setContentView(R.layout.activity_main);
        setContentView(R.layout.news_articles);

        // 确认 Activity 使用的布局版本包含 fragment_container FrameLayout
        if (findViewById(R.id.fragment_container) != null) {

            // 不过，如果我们要从先前的状态还原，则无需执行任何操作而应返回，否则
            // 就会得到重叠的 Fragment。
            if (savedInstanceState != null) {
                return;
            }

            // 创建一个要放入 Activity 布局中的新 Fragment
            HeadlinesFragment firstFragment = new HeadlinesFragment();

            // 如果此 Activity 是通过 Intent 发出的特殊指令来启动的，
            // 请将该 Intent 的 extras 以参数形式传递给该 Fragment
            firstFragment.setArguments(getIntent().getExtras());

            // 将该 Fragment 添加到“fragment_container” FrameLayout 中
            getFragmentManager().beginTransaction().add(R.id.fragment_container, firstFragment).commit();
//            getSupportFragmentManager().beginTransaction()
//                    .add(R.id.fragment_container, firstFragment).commit();
        }
    }
//
//    /** Called when the user clicks the Send button */
//    public void sendMessage(View view) {
//        // Do something in response to button
//        Intent intent = new Intent(this, DisplayMessageActivity.class);
//        EditText editText = (EditText) findViewById(R.id.edit_message);
//        String message = editText.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE, message);
//        startActivity(intent);
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // 为ActionBar扩展菜单项
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.activity_main_actions, menu);
//        return super.onCreateOptionsMenu(menu);
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // 处理动作按钮的点击事件
//        switch (item.getItemId()) {
//            case R.id.action_search:
//                openSearch();
//                break;
//            case R.id.action_settings:
//                openSettings();
//                break;
//            case R.id.create:
//                Toast toast = Toast.makeText(MainActivity.this, "create...", Toast.LENGTH_SHORT);
//                toast.show();
//                break;
//            case R.id.open:
//                Toast toast1 = Toast.makeText(MainActivity.this, "open...", Toast.LENGTH_SHORT);
//                toast1.show();
//                break;
//            default:
//                return super.onOptionsItemSelected(item);
//        }
//        return true;
//    }
//
//    public void openSearch() {
//        System.out.println("openSearch");
//    }
//    public void openSettings() {
//        System.out.println("openSettings");
//    }

    public void onChangeOtherFragment(View view) {
        // 创建 Fragment 并为其添加一个参数，用来指定应显示的文章
        ArticleFragment newFragment = new ArticleFragment();
        Bundle args = new Bundle();
        args.putInt("position", 123456);
        newFragment.setArguments(args);

        /**
         * 获取FragmentManager
         * 2.1 获取 app 包下的FragmentManager
         * FragmentManager fragmentManager = getFragmentManager() ;
         * 2.2 获取 v4 包下的FragmentManager
         * FragmentManager fragmentManager = getSupportFragmentManager() ;
         *
         * */
        FragmentTransaction transaction = getFragmentManager().beginTransaction();

        // 将 fragment_container View 中的内容替换为此 Fragment，
        // 然后将该事务添加到返回堆栈，以便用户可以向后导航
        transaction.replace(R.id.fragment_container, (Fragment)newFragment);
        transaction.addToBackStack(null);

        // 执行事务
        transaction.commit();
    }
}