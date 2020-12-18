package com.wyong.myrecyclerview;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private MyRecyclerViewAdapter mAdapter;
    private ArrayList<String> datas;
    private SwipeRefreshLayout refreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化视图
        initView();
        //初始化数据
        initData();
        //初始化事件
        initEvent();

        //处理下拉刷新
        handlerDownPullRefresh();
    }

    private void initEvent() {
        // 设置 RecyclerView 的适配器
        mAdapter = new MyRecyclerViewAdapter(this, datas);
        mRecyclerView.setAdapter(mAdapter);
        // 设置 layoutManager
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        // mRecyclerView.scrollToPosition(datas.size());
        // 设置 RecyclerView 的分割线
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.HORIZONTAL));
        // 设置点击某条的监听
        mAdapter.setOnItemClickListener(new MyRecyclerViewAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, String data) {
                Toast.makeText(MainActivity.this, "data==" + data, Toast.LENGTH_SHORT).show();
            }
        });
        // 设置动画
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    private void handlerDownPullRefresh() {
        refreshLayout.setColorSchemeResources(R.color.design_default_color_primary, R.color.design_default_color_primary_dark, R.color.design_default_color_primary_variant);
        refreshLayout.setEnabled(true);
        refreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                // 在这里执行刷新数据的操作
                /**
                 * 当我们在顶部下拉的时候，这个方法就会被触发；
                 * 但是这个方法是 MainThread 不可以执行耗时操作；
                 * 一般来说我们去请求数据要开一个线程去获取，这里演示的话，直接添加一条数据。
                 */
                //添加数据
                datas.add(0, "新添加的数据");
                //更新UI
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //做两件事 1.让刷新停止  2.更新列表
                        mAdapter.notifyDataSetChanged();
                        refreshLayout.setRefreshing(false);
                    }
                }, 3000);
            }
        });
    }

    private void initView() {
        mRecyclerView = findViewById(R.id.recyclerView);
        refreshLayout = findViewById(R.id.refresh_layout);
    }

    private void initData() {
        //准备数据集合
        datas = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            datas.add("Content_" + i);
        }
    }

    /**
     * 添加数据
     */
    public void onAddDataClick(View v) {
        mAdapter.addData(0, "new_content");
        mRecyclerView.scrollToPosition(0);
    }

    /**
     * 删除数据
     */
    public void onDeleteDataClick(View v) {
        mAdapter.removeData(0);
    }

    /**
     * 切换list布局
     *
     * @param v
     */
    public void onListLayoutClick(View v) {
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
//        mRecyclerView.scrollToPosition(datas.size());
    }

    /**
     * 切换Grid布局
     *
     * @param v
     */
    public void onGridLayoutClick(View v) {
        mRecyclerView.setLayoutManager(new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false));
//        mRecyclerView.scrollToPosition(datas.size());
    }

    /**
     * 切换flow布局
     *
     * @param v
     */
    public void onFlowLayoutClick(View v) {
        mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
    }

}