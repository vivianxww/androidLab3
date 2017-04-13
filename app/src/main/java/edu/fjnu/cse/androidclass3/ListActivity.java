package edu.fjnu.cse.androidclass3;

/**
 * Created by 14334 on 2017/4/1.
 */
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Created by Administrator on 2017/3/14 0014.
 */

public class ListActivity extends Activity {

    private ListView lv_one;
    private String[] name=new String[]{"lion","cat","dog","monkey","elephant","tiger"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one);

        lv_one= (ListView) findViewById(R.id.LV_one);
        List<Map<String,Object>> data=new ArrayList<>();



        Map<String,Object> map1=new HashMap<>();
        map1.put("lv_name","Lion");
        map1.put("lv_image",R.drawable.lion);


        Map<String,Object> map2=new HashMap<>();
        map2.put("lv_name","cat");
        map2.put("lv_image",R.drawable.cat);

        Map<String,Object> map3=new HashMap<>();
        map3.put("lv_name","dog");
        map3.put("lv_image",R.drawable.dog);

        Map<String,Object> map4=new HashMap<>();
        map4.put("lv_name","monkey");
        map4.put("lv_image",R.drawable.monkey);


        Map<String,Object> map5=new HashMap<>();
        map5.put("lv_name","elephant");
        map5.put("lv_image",R.drawable.elephant);

        Map<String,Object> map6=new HashMap<>();
        map6.put("lv_name","tiger");
        map6.put("lv_image",R.drawable.tiger);

        data.add(map1);
        data.add(map2);
        data.add(map3);
        data.add(map4);
        data.add(map5);
        data.add(map6);


        SimpleAdapter simpleAdapter=new SimpleAdapter
                (ListActivity.this,data,R.layout.lv_child,new String[]{"lv_name","lv_image"},new int[]{R.id.LV_name,R.id.LV_image});

        lv_one.setAdapter(simpleAdapter);


        lv_one.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListActivity.this,name[i],Toast.LENGTH_SHORT).show();
                view.setBackgroundColor(Color.RED);
            }
        });








    }
}
