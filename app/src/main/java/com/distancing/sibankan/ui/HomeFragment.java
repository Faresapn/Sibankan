package com.distancing.sibankan.ui;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.distancing.sibankan.R;
import com.distancing.sibankan.adapter.HorizontalMainAdapter;
import com.distancing.sibankan.adapter.VerticalMainAdapter;
import com.distancing.sibankan.data.GalangDanaHori;
import com.distancing.sibankan.data.GalangDanaVertical;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    String[] jenisdonasi;
    String[] namadonasi;
    String[] terkumpul;
    String[] sisa;
    String[] sisawk;
    TypedArray photoData;
    VerticalMainAdapter adapter;
    HorizontalMainAdapter adapterhori;
    RecyclerView rv,rvhori;
    LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);
        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        rv = root.findViewById(R.id.rv_verti);
        rvhori = root.findViewById(R.id.rv_hori);
        RVVERTI();
        RVHORI();
        return root;
    }

    private void RVHORI() {
        adapterhori = new HorizontalMainAdapter(getContext());
        rvhori.setHasFixedSize(true);
        rvhori.setAdapter(adapterhori);
        rvhori.setLayoutManager(layoutManager);
        prepareHori();
        addItemHori();
    }

    private void prepareHori() {
        jenisdonasi = getResources().getStringArray(R.array.jenis_galang);
        namadonasi = getResources().getStringArray(R.array.nama_galang);
        terkumpul = getResources().getStringArray(R.array.total);
        sisa = getResources().getStringArray(R.array.sisa_waktu_hori);
        photoData = getResources().obtainTypedArray(R.array.img_verti);

    }

    private void addItemHori() {
        ArrayList<GalangDanaHori> items = new ArrayList<>();

        for (int i = 0; i < jenisdonasi.length; i++) {
            GalangDanaHori club = new GalangDanaHori();
            club.setImage(photoData.getResourceId(i, -1));
            club.setJenisgalang(jenisdonasi[i]);
            club.setNamagalang(namadonasi[i]);
            club.setSisawaktu(sisa[i]);
            club.setTerkumpul(terkumpul[i]);
            items.add(club);
        }

        adapterhori.setBarangs(items);
    }

    private void RVVERTI() {
        adapter = new VerticalMainAdapter(getContext());
        rv.setHasFixedSize(true);
        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        prepare();
        addItem();
    }

    private void prepare() {
        jenisdonasi = getResources().getStringArray(R.array.jenis_galang);
        namadonasi = getResources().getStringArray(R.array.nama_galang);
        terkumpul = getResources().getStringArray(R.array.total);
        sisa = getResources().getStringArray(R.array.sisa_waktu);
        photoData = getResources().obtainTypedArray(R.array.img_verti);
    }
    private void addItem() {
        ArrayList<GalangDanaVertical> items = new ArrayList<>();

        for (int i = 0; i < jenisdonasi.length; i++) {
            GalangDanaVertical club = new GalangDanaVertical();
            club.setImage(photoData.getResourceId(i, -1));
            club.setJenisgalang(jenisdonasi[i]);
            club.setNamagalang(namadonasi[i]);
            club.setSisawaktu(sisa[i]);
            club.setTerkumpul(terkumpul[i]);
            items.add(club);
        }

        adapter.setBarangs(items);
    }


}
