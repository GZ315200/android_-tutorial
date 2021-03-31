package com.ticktech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    /**
     * 回调方法以onXXX开头
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //调用父类处理做一些默认的初始化工作
        super.onCreate(savedInstanceState);
        //设置窗口要显示的内容视图，界面/布局
        //指定布局文件在R所对应的变量，加载布局文件最终显示到窗口中
        setContentView(R.layout.activity_main);
    }
}