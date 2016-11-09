package hu.esamu.rft.esamurft;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class InventoryActivitiy extends AppCompatActivity {
    GridView gridView;
    private Camera camera;
    static final String[] ITEMS = new String[] {
            "Wood", "Stone", "Asd", "Asd2", "Asd3", "Asd4","Asd5", "Asd6","Asd7", "Asd8", "Asd9", "Asd10"};

    @Override
    public void onCreate(Bundle savedInstanceState) {

        camera = new Camera(getApplicationContext(),InventoryActivitiy.this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);

        gridView = (GridView) findViewById(R.id.gridView1);

        gridView.setAdapter(new ItemAdapter(this, ITEMS));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(
                        getApplicationContext(),
                        ((TextView) v.findViewById(R.id.grid_item_label))
                                .getText(), Toast.LENGTH_SHORT).show();

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
