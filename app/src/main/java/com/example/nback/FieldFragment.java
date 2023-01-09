package com.example.nback;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.GridView;

import java.util.ArrayList;

public class FieldFragment extends Fragment {
    ArrayList<View> listBlocks;

    public FieldFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.field_layout, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        listBlocks = new ArrayList<View>(9);

        GridLayout grid = (GridLayout) getActivity().findViewById(R.id.grid_layout);
        for (int i = 0; i < 9; i++) {
            View element = new View(getActivity().getApplicationContext());

            element.setLayoutParams(new ViewGroup.LayoutParams(R.dimen.size_rectangle_withborder, R.dimen.size_rectangle_withborder));
            ViewGroup.MarginLayoutParams params = (ViewGroup.MarginLayoutParams)grid.getLayoutParams();
            params.setMargins(0, 0, R.dimen.margin_rect, 0);
            element.setLayoutParams(params);

            switch (i) {
                case 1: element.setId(R.id.block_2); break;
                case 2: element.setId(R.id.block_3); break;
                case 3: element.setId(R.id.block_4); break;
                case 4: element.setId(R.id.block_5); break;
                case 5: element.setId(R.id.block_6); break;
                case 6: element.setId(R.id.block_7); break;
                case 7: element.setId(R.id.block_8); break;
                case 8: element.setId(R.id.block_9); break;
                default: element.setId(R.id.block_1);
            }

            element.setBackgroundColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.black));

            grid.addView(element);
            listBlocks.add(element);
        }
    }
}