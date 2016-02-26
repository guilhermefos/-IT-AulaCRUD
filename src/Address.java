/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 09243891685
 */
public class Address {
    
    private int    idAddress;
    private String street;
    private String neighborhood;
    private String zipcode;
    
    /**
     *
     * @param street
     * @param neighborhood
     * @param zipcode
     */
    public Address(String street, String neighborhood, String zipcode){
        this.street       = street;
        this.neighborhood = neighborhood;
        this.zipcode      = zipcode;
    }

    /**
     *
     * @return idAddress
     */
    public int getIdAddress() {
        return idAddress;
    }

    /**
     *
     * @param idAddress
     */
    public void setIdAddress(int idAddress) {
        this.idAddress = idAddress;
    }

    /**
     *
     * @return street
     */
    public String getStreet() {
        return street;
    }

    /**
     *
     * @param street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     *
     * @return neighborhood
     */
    public String getNeighborhood() {
        return neighborhood;
    }

    /**
     *
     * @param neighborhood
     */
    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    /**
     *
     * @return zipcode
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     *
     * @param zipcode
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Address{" + "idAddress=" + idAddress + ", street=" + street + ", neighborhood=" + neighborhood + ", zipcode=" + zipcode + '}';
    }
    
    
}
