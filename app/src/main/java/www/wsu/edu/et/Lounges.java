package www.wsu.edu.et;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class Lounges extends AppCompatActivity {

    private Button mLounges, mLounges2, mLounges3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lounges);
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().setTitle("Navigate To Lounges");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mLounges = findViewById(R.id.lounges);
        mLounges2 = findViewById(R.id.lounges2);
        mLounges3 = findViewById(R.id.lounges3);
        mLounges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri intentUri = Uri.parse("google.navigation:q=6.8269591, 37.7505597&mode=d");
                Intent intent = new Intent(Intent.ACTION_VIEW,intentUri);
                intent.setPackage("com.google.android.apps.maps");
                if (intent.resolveActivity(getPackageManager()) !=null) {
                    startActivity(intent);
                } else {
                    Log.d("Implicit intents", "can't handle");
                }
            }
        });
        mLounges2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri intentUri = Uri.parse("google.navigation:q=6.8301279, 37.7528520&mode=d");
                Intent intent = new Intent(Intent.ACTION_VIEW,intentUri);
                intent.setPackage("com.google.android.apps.maps");
                if (intent.resolveActivity(getPackageManager()) !=null) {
                    startActivity(intent);
                } else {
                    Log.d("Implicit intents", "can't handle");
                }
            }
        });
        mLounges3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri intentUri = Uri.parse("google.navigation:q=6.8298672, 37.7532483&mode=d");
                Intent intent = new Intent(Intent.ACTION_VIEW,intentUri);
                intent.setPackage("com.google.android.apps.maps");
                if (intent.resolveActivity(getPackageManager()) !=null) {
                    startActivity(intent);
                } else {
                    Log.d("Implicit intents", "can't handle");
                }
            }
        });
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
}