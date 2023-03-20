package com.example.recycleview.recycler;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleview.R;

import java.util.ArrayList;

public class EmailAdapter extends RecyclerView.Adapter<EmailsViewHolder> {
    ArrayList<String> arrayListForAdapter;

    public EmailAdapter(ArrayList<String> arrayList) {
        arrayListForAdapter = arrayList;

    }

    @NonNull
    @Override
    public EmailsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new EmailsViewHolder(LayoutInflater.from
                (parent.getContext()).inflate(R.layout.item_email, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull EmailsViewHolder holder, int position) {
        holder.onBind(arrayListForAdapter.get(position));
    }

    @Override
    public int getItemCount() {
        return arrayListForAdapter.size();
    }
}
