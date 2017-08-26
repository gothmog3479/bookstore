package ru.gothmog.bookstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.gothmog.bookstore.domain.*;
import ru.gothmog.bookstore.repository.BookToCartItemRepository;
import ru.gothmog.bookstore.repository.CartItemRepository;
import ru.gothmog.bookstore.service.CartItemService;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author gothmog on 26.08.2017.
 */
@Service
public class CartItemServiceImpl implements CartItemService {

    @Autowired
    private CartItemRepository cartItemRepository;

    @Autowired
    private BookToCartItemRepository bookToCartItemRepository;

    public List<CartItem> findByShoppingCart(ShoppingCart shoppingCart) {
        return cartItemRepository.findByShoppingCart(shoppingCart);
    }

    public CartItem updateCartItem(CartItem cartItem) {
        BigDecimal bigDecimal = new BigDecimal(cartItem.getBook().getOurPrice()).multiply(new BigDecimal(cartItem.getQty()));

        bigDecimal = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP);
        cartItem.setSubtotal(bigDecimal);

        cartItemRepository.save(cartItem);

        return cartItem;
    }

    public CartItem addBookToCartItem(Book book, User user, int qty) {
        List<CartItem> cartItemList = findByShoppingCart(user.getShoppingCart());

        for (CartItem cartItem : cartItemList) {
            if (book.getId() == cartItem.getBook().getId()) {
                cartItem.setQty(cartItem.getQty() + qty);
                cartItem.setSubtotal(new BigDecimal(book.getOurPrice()).multiply(new BigDecimal(qty)));
                cartItemRepository.save(cartItem);
                return cartItem;
            }
        }

        CartItem cartItem = new CartItem();
        cartItem.setShoppingCart(user.getShoppingCart());
        cartItem.setBook(book);

        cartItem.setQty(qty);
        cartItem.setSubtotal(new BigDecimal(book.getOurPrice()).multiply(new BigDecimal(qty)));
        cartItem = cartItemRepository.save(cartItem);

        BookToCartItem bookToCartItem = new BookToCartItem();
        bookToCartItem.setBook(book);
        bookToCartItem.setCartItem(cartItem);
        bookToCartItemRepository.save(bookToCartItem);

        return cartItem;
    }

    public CartItem findById(Long id) {
        return cartItemRepository.findOne(id);
    }

    public void removeCartItem(CartItem cartItem) {
        bookToCartItemRepository.deleteByCartItem(cartItem);
        cartItemRepository.delete(cartItem);
    }

    public CartItem save(CartItem cartItem) {
        return cartItemRepository.save(cartItem);
    }

    public List<CartItem> findByOrder(Order order) {
        return cartItemRepository.findByOrder(order);
    }
}
