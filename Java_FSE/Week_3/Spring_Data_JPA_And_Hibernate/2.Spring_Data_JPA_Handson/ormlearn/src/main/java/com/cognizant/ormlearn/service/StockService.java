package com.cognizant.ormlearn.service;

import com.cognizant.ormlearn.entity.Stock;
import com.cognizant.ormlearn.repository.StockRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StockService {

    private final StockRepository repository;

    public StockService(StockRepository repository) {
        this.repository = repository;
    }

    public List<Stock> getFacebookSeptember2019() {
        return repository.findByCodeAndDateBetween(
                "FB",
                LocalDate.of(2019,9,1),
                LocalDate.of(2019,9,30));
    }

    public List<Stock> getGoogleAbove1250() {
        return repository.findByCodeAndCloseGreaterThan(
                "GOOGL",
                1250.0);
    }

    public List<Stock> getTop3Volume() {
        return repository.findTop3ByOrderByVolumeDesc();
    }

    public List<Stock> getLowestNetflix() {
        return repository.findTop3ByCodeOrderByCloseAsc("NFLX");
    }
}