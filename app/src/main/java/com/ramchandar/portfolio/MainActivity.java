package com.ramchandar.portfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);

        // Remove Toolbar shadow
        ActionBar ab = getSupportActionBar();
        if (ab != null) ab.setElevation(0);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("unused") // Used by Butterknife
    @OnClick({R.id.btn_app_spotify, R.id.btn_app_scores, R.id.btn_app_library,
            R.id.btn_app_build_it_bigger, R.id.btn_app_xyz_reader, R.id.btn_app_capstone})
    public void onButtonClick(Button v) {
        switch (v.getId()) {
            case R.id.btn_app_spotify:
            case R.id.btn_app_scores:
            case R.id.btn_app_library:
            case R.id.btn_app_build_it_bigger:
            case R.id.btn_app_xyz_reader:
            case R.id.btn_app_capstone:
                break;
            default:
                return;
        }
        String toast = String.format(getResources().getString(R.string.toast), v.getText());
        showToast(toast);
    }

    private void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
