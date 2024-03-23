package www.wsu.edu.et;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainCampus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_campus);
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().setTitle("Main Campus");
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

    public void gate(View view) {
        Intent intent1 = new Intent(MainCampus.this, Gates.class);
        startActivity(intent1);
    }

    public void headOffice(View view) {
        Intent intent2 = new Intent(MainCampus.this, HeadOffice.class);
        startActivity(intent2);
    }

    public void registrar(View view) {
        Uri intentUri = Uri.parse("google.navigation:q=6.8285836, 37.7521891&mode=d");
        Intent intent3 = new Intent(Intent.ACTION_VIEW,intentUri);
        intent3.setPackage("com.google.android.apps.maps");
        startActivity(intent3);
    }

    public void lounges(View view) {
        Intent intent4 = new Intent(MainCampus.this, Lounges.class);
        startActivity(intent4);
    }

    public void hall(View view) {
        Uri intentUri = Uri.parse("google.navigation:q=6.8330697, 37.7543858&mode=d");
        Intent intent5 = new Intent(Intent.ACTION_VIEW,intentUri);
        intent5.setPackage("com.google.android.apps.maps");
        startActivity(intent5);
    }

    public void ictc(View view) {
        Uri intentUri = Uri.parse("google.navigation:q=6.8303633, 37.7517818&mode=d");
        Intent intent6 = new Intent(Intent.ACTION_VIEW,intentUri);
        intent6.setPackage("com.google.android.apps.maps");
        startActivity(intent6);
    }
    public void police(View view) {
        Uri intentUri = Uri.parse("google.navigation:q=6.8317787, 37.7543295&mode=d");
        Intent intent7 = new Intent(Intent.ACTION_VIEW,intentUri);
        intent7.setPackage("com.google.android.apps.maps");
        startActivity(intent7);
    }

    public void clinic(View view) {
        Uri intentUri = Uri.parse("google.navigation:q=6.8290730, 37.7507940&mode=d");
        Intent intent14 = new Intent(Intent.ACTION_VIEW,intentUri);
        intent14.setPackage("com.google.android.apps.maps");
        startActivity(intent14);
    }

    public void dormitory(View view) {
        Intent intent8 = new Intent(MainCampus.this, Blocks.class);
        startActivity(intent8);
    }

    public void cafeteria(View view) {
        Intent intent9 = new Intent(MainCampus.this, Cafeteria.class);
        startActivity(intent9);
    }

    public void libraries(View view) {
        Intent intent10 = new Intent(MainCampus.this, Libraries.class);
        startActivity(intent10);
    }

    public void classRoom(View view) {
        Intent intent11 = new Intent(MainCampus.this, Rooms.class);
        startActivity(intent11);
    }

    public void department(View view) {
        Intent intent12 = new Intent(MainCampus.this, departments.class);
        startActivity(intent12);
    }

    public void service(View view) {
        Uri intentUri = Uri.parse("google.navigation:q=6.8291895, 37.7509647&mode=d");
        Intent intent13 = new Intent(Intent.ACTION_VIEW,intentUri);
        intent13.setPackage("com.google.android.apps.maps");
        startActivity(intent13);
    }
}