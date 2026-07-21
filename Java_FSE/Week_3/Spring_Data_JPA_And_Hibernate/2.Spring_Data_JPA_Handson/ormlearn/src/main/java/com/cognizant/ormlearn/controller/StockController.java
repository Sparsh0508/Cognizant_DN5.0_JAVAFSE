package com.cognizant.ormlearn.controller;

import com.cognizant.ormlearn.entity.Stock;
import com.cognizant.ormlearn.service.StockService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stocks")
public class StockController {

    private final StockService service;

    public StockController(StockService service) {
        this.service = service;
    }

    @GetMapping("/facebook")
    public List<Stock> facebook() {
        return service.getFacebookSeptember2019();
    }

    @GetMapping("/google")
    public List<Stock> google() {
        return service.getGoogleAbove1250();
    }

    @GetMapping("/top-volume")
    public List<Stock> topVolume() {
        return service.getTop3Volume();
    }

    @GetMapping("/netflix")
    public List<Stock> netflix() {
        return service.getLowestNetflix();
    }
}