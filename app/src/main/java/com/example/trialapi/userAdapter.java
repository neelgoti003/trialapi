/*
package com.example.trialapi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class userAdapter extends RecyclerView.Adapter<userAdapter.CustomAdapter> {

    MainActivity mainActivity;
    List<userModel.Phonetic> allUserList;

    public userAdapter(MainActivity mainActivity, List<userModel.Phonetic> allUserList) {
        this.mainActivity = mainActivity;
        this.allUserList = allUserList;
    }

    @NonNull
    @Override
    public CustomAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CustomAdapter(LayoutInflater.from(mainActivity).inflate(R.layout.item_user,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter holder, int position) {
    holder.textView.setText(allUserList.get(position).getText());
    }

    @Override
    public int getItemCount() {
        return allUserList.size();
    }

    public class CustomAdapter extends RecyclerView.ViewHolder{
        TextView textView;
        public CustomAdapter(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.itemText);
        }
    }

}
*/
