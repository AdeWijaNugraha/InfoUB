package com.awn.app.raion;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.FrameLayout;

/**
 * Created by adewijanugraha on 28/03/17.
 */

public class ContainerActivity extends AppCompatActivity {

    FrameLayout fragmentContainer;
    BottomNavigationView bottomNav;
    Toolbar myToolbar;
    String fakultas, nim;
    int tahun;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);

        Bundle bundle = getIntent().getExtras();
        fakultas = bundle.getString("fakultas");
        nim = bundle.getString("nim");
        tahun = bundle.getInt("tahun");

        fragmentContainer = (FrameLayout) findViewById(R.id.container_fragmentContainer);
        bottomNav = (BottomNavigationView) findViewById(R.id.container_bottomNav);

        myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        myToolbar.setTitle("News");
        setSupportActionBar(myToolbar);

        bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                switch (item.getItemId()) {
                    case R.id.item1:
                        fragmentTransaction.replace(R.id.container_fragmentContainer, Menu1Fragment.newInstance());
                        myToolbar.setTitle("News");
                        fragmentTransaction.commit();
                        break;
                    case R.id.item2:
                        fragmentTransaction.replace(R.id.container_fragmentContainer, Menu2Fragment.newInstance(fakultas));
                        myToolbar.setTitle("Event");
                        fragmentTransaction.commit();
                        break;
                    case R.id.item3:
                        fragmentTransaction.replace(R.id.container_fragmentContainer, Menu3Fragment.newInstance());
                        myToolbar.setTitle("Fakultas "+fakultas);
                        fragmentTransaction.commit();
                        break;
                    case R.id.item4:
                        fragmentTransaction.replace(R.id.container_fragmentContainer, Menu4Fragment.newInstance());
                        myToolbar.setTitle("My Schedule");
                        fragmentTransaction.commit();
                        break;
                    case R.id.item5:
                        fragmentTransaction.replace(R.id.container_fragmentContainer, Menu5Fragment.newInstance());
                        myToolbar.setTitle("Profile");
                        fragmentTransaction.commit();
                        break;
                }
                return true;
            }
        });

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container_fragmentContainer, Menu1Fragment.newInstance());
        fragmentTransaction.commit();
    }
}
