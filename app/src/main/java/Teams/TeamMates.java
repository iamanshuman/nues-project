package Teams;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.MSI.R;
import com.example.MSI.SlidePagerAdapter;

import java.util.ArrayList;
import java.util.List;


public class TeamMates extends AppCompatActivity {


   private ViewPager pager;
   private PagerAdapter pagerAdapter;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.team_mates);


       List<Fragment> list = new ArrayList<>();
       list.add(new PageFragment1());
       list.add(new PageFragment2());


       pager = findViewById(R.id.pager);
       pagerAdapter = new SlidePagerAdapter(getSupportFragmentManager(),list);
       pager.setAdapter(pagerAdapter);

   }
}