package com.wyong.myrecyclerview;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.wyong.myrecyclerview.beans.MultiTypeBean;

import java.util.List;

/**
 * 多种条目类型 RecyclerView 的适配器 Adapter
 * @author Wyong
 * @time 2020-12-21 11:12:59
 */
public class MultiTypeAdapter extends RecyclerView.Adapter {

    private final List<MultiTypeBean> mDatas;

    //定义三个常量 因为有三种类型
    public static final int TYPE_FULL_IMAGE = 0;
    public static final int TYPE_RIGHT_IMAGE = 1;
    public static final int TYPE_THREE_IMAGES = 2;

    public MultiTypeAdapter(List<MultiTypeBean> datas) {
        this.mDatas = datas;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        /**
         * 根据 viewType 来创建条目，这样子条目就可以不一样了。
         */
        View view;
        //TODO: 这里面去创建ViewHolder
        if (viewType == TYPE_FULL_IMAGE) {
            view = View.inflate(parent.getContext(), R.layout.item_type_full_image, null);
            return new FullImageHolder(view);
        } else if (viewType == TYPE_RIGHT_IMAGE) {
            view = View.inflate(parent.getContext(), R.layout.item_type_right_image, null);
            return new RightImageHolder(view);
        } else {
            view = View.inflate(parent.getContext(), R.layout.item_type_three_images, null);
            return new ThreemageHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        //TODO: 这里就不设置数据了
    }

    @Override
    public int getItemCount() {
        if (mDatas != null) {
            return mDatas.size();
        }
        return 0;
    }

    //要复写一个方法，这个方法是根据条件来返回条目类型的
    @Override
    public int getItemViewType(int position) {
        MultiTypeBean multiTypeBean = mDatas.get(position);
        if (multiTypeBean.type == 0) {
            return TYPE_FULL_IMAGE;
        } else if (multiTypeBean.type == 1) {
            return TYPE_RIGHT_IMAGE;
        } else {
            return TYPE_THREE_IMAGES;
        }
    }

    private class FullImageHolder extends RecyclerView.ViewHolder {
        public FullImageHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    private class RightImageHolder extends RecyclerView.ViewHolder {
        public RightImageHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    private class ThreemageHolder extends RecyclerView.ViewHolder {
        public ThreemageHolder(@NonNull View itemView) {
            super(itemView);
        }
    }


}
