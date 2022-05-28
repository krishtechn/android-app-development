package com.example.firstapp.Adapters;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.firstapp.Models.BookModals;
import com.example.firstapp.R;

import java.util.ArrayList;

public class BookAdapters extends RecyclerView.Adapter<BookAdapters.ViewHolder>{
    ArrayList<BookModals>list;
    Context context;

    public BookAdapters(ArrayList<BookModals> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_book,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
         final BookModals model = list.get(position);
         holder.bookimage.setImageResource(model.getBookimage());
         holder.booktext.setText(model.getBookname());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView booktext;
        ImageView bookimage;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            booktext=itemView.findViewById(R.id.textView3);
            bookimage=itemView.findViewById(R.id.image);

        }
    }

}
