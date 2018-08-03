package hmusic.music.hoang.com.hmusic;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getView());
        initComps(savedInstanceState);
    }

    public abstract void initComps(Bundle saveInstancsState);

    public abstract int getView();

}
