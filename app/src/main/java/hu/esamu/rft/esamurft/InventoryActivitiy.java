package hu.esamu.rft.esamurft;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class InventoryActivitiy extends AppCompatActivity {
    GridView gridView;
    private Camera camera;
    private ArrayList<Item> items;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        items = new ArrayList<Item>();
        items.add(new Item("Wood",1, "ic_launcher"));
        items.add(new Item("Stone",2, "ic_launcher"));
        items.add(new Item("Asd",6, "ic_launcher"));
        items.add(new Item("Asd2",3, "ic_launcher"));
        items.add(new Item("Asd3",2, "ic_launcher"));
        items.add(new Item("Asd4",10, "ic_launcher"));
        items.add(new Item("Asd5",20, "ic_launcher"));
        items.add(new Item("Asd6",22, "ic_launcher"));
        items.add(new Item("Asd7",5, "ic_launcher"));
        items.add(new Item("Asd8",2, "ic_launcher"));
        items.add(new Item("Asd9",7, "ic_launcher"));
        items.add(new Item("Asd10",55, "ic_launcher"));

        camera = new Camera(getApplicationContext(),InventoryActivitiy.this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);

        gridView = (GridView) findViewById(R.id.gridView1);

        gridView.setAdapter(new ItemAdapter(this, items));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(
                        getApplicationContext(),
                        items.get(position).getName(), Toast.LENGTH_SHORT).show();

            }
        });

    }

    public void toMap(View v) {
        Intent intent = new Intent(InventoryActivitiy.this, MapsActivity.class);
        startActivity(intent);
        finish();
    }

    public void toBase(View v) {
        Intent intent = new Intent(InventoryActivitiy.this, ControlActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }

    public void toCamera(View v) {
        camera.dispatchTakePictureIntent();
    }

    public void toQuest(View v) {
        Intent intent = new Intent(InventoryActivitiy.this, ItemListActivity.class);
        startActivity(intent);
        finish();
    }

    public void toCraft(View v) {
    }

}
