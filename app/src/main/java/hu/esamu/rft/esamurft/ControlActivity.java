package hu.esamu.rft.esamurft;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class ControlActivity extends AppCompatActivity {

    private Camera camera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        camera = new Camera(getApplicationContext(),ControlActivity.this);
        setContentView(R.layout.activity_control);

        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment asd = new BaseFragment();
        fragmentManager.beginTransaction().add(R.id.main_fragment, asd ).commit();
    }


    public void toMap(View v) {
        this.startActivity(new Intent(this, MapsActivity.class));
    }

    public void toBase(View v) {

    }

    public void toCamera(View v) {
        camera.dispatchTakePictureIntent();
    }

    public void toQuest(View v) {
        this.startActivity(new Intent(this, ItemListActivity.class));
    }

    public void toCraft(View v) {

        FragmentManager fragmentManager= getSupportFragmentManager();
        Fragment asd = new InventoryFragment();
        fragmentManager.beginTransaction().add(R.id.main_fragment, asd ).commit();
    }

}
