package com.example.sande.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    List<MyDataClass> myDataList;
    public MyAdapter(List<MyDataClass> list) {

        this.myDataList = list;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.single_item_layout,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {

        MyDataClass mdc = myDataList.get(position);
        viewHolder.tv_title.setText(mdc.getTitle());
        viewHolder.tv_subTitle.setText(mdc.getSubTitle());
        viewHolder.tv_message.setText(mdc.getMessage());


    }

    @Override
    public int getItemCount() {
        return myDataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tv_title,tv_subTitle,tv_message;
        public ViewHolder(View itemView) {
            super(itemView);

            tv_title = itemView.findViewById(R.id.textView_title);
            tv_subTitle  = itemView.findViewById(R.id.textView2_subTitle);
            tv_message = itemView.findViewById(R.id.textView_message);

            tv_subTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), "title selected" + myDataList.get(getAdapterPosition()).getSubTitle(), Toast.LENGTH_SHORT).show();
                }
            });

        }
    }
}
