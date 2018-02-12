package com.awn.app.raion;

/**
 * Created by adewijanugraha on 28/03/17.
 */

public class MenuBerita {

    private String menu, view;
    private int ImageResourceId;

    public MenuBerita(String menu, int ImageResourceId, String view) {
        this.menu = menu;
        this.view = view;
        this.ImageResourceId = ImageResourceId;

    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public int getImageResourceId() {return ImageResourceId; }
}
