package hu.esamu.rft.esamurft;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ControlActivity extends AppCompatActivity {

    private Camera camera;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        camera = new Camera(getApplicationContext(),ControlActivity.this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control);
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
        Toast.makeText(this, "TODO", Toast.LENGTH_SHORT).show();
    }
}
