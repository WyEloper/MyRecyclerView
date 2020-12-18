package com.wyong.myrecyclerview;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * 万能快捷键：alt + 回车 enter 智能提示添加
 * 实现方法
 * 创建方法
 * 创建类
 * 创建成员变量
 * 创建局部变量
 * 解决错误
 *
 * 局部变量 改 成员变量 ctrl + alt + f
 *
 * 参数提示 ctrl+p
 * 重命名  shift+f6
 * 下一行  ctrl+shift+enter
 */
public class TestAdapter extends RecyclerView.Adapter<TestAdapter.InnerHolder> {
    @NonNull
    @Override
    public InnerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull InnerHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class InnerHolder extends RecyclerView.ViewHolder {
        public InnerHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
