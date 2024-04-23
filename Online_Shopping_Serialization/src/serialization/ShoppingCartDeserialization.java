package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class ShoppingCartDeserialization {
	 public static ShoppingCart deserializeShoppingCart(String filename) {
	        try (FileInputStream fileInputStream = new FileInputStream(filename);
	             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
	            return (ShoppingCart) objectInputStream.readObject();
	        } catch (IOException | ClassNotFoundException ex) {
	            System.err.println("Error occurred during deserialization: " + ex.getMessage());
	            return null;
	        }
	    }

	    public static void main(String[] args) {
	        String filename = "ShoppingCart.ser";
	        ShoppingCart cart = deserializeShoppingCart(filename);
	        if (cart != null) {
	            System.out.println("Deserialized ShoppingCart:");
	            System.out.println(cart);
	        }
	    }
	}
