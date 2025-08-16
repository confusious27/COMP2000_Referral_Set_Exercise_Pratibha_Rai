package com.example.comp2000referral;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RequestAdapter extends RecyclerView.Adapter<RequestAdapter.ViewHolder> {

    // connects to book.java
    Context context;
    List<Request> requestList;

    public RequestAdapter(Context context, List<Request> requestList) {
        this.context = context;
        this.requestList = requestList;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView bookTitle;
        TextView requester;

        public ViewHolder(View itemView) {
            super(itemView);
            bookTitle = itemView.findViewById(R.id.requestBooks);
            requester = itemView.findViewById(R.id.requestedBy);
        }
    }

    @Override
    public RequestAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.request_items, parent, false);
        return new RequestAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RequestAdapter.ViewHolder holder, int position) {
        final Request request = requestList.get(position);
        holder.bookTitle.setText(request.getBookTitle());
        holder.requester.setText("Requested by: " + request.getRequesterName());
        // so requested by text appears

        // for the details page
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, RequestDetailActivity.class);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return requestList.size();
    }
}