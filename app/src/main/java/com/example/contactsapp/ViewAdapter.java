package com.example.contactsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ViewAdapter extends RecyclerView.Adapter<ViewAdapter.ViewHolder> {

    private ArrayList<String> mImages ;
    private ArrayList<String> mContactName;
    private ArrayList<String> mPhoneNumber ;
    private Context mContext;

    public ViewAdapter(Context mContext,ArrayList<String> mImages, ArrayList<String> mContactName, ArrayList<String> mPhoneNumber) {
        this.mImages = mImages;
        this.mContactName = mContactName;
        this.mPhoneNumber = mPhoneNumber;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem,parent ,false);
       return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {

        Glide.with(mContext).asBitmap().load(mImages.get(position)).into(holder.imageView);
        holder.contactName.setText(mContactName.get(position));
        holder.phoneNumber.setText(mPhoneNumber.get(position));

        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, mContactName.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mContactName.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView contactName;
        TextView phoneNumber;
        RelativeLayout relativeLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            contactName = itemView.findViewById(R.id.contactName);
            phoneNumber = itemView.findViewById(R.id.phoneNumber);
            relativeLayout = itemView.findViewById(R.id.relativeLayout);
        }
    }

}
