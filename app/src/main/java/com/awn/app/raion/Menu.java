package com.awn.app.raion;

/**
 * Created by adewijanugraha on 28/03/17.
 */

public class Menu {

    private String menu;
    private int ImageResourceId;

    public Menu(String menu, int ImageResourceId) {
        this.menu = menu;
        this.ImageResourceId = ImageResourceId;

    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public int getImageResourceId() {return ImageResourceId; }
}
