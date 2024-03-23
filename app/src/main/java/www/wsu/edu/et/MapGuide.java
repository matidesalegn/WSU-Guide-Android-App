package www.wsu.edu.et;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MapGuide extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_guide);
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().setTitle("WSU Map Guide");
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
    }
    @Override
    public void onBackPressed() {
        finish();
        super.onBackPressed();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) finish();
        return super.onOptionsItemSelected(item);
    }

    public void technocampus(View view) {
        Log.i("technocampus", "technocampus is clicked");
    }
    public void otona(View view) {
        Log.i("otona", "otona is clicked");
    }
    public void dawroTarcha(View view) {
        Log.i("dawroTarcha", "dawroTarcha is clicked");
    }

    public void mainCampus(View view) {
        Intent intent = new Intent(MapGuide.this, MainCampus.class);
        startActivity(intent);
    }
}