package hmusic.music.hoang.com.hmusic;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDataBinding();
        initComps(savedInstanceState);
    }

    protected abstract void initDataBinding();

    public abstract void initComps(Bundle saveInstancsState);
}
