package com.example.responsmp3.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.responsmp3.model.Data;
import com.example.responsmp3.repositori.DataRepo;

import java.util.List;

public class DataViewModel extends ViewModel {

    DataRepo dataRepo = new DataRepo();

    public LiveData<List<Data>> getDatas() {
        return dataRepo.getDatas();
    }
}
