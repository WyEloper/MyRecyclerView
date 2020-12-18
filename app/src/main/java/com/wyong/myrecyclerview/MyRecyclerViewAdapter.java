package com.wyong.myrecyclerview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder> {


    private final Context context;
    private ArrayList<String> datas;

    public MyRecyclerViewAdapter(Context context, ArrayList<String> datas) {
        this.context = context;
        this.datas = datas;
    }

    /**
     * 创建并且返回 ViewHolder
     *  相当于 getView 方法中 创建 View 和 ViewHolder
     * @param parent
     * @param viewType
     * @return
     */
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = View.inflate(context, R.layout.item_layout, null);
        return new MyViewHolder(itemView);
    }

    /**
     * 通过 ViewHolder 来绑定数据
     * 数据和 View 绑定 （相当于 getView 中的绑定数据部分的代码）
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        // 根据位置得到对应的数据
        String data = datas.get(position);
        holder.tv_title.setText(data);
    }

    /**
     * 返回数据数量
     * @return
     */
    @Override
    public int getItemCount() {
        return datas.size();
    }

    /**
     * 添加数据
     * @return
     */
    public void addData(int position, String data) {
        datas.add(position, data);
        // 刷新适配器
        notifyItemInserted(position);
    }
    /**
     * 移除数据
     * @return
     */
    public void removeData(int position) {
        datas.remove(position);
        notifyItemRemoved(position);
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView iv_icon;
        private TextView tv_title;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_icon = itemView.findViewById(R.id.iv_icon);
            tv_title = itemView.findViewById(R.id.tv_title);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    Toast.makeText(context, "data==" + datas.get(getLayoutPosition()),Toast.LENGTH_SHORT).show();
                    if (onItemClickListener != null){
                        onItemClickListener.onItemClick(v, datas.get(getLayoutPosition()));
                    }
                }
            });

            iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, "我是图片==" + getLayoutPosition(),Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    /**
     * 设置  RecyclerView 某条的监听
     */
    public interface OnItemClickListener{
        /**
         * 当 RecyclerView 某条 item 被点击的时候回调
         * @param view 点击item的视图
         * @param data 点击item的数据
         */
        public void onItemClick(View view, String data);
    }

    private OnItemClickListener onItemClickListener;

    /**
     * 设置  RecyclerView 某条的监听
     */
    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

}
