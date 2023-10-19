package co.com.bancolombia.model.cart.gateways;

import co.com.bancolombia.model.cart.Cart;
import reactor.core.publisher.Mono;

public interface CartRepository {
    Mono<Cart> getCart(String id);
    Mono<Cart> save(Cart cart);
}
