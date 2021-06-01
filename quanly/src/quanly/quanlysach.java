/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanly;

/**
 *
 * @author ADMIN
 */
public class quanlysach {
    public int id;
    public String title;
    public int price;
    public String athor;

    public quanlysach(int id, String title, int price, String athor) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.athor = athor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAthor() {
        return athor;
    }

    public void setAthor(String athor) {
        this.athor = athor;
    }
    
}
