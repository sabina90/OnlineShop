package pl.michalskrzypek.model;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import pl.michalskrzypek.entity.Account;
import pl.michalskrzypek.entity.Address;
import pl.michalskrzypek.entity.Cart;
import pl.michalskrzypek.entity.CartLine;
import pl.michalskrzypek.entity.OrderDetail;

@Getter
@Setter
public class CheckoutModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Account account;
	private Address shipping;
	private Cart cart;
	private List<CartLine> cartLines;
	private OrderDetail orderDetail;
	private double checkoutTotal;
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Address getShipping() {
		return shipping;
	}
	public void setShipping(Address shipping) {
		this.shipping = shipping;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public List<CartLine> getCartLines() {
		return cartLines;
	}
	public void setCartLines(List<CartLine> cartLines) {
		this.cartLines = cartLines;
	}
	public OrderDetail getOrderDetail() {
		return orderDetail;
	}
	public void setOrderDetail(OrderDetail orderDetail) {
		this.orderDetail = orderDetail;
	}
	public double getCheckoutTotal() {
		return checkoutTotal;
	}
	public void setCheckoutTotal(double checkoutTotal) {
		this.checkoutTotal = checkoutTotal;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}