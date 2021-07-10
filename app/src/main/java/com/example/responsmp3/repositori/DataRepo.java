package com.example.responsmp3.repositori;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.responsmp3.model.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DataRepo {

    private MutableLiveData<List<Data>> mutableDataList;

    public LiveData<List<Data>> getDatas() {
        if (mutableDataList == null) {
            mutableDataList = new MutableLiveData<>();
            loadDatas();
        }
        return mutableDataList;
    }

    private void loadDatas() {
        List<Data> dataList = new ArrayList<>();
        dataList. add(new Data(UUID.randomUUID().toString(), "Bayar Token Listrik",  true, "https://i.pinimg.com/originals/05/61/a9/0561a920cf46d08d9b11d2ec8c9d1df7.png"));
        dataList. add(new Data(UUID.randomUUID().toString(), "Bayar Lewat Credit Card",  false, "https://www.pngfind.com/pngs/m/415-4153789_credit-card-aggregator-visa-hd-png-download.png"));
        dataList. add(new Data(UUID.randomUUID().toString(), "Isi Ulang Pulsa XL",  true, "https://i.pinimg.com/originals/5f/e1/6b/5fe16bc7708a8f4c7055af48573f8b11.jpg"));
        dataList. add(new Data(UUID.randomUUID().toString(), "Isi Ulang Pulsa SmartFren",  true, "https://logonoid.com/images/smartfren-logo.png"));
        dataList. add(new Data(UUID.randomUUID().toString(), "Isi Ulang Pulsa Telkomsel",  true, "https://img2.pngio.com/logo-telkomsel-format-png-lalu-ahmad-telkomsel-png-1600_875.png"));
        dataList. add(new Data(UUID.randomUUID().toString(), "Isi Ulang Pulsa Indosat",  false, "https://c0.klipartz.com/pngpicture/865/480/sticker-png-logo-indosat-im3-ooredoo-font-axis-bank-logo-text-logo-indonesia-ooredoo-line.png"));
        dataList. add(new Data(UUID.randomUUID().toString(), "Bayar PDAM",  true, "https://blog.deliv.co.id/wp-content/uploads/2020/07/PDAM1.png"));
        dataList. add(new Data(UUID.randomUUID().toString(), "Berlangganan Mola TV",  true, "https://parabolaku.com/wp-content/uploads/2019/07/Screenshot-150.png"));
        mutableDataList.setValue(dataList);
    }
}
