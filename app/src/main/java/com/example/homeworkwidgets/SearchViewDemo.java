package com.example.homeworkwidgets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class SearchViewDemo extends AppCompatActivity {
    SearchView search;
    ListView listv;
    ArrayList<String> list;
    ArrayAdapter<String > adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_view_demo);
        search = findViewById(R.id.searchView);
        listv = findViewById(R.id.lv1);

        list = new ArrayList<>();
        list.add("Brock Lesnar");
        list.add("Roman Reigns");
        list.add("The UnderTaker");
        list.add("Braun Strowman");
        list.add("Elijah Mikaelson");
        list.add("Harvey Spectre");
        list.add("Mike Ross");
        list.add("Donna Paulsen");
        list.add("Louis Litt");
        list.add("Jessica Pearson");

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,list);
        listv.setAdapter(adapter);

        search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                if(list.contains(query)){
                    adapter.getFilter().filter(query);
                }else{
                    Toast.makeText(SearchViewDemo.this, "No Match found",Toast.LENGTH_LONG).show();
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                //    adapter.getFilter().filter(newText);
                return false;
            }
        });
    }
}
