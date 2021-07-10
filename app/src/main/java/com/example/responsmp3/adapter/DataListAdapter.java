package com.example.responsmp3.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.example.responsmp3.databinding.DataRowBinding;
import com.example.responsmp3.model.Data;

public class DataListAdapter extends ListAdapter<Data, DataListAdapter.DataViewHolder> {

    public DataListAdapter() {
        super(Data.itemCallback);
    }

    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        DataRowBinding dataRowBinding = DataRowBinding.inflate(layoutInflater, parent, false);
        return new DataViewHolder(dataRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull DataViewHolder holder, int position) {
        Data data = getItem(position);
        holder.dataRowBinding.setData(data);

    }

    class DataViewHolder extends RecyclerView.ViewHolder {

        DataRowBinding dataRowBinding;

        public DataViewHolder(DataRowBinding binding) {
            super(binding.getRoot());
            this.dataRowBinding = binding;
        }
    }

    public interface DataInterface {
        void addItem(Data data);
        void onItemClick(Data data);
    }
}
