package com.example.lfyd;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NewsrvAdapter extends RecyclerView.Adapter<NewsrvAdapter.ViewHolder>{
    List<Articles> articlesArrayList;
    Context context;
    public NewsrvAdapter(List<Articles> articlesArrayList, Context context) {
        this.articlesArrayList = articlesArrayList;
        this.context = context;
    }

    @Override
    public NewsrvAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.news_rv_items,parent,false);
        return new NewsrvAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NewsrvAdapter.ViewHolder holder, int position) {
        Articles articles = articlesArrayList.get(position);
        holder.textView.setText(articles.getName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,MainActivity2.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtra("name" , articles.getName());
                intent.putExtra("Location" , articles.getLocation());
                intent.putExtra("offer1" , articles.getOffer1());
                intent.putExtra("offer2", articles.getOffer2());
                intent.putExtra("discount1" , articles.getDiscount1());
                intent.putExtra("discount2" , articles.getDiscount2());
                intent.putExtra("discount3", articles.getDiscount3());
                intent.putExtra("product1" , articles.getProduct1());
                intent.putExtra("product2", articles.getProduct2());
                intent.putExtra("product3", articles.getProduct3());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return articlesArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;
        public ViewHolder( View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.cn);
            imageView =itemView.findViewById(R.id.imgv);
        }
    }
}
