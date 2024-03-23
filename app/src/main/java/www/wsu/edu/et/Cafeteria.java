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

public class Cafeteria extends AppCompatActivity {

   private Button enatCafe, fikirCafe, mfCaffe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafeteria);
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().setTitle("Navigate To Cafeteria");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        enatCafe = findViewById(R.id.enatCafe);
        fikirCafe = findViewById(R.id.fikirCafe);
        mfCaffe = findViewById(R.id.mfCaffe);

        enatCafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri intentUri = Uri.parse("google.navigation:q=6.8292707, 37.7517905&mode=d");
                Intent intent = new Intent(Intent.ACTION_VIEW,intentUri);
                intent.setPackage("com.google.android.apps.maps");
                if (intent.resolveActivity(getPackageManager()) !=null) {
                    startActivity(intent);
                } else {
                    Log.d("Implicit intents", "can't handle");
                }
            }
        });

        fikirCafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri intentUri = Uri.parse("google.navigation:q=6.8295457, 37.7526816&mode=d");
                Intent intent = new Intent(Intent.ACTION_VIEW,intentUri);
                intent.setPackage("com.google.android.apps.maps");
                if (intent.resolveActivity(getPackageManager()) !=null) {
                    startActivity(intent);
                } else {
                    Log.d("Implicit intents", "can't handle");
                }
            }
        });
        mfCaffe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri intentUri = Uri.parse("google.navigation:q=6.8292710, 37.7522582&mode=d");
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