package com.distancing.sibankan.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.distancing.sibankan.R;
import com.distancing.sibankan.data.GalangDanaHori;
import com.distancing.sibankan.data.GalangDanaVertical;

import java.util.ArrayList;

public class HorizontalMainAdapter  extends RecyclerView.Adapter<HorizontalMainAdapter.ViewHolder> {
    private ArrayList<GalangDanaHori> getDana;
    private VerticalMainAdapter.OnItemClickListener mListener;
    private Context context;

    public HorizontalMainAdapter(Context context) {
        this.context = context;
        getDana = new ArrayList<>();
    }

    public void setBarangs(ArrayList<GalangDanaHori> getDana) {
        this.getDana = getDana;
    }
    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public void setOnItemClickListener(VerticalMainAdapter.OnItemClickListener listener) {
        mListener = listener;
    }

    @NonNull
    @Override
    public HorizontalMainAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_donasi_horizontal, parent,false);
        return new HorizontalMainAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalMainAdapter.ViewHolder holder, int position) {
        holder.namadonasi.setText(getDana.get(position).getNamagalang());
        holder.terkumpul.setText(getDana.get(position).getTerkumpul());
        holder.sisa.setText(getDana.get(position).getSisawaktu());
    }

    @Override
    public int getItemCount() {
      return getDana.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView  namadonasi, terkumpul, sisa;
        ImageView img;
         public ViewHolder(@NonNull View itemView) {
            super(itemView);
            namadonasi = itemView.findViewById(R.id.jenisdonasi);
             terkumpul = itemView.findViewById(R.id.terkumpul);
             sisa = itemView.findViewById(R.id.sisa);
             img = itemView.findViewById(R.id.img);

        }

    }
}
