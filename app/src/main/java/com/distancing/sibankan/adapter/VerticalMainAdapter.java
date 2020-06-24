package com.distancing.sibankan.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.distancing.sibankan.R;
import com.distancing.sibankan.data.GalangDanaVertical;

import java.util.ArrayList;
import java.util.List;

public class VerticalMainAdapter extends RecyclerView.Adapter<VerticalMainAdapter.ViewHolder> {
    private ArrayList<GalangDanaVertical> getDana;
    private OnItemClickListener mListener;
    private Context context;

    public VerticalMainAdapter(Context context) {
        this.context = context;
        getDana = new ArrayList<>();
    }

    public void setBarangs(ArrayList<GalangDanaVertical> getDana) {
        this.getDana = getDana;
    }
    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = listener;
    }

    @NonNull
    @Override
    public VerticalMainAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_donasi_vertical, parent,false);
        return new VerticalMainAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VerticalMainAdapter.ViewHolder holder, int position) {
        holder.jenisdonasi.setText(getDana.get(position).getJenisgalang());
        holder.namadonasi.setText(getDana.get(position).getNamagalang());
        holder.terkumpul.setText(getDana.get(position).getTerkumpul());
        holder.sisa.setText(getDana.get(position).getSisawaktu());
    }

    @Override
    public int getItemCount() {
        return getDana.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView jenisdonasi, namadonasi, terkumpul, sisa;
        ImageView img;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            jenisdonasi = itemView.findViewById(R.id.jenisdonasi);
            namadonasi = itemView.findViewById(R.id.namadonasi);
            terkumpul = itemView.findViewById(R.id.terkumpul);
            sisa = itemView.findViewById(R.id.sisa);
            img = itemView.findViewById(R.id.img);


        }
    }
}


