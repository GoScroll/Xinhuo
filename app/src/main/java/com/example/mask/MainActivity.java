package com.example.mask;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.BottomBarTab;
import com.roughike.bottombar.OnTabReselectListener;
import com.roughike.bottombar.OnTabSelectListener;
import com.roughike.bottombar.TabSelectionInterceptor;

public class MainActivity extends AppCompatActivity {

    private BottomBar bottomBar;
    private BottomBarTab bottomBarTab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomBar=(BottomBar) findViewById(R.id.bottomBar);


        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(int tabId) {
                if(tabId == R.id.tab_favorites){
                    bottomBarTab=bottomBar.getTabWithId(R.id.tab_nearby);
                    bottomBarTab.setBadgeCount(3);
                }
            }
        });

/*        bottomBar.setOnTabReselectListener(new OnTabReselectListener() {
            @Override
            public void onTabReSelected(int tabId) {
                switch(tabId){
                    case R.id.tab_favorites:
                        bottomBarTab.removeBadge();
                        break;
                    case R.id.tab_nearby:
                        bottomBarTab.removeBadge();
                        break;
                    case R.id.tab_recents:
                        bottomBarTab.removeBadge();
                        break;
                    default:
                        break;
                }
            }
        });*/


    }


}
