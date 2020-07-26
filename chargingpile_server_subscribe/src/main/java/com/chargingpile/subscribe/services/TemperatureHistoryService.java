package com.chargingpile.subscribe.services;

import com.chargingpile.subscribe.dao.TemperatureDao;
import com.chargingpile.subscribe.data.TemperatureHistory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TemperatureHistoryService {
    @Autowired
    private TemperatureDao dataDao;

    public TemperatureHistoryService(TemperatureDao dataDao) {
        this.dataDao = dataDao;
    }

    public void saveTemperature(TemperatureHistory bookCollect) {
        dataDao.save(bookCollect);
    }

}
