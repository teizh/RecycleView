package com.example.recycleview.recycler;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleview.R;

public class EmailsViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView textView;
    TextView textViewContent;

    public EmailsViewHolder(@NonNull View itemView) {
        super(itemView);
    }
    public void onBind(Drawable image, String contactName, String context) {
        imageView = itemView.findViewById(R.id.imageViewMail);
        textView = itemView.findViewById(R.id.contact);
        textViewContent = itemView.findViewById(R.id.content);
        textView.setText(contactName);
        textViewContent.setText(context);
        imageView.setImageDrawable(image);
    }

    public void onBind(String contactName) {
        textView = itemView.findViewById(R.id.contact);
        textView.setText(contactName);
    }
}
