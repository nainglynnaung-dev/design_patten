package builder;

import java.time.LocalDate;

public class Main5 {

    public static void main(String[] args) {
        Product product=new ProductBuilder().create()
                .addName("Naing").addDescription("Hello").addPrice(200.00).addUpdateDate(LocalDate.parse("2025-11-15")).addQuantity(25).build();
        System.out.println(product.toString());
    }
}
