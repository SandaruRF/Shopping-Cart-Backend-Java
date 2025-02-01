package com.projects.springshop.request;

import com.projects.springshop.model.Category;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductUpdateRequest {
    private Long id;
    private String name;
    private String brand;
    private BigDecimal price;
    private int inventory;
    private String description;
    private Category category;

    public String getName() {
        return this.name;
    }
    public String getBrand() {
        return this.brand;
    }
    public BigDecimal getPrice() {
        return  this.price;
    }
    public int getInventory(){
        return this.inventory;
    }
    public String getDescription() {
        return this.description;
    }
    public Category getCategory() {
        return this.category;
    }
}
