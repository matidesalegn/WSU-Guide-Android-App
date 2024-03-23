package www.wsu.edu.et;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyAdapter extends FragmentPagerAdapter {
    private final Context context;
    int totalTabs;

    public MyAdapter( FragmentManager fm, Context context, int totalTabs) {
        super(fm);
        this.context = context;
        this.totalTabs = totalTabs;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                AcademicsFragment academicsFragment = new AcademicsFragment();
                return academicsFragment;
            case 1:
                ServicesFragment servicesFragment = new ServicesFragment();
                return servicesFragment;
            case 2:
                ToolsFragment toolsFragment = new ToolsFragment();
                return toolsFragment;
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}
