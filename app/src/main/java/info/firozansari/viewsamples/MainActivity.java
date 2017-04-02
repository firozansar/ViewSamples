package info.firozansari.viewsamples;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by firoz on 02/04/2017.
 */

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    CustomAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Demo> demos = new ArrayList<>();
        demos.add(new Demo(this, CategoryActivity.class, R.string.ecommerce));
        demos.add(new Demo(this, CheckoutActivity.class, R.string.checkout));
        demos.add(new Demo(this, DashboardActivity.class, R.string.dashboard));
        //demos.add(new Demo(this, FillInHeartActivity.class, R.string.fill_in_heart));
        //demos.add(new Demo(this, PlayResetActivity.class, R.string.play_to_reset));
        //demos.add(new Demo(this, AnimatedIconActivity.class, R.string.animated_icon));
        //demos.add(new Demo(this, AnimatedMenuActivity.class, R.string.animated_menu));


        recyclerView = (RecyclerView) findViewById(R.id.recycleView);
        adapter = new CustomAdapter(this, demos);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this)); // Vertical Orientation By Default

    }


}
