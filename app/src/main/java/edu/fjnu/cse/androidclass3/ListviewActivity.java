package edu.fjnu.cse.androidclass3;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.Toast;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by 14334 on 2017/3/28.
 */
public class ListviewActivity extends Activity {
    private List<Animal> mData = null;
    private Context mContext;
    private AnimalAdapter mAdapter = null;
    private android.widget.ListView list_animal;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        mContext = ListviewActivity.this;
        list_animal = (android.widget.ListView) findViewById(R.id.list_animal);
        mData = new LinkedList<Animal>();
        mData.add(new Animal("狮说", "你是狮么?", R.drawable.lion));
        mData.add(new Animal("虎说", "你是虎么?", R.drawable.tiger));
        mData.add(new Animal("猴说", "你是猴么?", R.drawable.monkey));
        mData.add(new Animal("狗说", "你是狗么?", R.drawable.dog));
        mData.add(new Animal("猫说", "你是猫么?", R.drawable.cat));
        mData.add(new Animal("象说", "你是象么?", R.drawable.elephant));
        mAdapter = new AnimalAdapter((LinkedList<Animal>) mData, mContext);
        list_animal.setAdapter((ListAdapter) mAdapter);
    }


}
