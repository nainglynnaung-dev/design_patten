package builder;

import java.time.LocalDate;

public class Product {
    private String name;
    private String description;
    private double price;
    private LocalDate updateDate;
    private Integer quantity;

    public Product() {
    }

    public Product(String name, String description, double price, LocalDate updateDate, Integer quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.updateDate = updateDate;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", updateDate=" + updateDate +
                ", quantity=" + quantity +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
