package com.example.responsmp3.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DividerItemDecoration;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.responsmp3.R;
import com.example.responsmp3.adapter.DataListAdapter;
import com.example.responsmp3.databinding.FragmentHomeBinding;
import com.example.responsmp3.model.Data;
import com.example.responsmp3.viewmodel.DataViewModel;

import java.util.List;

public class HomeFragment extends Fragment implements DataListAdapter.DataInterface {

    FragmentHomeBinding fragmentHomeBinding;
    private DataListAdapter dataListAdapter;
    private DataViewModel dataViewModel;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentHomeBinding = FragmentHomeBinding.inflate(inflater, container, false);
        return  fragmentHomeBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        dataListAdapter = new DataListAdapter();
        fragmentHomeBinding.dataRecyclerView.setAdapter(dataListAdapter);

        fragmentHomeBinding.dataRecyclerView.addItemDecoration(new DividerItemDecoration(requireContext(),
                DividerItemDecoration.VERTICAL));
        fragmentHomeBinding.dataRecyclerView.addItemDecoration(new DividerItemDecoration(requireContext(),
                DividerItemDecoration.HORIZONTAL));

        dataViewModel = new ViewModelProvider(requireActivity()).get(DataViewModel.class);
        dataViewModel.getDatas().observe(getViewLifecycleOwner(), new Observer<List<Data>>() {
            @Override
            public void onChanged(List<Data> data) {
                dataListAdapter.submitList(data);
            }
        });
    }

    @Override
    public void addItem(Data data) {

    }

    @Override
    public void onItemClick(Data data) {

    }
}