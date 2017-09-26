package info.firozansari.viewsamples.fragments;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import info.firozansari.viewsamples.helper.Beanclass;
import info.firozansari.viewsamples.helper.JayBaseAdapter;
import info.firozansari.viewsamples.R;

/**
 * Created by firoz on 02/04/2017.
 */

public class TabFragment6 extends Fragment {

    private  View view;

    private ListView listview;

    Typeface fonts1,fonts2;

    private int[] IMAGE = {R.drawable.box, R.drawable.ball, R.drawable.bag,
            R.drawable.box, R.drawable.ball};

    private String[] TITLE = {"Teak & Steel Petanque Set", "Lemon Peel Baseball", "Seil Marschall Hiking Pack", "Teak & Steel Petanque Set", "Lemon Peel Baseball"};

    private String[] DESCRIPTION = {"One Size", "One Size", "Size L", "One Size", "One Size"};

    private String[] DATE = {"$ 220.00","$ 49.00","$ 320.00","$ 220.00","$ 49.00"};

    private ArrayList<Beanclass> Bean;
    private JayBaseAdapter baseAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragmenttab6, container, false);


        listview = (ListView) view.findViewById(R.id.listview);


        Bean = new ArrayList<Beanclass>();

        for (int i = 0; i < TITLE.length; i++) {

            Beanclass bean = new Beanclass(IMAGE[i], TITLE[i], DESCRIPTION[i], DATE[i]);
            Bean.add(bean);

        }


        baseAdapter = new JayBaseAdapter(getActivity(), Bean) {
        };

        listview.setAdapter(baseAdapter);


//
//        fonts1 =  Typeface.createFromAsset(TabFragment3.this.getAssets(),
//                "fonts/Lato-Light.ttf");
//
//
//
//        fonts2 =  Typeface.createFromAsset(TabFragment3.this.getAssets(),
//                "fonts/Lato-Regular.ttf");
//
//
//
//
//        TextView t4 =(TextView)findViewById(R.id.shopping);
//        t4.setTypeface(fonts2);
//        TextView t5 =(TextView)findViewById(R.id.pay);
//        t5.setTypeface(fonts1);


        return view;


    }
}