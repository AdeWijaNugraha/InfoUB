package com.awn.app.raion;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import io.nlopez.smartadapters.views.BindableFrameLayout;

/**
 * Created by adewijanugraha on 28/03/17.
 */

public class MenuView extends BindableFrameLayout<Menu> {

    TextView textField;
    ImageView imageView;

    public MenuView(Context context) {
        super(context);
    }

    @Override
    public int getLayoutId() {
        return R.layout.list_group;
    }

    @Override
    public void onViewInflated() {
        super.onViewInflated();

        textField = (TextView) findViewById(R.id.menu_text);
        imageView = (ImageView) findViewById(R.id.icon_menu);


        setLayoutParams(new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
    }

    @Override
    public void bind(Menu menu) {
        textField.setText(menu.getMenu());
        imageView.setImageResource(menu.getImageResourceId());
    }

}
