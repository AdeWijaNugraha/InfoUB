package com.awn.app.raion;

/**
 * Created by adewijanugraha on 28/03/17.
 */

public class MenuGroupSchedule {

    private String menu;
    private int ImageResourceId;

    public MenuGroupSchedule(String menu, int ImageResourceId) {
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
