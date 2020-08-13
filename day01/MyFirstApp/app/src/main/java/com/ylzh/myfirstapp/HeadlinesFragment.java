package com.ylzh.myfirstapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.app.Fragment;
import android.app.FragmentTransaction;

public class HeadlinesFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.headlines_fragment, null);
        return view;
        // return super.onCreateView(inflater, container, savedInstanceState);
    }

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
                transaction.replace(R.id.fragment_container, newFragment);
                transaction.addToBackStack(null);

        // 执行事务
        transaction.commit();
    }
}
