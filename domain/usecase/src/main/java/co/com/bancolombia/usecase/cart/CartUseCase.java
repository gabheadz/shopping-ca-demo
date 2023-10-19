package co.com.bancolombia.usecase.cart;

import co.com.bancolombia.model.cart.Cart;
import co.com.bancolombia.model.cart.Item;
import co.com.bancolombia.model.cart.gateways.CartRepository;
import co.com.bancolombia.model.product.Product;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class CartUseCase {

    private final CartRepository cartRepository;

    public Mono<Cart> addProduct (Cart cart, Product product, int quantity){
        Item item = Item.builder().product(product).quantity(quantity).build();
        List<Item> items = new ArrayList<>(cart.getItems());
        items.add(item);
        Cart newCart = cart.toBuilder().items(items).build();
        return cartRepository.save(newCart);
    }
}
