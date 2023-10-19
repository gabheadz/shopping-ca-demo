package co.com.bancolombia.model.cart;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class CreditCardVo {
    private String issuer;
    private String number;
    private String expiration;
    private String cvv;
}
