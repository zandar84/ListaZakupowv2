package com.example.kkk.listazakupowv2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    Context mContext;
    List<Artykul> mData;

    public RecyclerViewAdapter(Context mContext, List<Artykul> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_artykul, parent, false);
        MyViewHolder vHolder = new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_nazwa.setText(mData.get(position).getNazwa_artykulu());
        holder.tv_cena.setText(mData.get(position).getCena_artykulu());
        holder.iv_obraz.setImageResource(mData.get(position).getObraz_artykulu());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_nazwa;
        private TextView tv_cena;
        private ImageView iv_obraz;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_nazwa = (TextView) itemView.findViewById(R.id.text_nazwa_artykulu);
            tv_cena = (TextView) itemView.findViewById(R.id.text_cena_artykulu);
            iv_obraz = (ImageView) itemView.findViewById(R.id.img_artykulu);

        }
    }

}
