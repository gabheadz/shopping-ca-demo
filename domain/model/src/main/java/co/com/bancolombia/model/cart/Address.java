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
public class Address {
    private String address;
    private String zipCode;
    private String city;
    private String state;
    private String country;


}
