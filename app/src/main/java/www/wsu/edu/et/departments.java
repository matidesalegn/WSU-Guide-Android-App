package www.wsu.edu.et;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class departments extends AppCompatActivity {

    private Button fb, geology;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_departments);
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().setTitle("Navigate To Collages");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        fb = findViewById(R.id.fb);
        geology = findViewById(R.id.geology);

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri intentUri = Uri.parse("google.navigation:q=6.8313613, 37.7539238&mode=d");
                Intent intent = new Intent(Intent.ACTION_VIEW,intentUri);
                intent.setPackage("com.google.android.apps.maps");
                if (intent.resolveActivity(getPackageManager()) !=null) {
                    startActivity(intent);
                } else {
                    Log.d("Implicit intents", "can't handle");
                }
            }
        });
        geology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri intentUri = Uri.parse("google.navigation:q=6.8286711, 37.7515980&mode=d");
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