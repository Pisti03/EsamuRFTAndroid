package hu.esamu.rft.esamurft;


import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class InventoryFragment extends Fragment {
    GridView gridView;
    private ArrayList<Item> items;

    public InventoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        items = new ArrayList<Item>();
        items.add(new Item(1, "Wood",1, "ic_launcher"));
        items.add(new Item(2, "Stone",2, "ic_launcher"));
        items.add(new Item(3, "Asd",6, "ic_launcher"));
        items.add(new Item(4, "Asd2",3, "ic_launcher"));
        items.add(new Item(5, "Asd3",2, "ic_launcher"));
        items.add(new Item(6, "Asd4",10, "ic_launcher"));
        items.add(new Item(7, "Asd5",20, "ic_launcher"));
        items.add(new Item(8, "Asd6",22, "ic_launcher"));
        items.add(new Item(9, "Asd7",5, "ic_launcher"));
        items.add(new Item(10, "Asd8",2, "ic_launcher"));
        items.add(new Item(11, "Asd9",7, "ic_launcher"));
        items.add(new Item(12, "Asd10",55, "ic_launcher"));

        //super.onCreate(savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_inventory, container, false);
        gridView = (GridView) view.findViewById(R.id.gridView1);

        gridView.setAdapter(new ItemAdapter(getActivity(), items));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(
                        getActivity().getApplicationContext(),
                        items.get(position).getName(), Toast.LENGTH_SHORT).show();

            }
        });
        return view;
    }

}
