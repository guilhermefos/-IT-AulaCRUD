/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 09243891685
 */
public class Product {
    
    private int    idProduct;
    private String name;
    private String description;
    private int    quantity;
    
    /**
     *
     * @param name
     * @param description
     * @param quantity
     */
    public Product(String name, String description, int quantity){
        this.name        = name;
        this.description = description;
        this.quantity    = quantity;
    }

    /**
     *
     * @return idProduct
     */
    public int getIdProduct() {
        return idProduct;
    }

    /**
     *
     * @param idProduct
     */
    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    /**
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     *
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" + "idProduct=" + idProduct + ", name=" + name + ", description=" + description + ", quantity=" + quantity + '}';
    }
    
    
}
