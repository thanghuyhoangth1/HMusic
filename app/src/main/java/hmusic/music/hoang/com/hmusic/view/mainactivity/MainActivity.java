package hmusic.music.hoang.com.hmusic.view.mainactivity;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import hmusic.music.hoang.com.hmusic.BaseActivity;
import hmusic.music.hoang.com.hmusic.R;
import hmusic.music.hoang.com.hmusic.view.mainactivity.adapter.MainActivityAdapter;
import hmusic.music.hoang.com.hmusic.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {

    @Override
    protected void initDataBinding() {
        ActivityMainBinding mainBinding= DataBindingUtil.setContentView(this, R.layout.activity_main);
        mainBinding.setMainAcitivity(this);
    }

    @Override
    public void initComps(Bundle saveInstanceState) {
    }

    @BindingAdapter("setupPager")
    public static void pagerAdapter(TabLayout tabLayout, ViewPager viewPager) {
        tabLayout.setupWithViewPager(viewPager);
    }

    @BindingAdapter("intiViewPager")
    public static void initViewPager(ViewPager viewPager, MainActivity mainActivity) {
        MainActivityAdapter adapter = new MainActivityAdapter(mainActivity, mainActivity.getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }
}
