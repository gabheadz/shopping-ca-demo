package co.com.bancolombia.model.cart;

import co.com.bancolombia.model.product.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Item {
    private Product product;
    private int quantity;
}
