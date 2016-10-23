package com.nordicsemi.nrfUARTv2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

//import static com.nordicsemi.nrfUARTv2.R.id.basketList;

public class BasketActivity extends Activity {

    public static String[] Test = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6", "Item 7", "Item 8", "Item 9", "Item 10", "Item 11", "Item 12", "Item 13", "Item 14", "Item 15", "Item 16"};

    public static String[] Test2 = new String[20];

//    Test2[0] = "Item 1";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket);

//        ArrayAdapter adapterToBuyPrice = new ArrayAdapter<String>(this, R.layout.listitem_items, Test);
//        ListView listViewToBuyPrice = (ListView) findViewById(R.id.basketList);
//        listViewToBuyPrice.setAdapter(adapterToBuyPrice);

        updateList();
    }


//    public static void updateList() {
//        ArrayAdapter adapterToBuyPrice = new ArrayAdapter<String>(this, R.layout.listitem_items, Test);
//        ListView listViewToBuyPrice = (ListView) rootView.findViewById(R.id.basketList);
//        //ListView listViewToBuyPrice = (ListView) findViewById(R.id.basketList);
//        listViewToBuyPrice.setAdapter(adapterToBuyPrice);
//      //  listViewToBuyPrice.
//    }
    public void updateList() {
        ArrayAdapter adapterToBuyPrice = new ArrayAdapter<String>(this, R.layout.listitem_items, Test);
        ListView listViewToBuyPrice = (ListView) findViewById(R.id.basketList);
        listViewToBuyPrice.setAdapter(adapterToBuyPrice);

       // adapterToBuyPrice.notifyDataSetChanged();
    }

}
