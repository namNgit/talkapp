package com.example.cabom.appchatmanhinhchinh2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.ViewHolder> {

    private ArrayList<HistoryModel> mList;
    private LayoutInflater mInflater;
    HistoryAdapter(Context context, ArrayList<HistoryModel> list){
        this.mInflater = LayoutInflater.from(context);
        this.mList =  list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = mInflater.inflate(R.layout.recycleview_history_items, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        HistoryModel historyModel = mList.get(position);
        ImageView image = holder.item_image;
        TextView name, message, call;

        name = holder.item_name;
        message = holder.item_message;
        call = holder.item_call;

        image.setImageResource(historyModel.getImage());
        name.setText(historyModel.getName());
        message.setText(historyModel.getMessage());
        call.setText(historyModel.getCall());

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView item_image;
        TextView item_name, item_message, item_call;
        public ViewHolder(View itemView){
            super(itemView);

            item_image = itemView.findViewById(R.id.item_view);
            item_name = itemView.findViewById(R.id.item_name);
            item_message = itemView.findViewById(R.id.item_message);
            item_call = itemView.findViewById(R.id.item_call);
        }
    }
}
