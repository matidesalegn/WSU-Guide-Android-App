package www.wsu.edu.et;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;


import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class Infowsu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infowsu);
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().setTitle("WSU Info");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageSlider imageSlider;


        imageSlider =findViewById(R.id.image_slider);

        ArrayList<SlideModel> imageList = new ArrayList<>();


        imageList.add(new SlideModel(R.drawable.wsudoor,null));
        imageList.add(new SlideModel(R.drawable.wsuu,null));
        imageList.add(new SlideModel(R.drawable.logowsu1,null));
        imageList.add(new SlideModel(R.drawable.maincampus,null));
        imageList.add(new SlideModel(R.drawable.sodoo,null));
        imageList.add(new SlideModel(R.drawable.otonacampus,null));
        imageList.add(new SlideModel(R.drawable.technocampus,null));
        imageList.add(new SlideModel(R.drawable.wolaita,null));

        imageSlider.setImageList(imageList);


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