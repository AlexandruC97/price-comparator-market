package com.accesa.price_comparator_market.domain;

import com.opencsv.bean.CsvBindByName;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DiscountProductCsv {

    @CsvBindByName
    private String product_id;

    @CsvBindByName
    private String product_name;

    @CsvBindByName
    private String brand;

    @CsvBindByName
    private double package_quantity;

    @CsvBindByName
    private String package_unit;

    @CsvBindByName
    private String product_category;

    @CsvBindByName
    private String from_date;

    @CsvBindByName
    private String to_date;

    @CsvBindByName
    private int percentage_of_discount;
}
