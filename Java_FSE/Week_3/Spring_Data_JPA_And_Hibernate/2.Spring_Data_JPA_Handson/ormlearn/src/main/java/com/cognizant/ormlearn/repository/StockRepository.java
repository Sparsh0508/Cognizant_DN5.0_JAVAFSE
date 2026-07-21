package com.cognizant.ormlearn.repository;

import com.cognizant.ormlearn.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface StockRepository extends JpaRepository<Stock, Integer> {

    // Facebook stock in September 2019
    List<Stock> findByCodeAndDateBetween(
            String code,
            LocalDate start,
            LocalDate end);

    // Google stock close price > 1250
    List<Stock> findByCodeAndCloseGreaterThan(
            String code,
            Double price);

    // Top 3 highest volume
    List<Stock> findTop3ByOrderByVolumeDesc();

    // Lowest 3 Netflix stock prices
    List<Stock> findTop3ByCodeOrderByCloseAsc(String code);
}