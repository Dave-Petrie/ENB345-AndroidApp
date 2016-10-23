package com.nordicsemi.nrfUARTv2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.text.NumberFormat;

public class BasketActivity extends Activity {

    // Empty array to fill with
    public static String[] Test = {"List not live - press back to refresh","", "", "", "", "", "", "", "", "", "", "", "", "", "", "","", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    public static double[] Price = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

    public static String[] ItemList = { "Toiletten Papier                    $2.10",
                                        "Ritter Sport                        $0.99",
                                        "Bier Flasche                         $4.80",
                                        "Kaese                                    $7.00",
                                        "Wodka                                   $7.00",
                                        "Gluehwein                            $8.20",
                                        "Milch                                     $2.00",
                                        "Cola                                       $3.06",
                                        "Bleistift                                 $1.00"};

    public static double[] PriceList = {2.10,0.99,4.80,7.00,7.00,8.20,2.00,3.06,1.00};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket);
        updateList();
    }

    public void addElement(String data, int index) {
        int myNum = 0;
        try {
            myNum = Integer.parseInt(data);
        } catch(NumberFormatException nfe) {
            Log.d("nRFUART", "addElement() didn't pass");
        }
        BasketActivity.Test[index] = ItemList[myNum + 1];
        BasketActivity.Price[index] = PriceList[myNum + 1];
        updateList();
    }
    public void updateList() {

        ArrayAdapter adapterToBuyPrice = new ArrayAdapter<String>(this, R.layout.listitem_items, Test);
        ListView listViewToBuyPrice = (ListView) findViewById(R.id.basketList);
        listViewToBuyPrice.setAdapter(adapterToBuyPrice);
        double total = 0;
        for (int i = 0;i < Price.length; i++) {
            total = total + Price[i];
        }
        TextView price_text = (TextView)findViewById(R.id.total);
        NumberFormat nm = NumberFormat.getNumberInstance();
        price_text.setText(nm.format(total));
    }
}
