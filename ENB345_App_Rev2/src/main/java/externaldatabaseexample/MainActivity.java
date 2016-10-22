package externaldatabaseexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.nordicsemi.nrfUARTv2.R;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket);

        this.listView = (ListView) findViewById(android.R.id.list);
        DatabaseAccess databaseAccess = DatabaseAccess.getInstance(this);
        databaseAccess.open();
        List<String> Products = databaseAccess.getName();
        databaseAccess.close();



        //Cursor cursor = databaseAccess.database.rawQuery("INSERT INTO products (id, name, cost, weight) VALUES (100000,"+text+",200,23.9)", null);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Products);
        this.listView.setAdapter(adapter);
    }
}
