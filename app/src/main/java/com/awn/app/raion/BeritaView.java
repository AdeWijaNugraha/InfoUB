package com.awn.app.raion;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import io.nlopez.smartadapters.views.BindableFrameLayout;

/**
 * Created by adewijanugraha on 28/03/17.
 */

public class BeritaView extends BindableFrameLayout<MenuBerita> {

    TextView judul, view;
    ImageView imageView;

    public BeritaView(Context context) {
        super(context);
    }

    @Override
    public int getLayoutId() {
        return R.layout.list_berita;
    }

    @Override
    public void onViewInflated() {
        super.onViewInflated();

        judul = (TextView) findViewById(R.id.menu_text);
        imageView = (ImageView) findViewById(R.id.menu_icon);
        view = (TextView) findViewById(R.id.view);


        setLayoutParams(new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
    }

    @Override
    public void bind(MenuBerita menu) {
        judul.setText(menu.getMenu());
        view.setText(menu.getView());
        imageView.setImageResource(menu.getImageResourceId());
    }

}
