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

public class Gates extends AppCompatActivity {

    private Button btnMainGate1, btnMainGate2, btnMainGate3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gates);
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().setTitle("Entrance Gates Navigate");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnMainGate1 = findViewById(R.id.mainGate1);
        btnMainGate2 = findViewById(R.id.mainGate2);
        btnMainGate3 = findViewById(R.id.mainGate3);

        btnMainGate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri intentUri = Uri.parse("google.navigation:q=6.8288000, 37.7530105&mode=d");
                Intent intent = new Intent(Intent.ACTION_VIEW,intentUri);
                intent.setPackage("com.google.android.apps.maps");
                if (intent.resolveActivity(getPackageManager()) !=null) {
                    startActivity(intent);
                } else {
                    Log.d("Implicit intents", "can't handle");
                }
            }
        });
        btnMainGate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri intentUri = Uri.parse("google.navigation:q=6.8318733, 37.7544113&mode=d");
                        Intent intent = new Intent(Intent.ACTION_VIEW,intentUri);
                intent.setPackage("com.google.android.apps.maps");
                if (intent.resolveActivity(getPackageManager()) !=null) {
                    startActivity(intent);
                } else {
                    Log.d("Implicit intents", "can't handle");
                }
            }
        });
        btnMainGate3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri intentUri = Uri.parse("google.navigation:q=6.8258329, 37.7517435&mode=d");
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