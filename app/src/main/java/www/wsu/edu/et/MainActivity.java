package www.wsu.edu.et;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle actionBarDrawerToggle;
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        switch (item.getItemId()) {

            case R.id.blocksList:
                Intent intent = new Intent(MainActivity.this, Blocks.class);
                startActivity(intent);
                break;

            case R.id.info:
                Intent intent1 = new Intent(MainActivity.this, Infowsu.class);
                startActivity(intent1);
                break;

            case R.id.settings:
                Intent intent2 = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(intent2);
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    public void map(View view) {
        Intent intent = new Intent(MainActivity.this, MapGuide.class);
        startActivity(intent);
    }
    public void site(View view) {
        Intent intent = new Intent(MainActivity.this, WebsiteActivity.class);
        startActivity(intent);
    }
    public void estudent(View view) {
        Intent intent = new Intent(MainActivity.this, Estudent.class);
        startActivity(intent);
    }
    public void eLearning(View view) {
        Intent intent = new Intent(MainActivity.this, Opac.class);
        startActivity(intent);
    }
    public void note(View view) {
        Intent intent = new Intent(MainActivity.this, NoteListActivity.class);
        startActivity(intent);
    }
    public void Reminder(View view) {
        Intent intent = new Intent(MainActivity.this, DailyReminder.class);
        startActivity(intent);
    }
    public void info(View view) {
        Intent intent = new Intent(MainActivity.this, Infowsu.class);
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu,menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().setTitle("Home");
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigationView);
        navigationView.setItemIconTintList(null);
        navigationView.setItemIconTintList(null);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.menu_Open, R.string.menu_Close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {

                    case R.id.home:
                        Intent intent = new Intent(MainActivity.this, MainActivity.class);
                        startActivity(intent);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.map_guide:
                        Intent intent1 = new Intent(MainActivity.this, MapGuide.class);
                        startActivity(intent1);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.website:
                        Intent intent2 = new Intent(MainActivity.this, WebsiteActivity.class);
                        startActivity(intent2);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.login:
                        Intent intent3 = new Intent(MainActivity.this, Estudent.class);
                        startActivity(intent3);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.opac:
                        Intent intent4 = new Intent(MainActivity.this, Opac.class);
                        startActivity(intent4);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.feedback:
                        Intent intent5 = new Intent(Intent.ACTION_SENDTO);
                        String UriText = "mailto:" + Uri.encode("wsuniv@ethionet.et") + "?subject=" +
                                Uri.encode("Feedback") + "$body=" + Uri.encode(" ");
                        Uri uri = Uri.parse(UriText);
                        intent5.setData(uri);
                        startActivity(Intent.createChooser(intent5, "send email"));
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.help:
                        /**   String number = "0960628000";
                         Intent intent6 = new Intent(Intent.ACTION_CALL);
                         intent6.setData(Uri.parse("tel:" + number));
                         if (ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                         startActivity(intent6);
                         Log.i("MENU DRAWER TAG", "HELP item is clicked"); **/
                        Intent intent6 = new Intent(MainActivity.this, Help.class);
                        startActivity(intent6);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.share:
                        Intent intent7 = new Intent(Intent.ACTION_SEND);
                        intent7.setType("text/plain");
                        intent7.putExtra(Intent.EXTRA_SUBJECT, "WSU Android App");
                        startActivity(Intent.createChooser(intent7, "Share with"));
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.about_app:
                        Intent intent8 = new Intent(MainActivity.this, AboutActivity.class);
                        startActivity(intent8);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.facebook:
                        Intent intent9 = new Intent(Intent.ACTION_VIEW);
                        intent9.setData(Uri.parse("https://www.facebook.com/Wolaita-Sodo-University-246568056057804"));
                        startActivity(intent9);
                        break;

                    case R.id.telegram:
                        Intent intent10 = new Intent(Intent.ACTION_VIEW);
                        intent10.setData(Uri.parse("https://t.me/WolaitaSUniversity"));
                        startActivity(intent10);
                        break;

                    case R.id.twitter:
                        Intent intent11 = new Intent(Intent.ACTION_VIEW);
                        intent11.setData(Uri.parse("https://twitter.com/WSodoUniversity"));
                        startActivity(intent11);
                        break;

                    case R.id.linkedin:
                        Intent intent12 = new Intent(Intent.ACTION_VIEW);
                        intent12.setData(Uri.parse("https://www.linkedin.com/company/wolaita-sodo-university/"));
                        startActivity(intent12);
                        break;

                    case R.id.youtube:
                        Intent intent13 = new Intent(Intent.ACTION_VIEW);
                        intent13.setData(Uri.parse("https://www.youtube.com/channel/UC6VukdZbl5iVgZGXG8BkMdw"));
                        startActivity(intent13);
                        break;
                }
                return true;
            }

        });
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);

        tabLayout.addTab(tabLayout.newTab().setText("Academics"));
        tabLayout.addTab(tabLayout.newTab().setText("Services"));
        tabLayout.addTab(tabLayout.newTab().setText("Tools"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final MyAdapter adapter = new MyAdapter(getSupportFragmentManager(),this,tabLayout.getTabCount());
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        updateNavHeader();
    }

    private void updateNavHeader() {
        NavigationView navigationView = (NavigationView) findViewById(R.id.navigationView);
        View headerView = navigationView.getHeaderView(0);
        TextView textUserName = (TextView) headerView.findViewById(R.id.text_user_name);
        TextView textEmailAddress = (TextView) headerView.findViewById(R.id.text_email_address);
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
        String userName = pref.getString("user_display_name", "");
        String emailAddress = pref.getString("user_email_address", "");

        textUserName.setText(userName);
        textEmailAddress.setText(emailAddress);

    }
}