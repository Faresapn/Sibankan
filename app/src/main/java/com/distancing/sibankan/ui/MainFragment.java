package com.distancing.sibankan.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.distancing.sibankan.R;
import com.distancing.sibankan.galang_ui.GalangActivity;

public class MainFragment extends Fragment {
    Button galang;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);
        galang = root.findViewById(R.id.button2);
        galang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), GalangActivity.class);
                startActivity(intent);
            }
        });
        return root;
    }
}
