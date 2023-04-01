package cinema.service;

import cinema.model.User;
import cinema.model.MovieSession;
import cinema.model.ShoppingCart;

public interface ShoppingCartService {
    void addSession(MovieSession movieSession, User user);

    ShoppingCart getByUser(User user);

    void registerNewShoppingCart(User user);

    void clear(ShoppingCart shoppingCart);
}
