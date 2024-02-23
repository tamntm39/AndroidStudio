package com.example.tabselector;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CaSiAdapter extends RecyclerView.Adapter <CaSiAdapter.UserViewHolder> {
    ArrayList<CaSi> lstUser;
    Context context;
    UserCallback userCallback;

    public CaSiAdapter(ArrayList<CaSi> lstUser,UserCallback userCallback) {
        this.lstUser = lstUser;
        this.userCallback=userCallback;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context= parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View userView= inflater.inflate(R.layout.casi_item,parent,false);
        UserViewHolder viewHolder=new UserViewHolder(userView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        CaSi item = lstUser.get(position);
        holder.imAvarta.setImageBitmap(Ultils.convertToBitmapFromAssets(context,item.getAvatar()));
        holder.tvName.setText(item.getName());

        holder.itemView.setOnClickListener(view->userCallback.onItemClick(item.getId()));


    }

    @Override
    public int getItemCount() {
        return lstUser.size();
    }

    static class UserViewHolder extends RecyclerView.ViewHolder{
        ImageView imAvarta;
        TextView tvName,viewBH;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            imAvarta=itemView.findViewById(R.id.ivavatar);
            tvName=itemView.findViewById(R.id.casi );
            viewBH=itemView.findViewById(R.id.viewbh );
        }
    }
    public interface UserCallback{
        void onItemClick(String id);
    }
}
