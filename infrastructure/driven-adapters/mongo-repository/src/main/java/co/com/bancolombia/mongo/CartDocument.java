package co.com.bancolombia.mongo;

import co.com.bancolombia.model.cart.Address;
import co.com.bancolombia.model.cart.CreditCardVo;
import co.com.bancolombia.model.cart.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "cart")
public class CartDocument {
    @Id
    private String cartId;
    private Address address;
    private CreditCardVo creditCard;
    private List<Item> items;
    private int total;
}
