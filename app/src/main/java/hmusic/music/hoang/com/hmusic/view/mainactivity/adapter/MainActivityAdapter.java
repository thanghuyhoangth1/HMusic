package hmusic.music.hoang.com.hmusic.view.mainactivity.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import hmusic.music.hoang.com.hmusic.R;
import hmusic.music.hoang.com.hmusic.view.offline.OfflineFragment;
import hmusic.music.hoang.com.hmusic.view.online.OnlineFragment;


public class MainActivityAdapter extends FragmentPagerAdapter {
    private static final int TAB_ONLINE = 0;
    private static final int TAB_OFFLINE = 1;
    private Context mContext;
    private List<String> mListTabTitle;
    private List<Fragment> mListFragment;

    public MainActivityAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
        createFragment();
        createTitle();
    }

    private void createTitle() {
        mListTabTitle = new ArrayList<>();
        mListTabTitle.add(mContext.getString(R.string.title_online));
        mListTabTitle.add(mContext.getString(R.string.title_offline));
    }

    private void createFragment() {
        mListFragment = new ArrayList<>();
        mListFragment.add(new OnlineFragment());
        mListFragment.add(new OfflineFragment());
    }

    @Override
    public Fragment getItem(int i) {
        return mListFragment.get(i);
    }

    @Override
    public int getCount() {
        return mListTabTitle == null ? 0 : mListTabTitle.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mListTabTitle.get(position);
    }
}
