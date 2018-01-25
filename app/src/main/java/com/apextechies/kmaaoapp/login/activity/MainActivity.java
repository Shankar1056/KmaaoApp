package com.apextechies.kmaaoapp.login.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.apextechies.kmaaoapp.R;

import butterknife.BindView;

/**
 * Created by shankar on 25/1/18.
 */

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.rv_applist)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.applist_row);
    }
}
