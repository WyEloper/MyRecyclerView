package com.wyong.myrecyclerview;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.wyong.myrecyclerview.beans.Datas;
import com.wyong.myrecyclerview.beans.MultiTypeBean;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 多种条目类型的 RecyclerView 实现 （类似于今日头条的排版）
 * @time 2020-12-21 10:54:33
 * @author Wyong
 */
public class MultiTypeActivity extends AppCompatActivity {

    private static final String TAG = "MultiTypeActivity";
    private RecyclerView mMRecyclerView;
    private List<MultiTypeBean> mDatas;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_type);

        // find the view here
        mMRecyclerView = this.findViewById(R.id.multi_type_list);

        // 初始化数据  准备数据
        initData();

        // 创建和设置布局管理器
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mMRecyclerView.setLayoutManager(layoutManager);
        // 创建适配器
        MultiTypeAdapter adapter = new MultiTypeAdapter(mDatas);
        // 设置适配器
        mMRecyclerView.setAdapter(adapter);

    }

    private void initData() {
        mDatas = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < Datas.icons.length; i++) {
            MultiTypeBean data = new MultiTypeBean();
            data.pic = Datas.icons[i];
            data.type = random.nextInt(3);
            Log.d(TAG,"TYPE = " + data.type);
            mDatas.add(data);
        }
    }
}
