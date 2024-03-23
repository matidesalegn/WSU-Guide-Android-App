package www.wsu.edu.et;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Blocks extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerAdapter adapter;
    private ArrayList<String>blockName = new ArrayList<>();
    private ArrayList<String>blockDescribe = new ArrayList<>();
    private ArrayList<Integer>imageList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blocks);
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().setTitle("Blocks");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(Blocks.this));
        blockName.add("Block 01");
        blockName.add("Block 02");
        blockName.add("Block 03");
        blockName.add("Block 04");
        blockName.add("Block 05");
        blockName.add("Block 06");
        blockName.add("Block 07");
        blockName.add("Block 08");
        blockName.add("Block 09");
        blockName.add("Block 10");
        blockName.add("Block 11");
        blockName.add("Block 12");
        blockName.add("Block 13");
        blockName.add("Block 14");
        blockName.add("Block 15");
        blockName.add("Block 16");
        blockName.add("Block 17");
        blockName.add("Block 18");
        blockName.add("Block 19");
        blockName.add("Block 20");
        blockName.add("Block 21");
        blockName.add("Block 22");
        blockName.add("Block 23");
        blockName.add("Block 24");
        blockName.add("Block 25");
        blockName.add("Block 26");
        blockName.add("Block 27");
        blockName.add("Block 28");
        blockName.add("Block 29");
        blockName.add("Block 30");
        blockName.add("Block 31");
        blockName.add("Block 32");
        blockName.add("Block 33");
        blockName.add("Block 34");
        blockName.add("Block 35");
        blockName.add("Block 36");
        blockDescribe.add("Navigate to female block 01");
        blockDescribe.add("Navigate to female block 02");
        blockDescribe.add("Navigate to female block 03");
        blockDescribe.add("Navigate to female block 04");
        blockDescribe.add("Navigate to female block 05");
        blockDescribe.add("Navigate to female block 06");
        blockDescribe.add("Navigate to female block 07");
        blockDescribe.add("Navigate to female block 08");
        blockDescribe.add("Navigate to female block 09");
        blockDescribe.add("Navigate to female block 10");
        blockDescribe.add("Navigate to female block 11");
        blockDescribe.add("Navigate to female block 12");
        blockDescribe.add("Navigate to female block 13");
        blockDescribe.add("Navigate to male block 14");
        blockDescribe.add("Navigate to male block 15");
        blockDescribe.add("Navigate to male block 16");
        blockDescribe.add("Navigate to male block 17");
        blockDescribe.add("Navigate to male block 18");
        blockDescribe.add("Navigate to male block 19");
        blockDescribe.add("Navigate to male block 20");
        blockDescribe.add("Navigate to male block 21");
        blockDescribe.add("Navigate to male block 22");
        blockDescribe.add("Navigate to male block 23");
        blockDescribe.add("Navigate to male block 24");
        blockDescribe.add("Navigate to male block 25");
        blockDescribe.add("Navigate to male block 26");
        blockDescribe.add("Navigate to male block 27");
        blockDescribe.add("Navigate to male block 28");
        blockDescribe.add("Navigate to male block 29");
        blockDescribe.add("Navigate to male block 30");
        blockDescribe.add("Navigate to male block 31");
        blockDescribe.add("Navigate to male block 32");
        blockDescribe.add("Navigate to male block 33");
        blockDescribe.add("Navigate to male block 34");
        blockDescribe.add("Navigate to male block 35");
        blockDescribe.add("Navigate to male block 36");
        imageList.add(R.drawable.dormitory);
        imageList.add(R.drawable.dormitory);
        imageList.add(R.drawable.dormitory);
        imageList.add(R.drawable.dormitory);
        imageList.add(R.drawable.dormitory);
        imageList.add(R.drawable.dormitory);
        imageList.add(R.drawable.dormitory);
        imageList.add(R.drawable.dormitory);
        imageList.add(R.drawable.dormitory);
        imageList.add(R.drawable.dormitory);
        imageList.add(R.drawable.dormitory);
        imageList.add(R.drawable.dormitory);
        imageList.add(R.drawable.dormitory);
        imageList.add(R.drawable.dormitory);
        imageList.add(R.drawable.dormitory);
        imageList.add(R.drawable.dormitory);
        imageList.add(R.drawable.dormitory);
        imageList.add(R.drawable.dormitory);
        imageList.add(R.drawable.dormitory);
        imageList.add(R.drawable.dormitory);
        imageList.add(R.drawable.dormitory);
        imageList.add(R.drawable.dormitory);
        imageList.add(R.drawable.dormitory);
        imageList.add(R.drawable.dormitory);
        imageList.add(R.drawable.dormitory);
        imageList.add(R.drawable.dormitory);
        imageList.add(R.drawable.dormitory);
        imageList.add(R.drawable.dormitory);
        imageList.add(R.drawable.dormitory);
        imageList.add(R.drawable.dormitory);
        imageList.add(R.drawable.dormitory);
        imageList.add(R.drawable.dormitory);
        imageList.add(R.drawable.dormitory);
        imageList.add(R.drawable.dormitory);
        imageList.add(R.drawable.dormitory);
        imageList.add(R.drawable.dormitory);
        imageList.add(R.drawable.dormitory);
        imageList.add(R.drawable.dormitory);

        adapter = new RecyclerAdapter(blockName, blockDescribe, imageList, Blocks.this);
        recyclerView.setAdapter(adapter);
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