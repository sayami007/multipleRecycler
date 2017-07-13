package com.example.bibesh.designdevelop;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Bibesh on 7/12/17.
 */

class CustomAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    LayoutInflater inflater;
    List<CustomData> data;

    static final int HEADER = 100;
    static final int ITEM = 200;

    public CustomAdapter(Context context, List<CustomData> data) {
        this.inflater = LayoutInflater.from(context);
        this.data = data;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == HEADER) {
            View header = inflater.inflate(R.layout.header_layout, parent, false);
            RecyclerView.ViewHolder holder1 = new MyViewHolderHeaer(header);
            return holder1;
        } else {
            View item = inflater.inflate(R.layout.item_layout, parent, false);
            RecyclerView.ViewHolder holder2 = new MyViewHolderItem(item);
            return holder2;
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder.getItemViewType() == HEADER) {
        } else {
            MyViewHolderItem hold = new MyViewHolderItem(holder.itemView);
            hold.productDetail.setText("SDF");

        }
    }

    @Override
    public int getItemCount() {
        return data.size() + 1;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0)
            return HEADER;
        else
            return ITEM;
    }

    class MyViewHolderItem extends RecyclerView.ViewHolder {
        TextView productName, productPrice, productDetail;
        ImageView icon;

        public MyViewHolderItem(View view) {
            super(view);
            productName = view.findViewById(R.id.productName);
            productPrice = view.findViewById(R.id.productPrice);
            productDetail = view.findViewById(R.id.productDetail);
            icon = view.findViewById(R.id.icon);
        }
    }

    class MyViewHolderHeaer extends RecyclerView.ViewHolder {

        public MyViewHolderHeaer(View itemView) {
            super(itemView);
        }
    }
}
