package org.cfx.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author RTX 9090
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private long id;
    private String productName;
    private long dirId;
    private double salePrice;
    private String supplier;
    private String brand;
    private double cutoff;
    private double costPrice;


    public Product(String productName, long dirId, double salePrice, String supplier, String brand, double cutoff, double costPrice) {
        this.productName = productName;
        this.dirId = dirId;
        this.salePrice = salePrice;
        this.supplier = supplier;
        this.brand = brand;
        this.cutoff = cutoff;
        this.costPrice = costPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", dirId=" + dirId +
                ", salePrice=" + salePrice +
                ", supplier='" + supplier + '\'' +
                ", brand='" + brand + '\'' +
                ", cutoff=" + cutoff +
                ", costPrice=" + costPrice +
                '}';
    }
}
