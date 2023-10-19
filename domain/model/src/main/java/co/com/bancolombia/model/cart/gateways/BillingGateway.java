package co.com.bancolombia.model.cart.gateways;

import co.com.bancolombia.model.cart.Cart;
import reactor.core.publisher.Mono;

public interface BillingGateway {
    Mono<Cart> pay(Cart cart);
}
