package com.accesa.price_comparator_market.domain;

import com.opencsv.bean.CsvBindByName;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProductCsv {

    @CsvBindByName
    private String product_id;

    @CsvBindByName
    private String product_name;

    @CsvBindByName
    private String product_category;

    @CsvBindByName
    private String brand;

    @CsvBindByName
    private double package_quantity;

    @CsvBindByName
    private String package_unit;

    @CsvBindByName
    private double price;

    @CsvBindByName
    private String currency;
}
