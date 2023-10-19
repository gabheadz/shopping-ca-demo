package co.com.bancolombia.model.cart;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.Getter;
//import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
//@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Cart {

    private String cartId;
    private Address address;
    private CreditCardVo creditCard;
    private List<Item> items;
    private int total;

}
