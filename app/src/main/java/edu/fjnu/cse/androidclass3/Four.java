package edu.fjnu.cse.androidclass3;

/**
 * Created by 14334 on 2017/4/1.
 */
import android.app.Activity;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/3/14 0014.
 */

public class Four extends Activity {

    private ListView lv_four;

    private ActionMode.Callback mcallback=new ActionMode.Callback() {
        @Override
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {

            MenuInflater inflater = actionMode.getMenuInflater();
            inflater.inflate(R.menu.menucontext, menu);
            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }

        @Override
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        @Override
        public void onDestroyActionMode(ActionMode actionMode) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.four);
        lv_four= (ListView) findViewById(R.id.lv_four);

        List<Map<String,Object>> data=new ArrayList<>();

        Map<String,Object> map1=new HashMap<>();
        map1.put("four_text","one");
        data.add(map1);

        Map<String,Object> map2=new HashMap<>();
        map2.put("four_text","two");
        data.add(map2);

        Map<String,Object> map3=new HashMap<>();
        map3.put("four_text","three");
        data.add(map3);

        Map<String,Object> map4=new HashMap<>();
        map4.put("four_text","four");
        data.add(map4);

        Map<String,Object> map5=new HashMap<>();
        map5.put("four_text","five");
        data.add(map5);

        Map<String,Object> map6=new HashMap<>();
        map6.put("four_text","six");
        data.add(map6);

        SimpleAdapter simpleAdapter=new SimpleAdapter(this,data,R.layout.four_child,new String[]{"four_text"},new int[]{R.id.four_text});
        lv_four.setAdapter(simpleAdapter);


        lv_four.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                startActionMode(mcallback);
                return false;
            }
        });







    }
}