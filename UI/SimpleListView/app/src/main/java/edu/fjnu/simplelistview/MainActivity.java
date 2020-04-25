package edu.fjnu.simplelistview;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MainActivity extends Activity {
    private String [] name ={"Cat","Dog","Elephant","Lion","Monkey","Tiger"};
    private String [] desc= {"Cat","Dog","Elephant","Lion","Monkey","Tiger"};
    private int[] imageID={R.drawable.cat,R.drawable.dog,R.drawable.elephant,R.drawable.lion,R.drawable.monkey,R.drawable.tiger};
    private ListView list_view;
    String tag="MyActivity.class";
    private List<Animal> animalList=new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       List<Map<String,Object>> listems=new ArrayList<Map<String,Object>>();
       for(int i=0;i<name.length;i++){
           Map<String,Object> listem=new HashMap<String,Object>();
           listem.put("head",imageID[i]);
           listem.put("name",name[i]);
           listem.put("desc",desc[i]);
           listems.add(listem);
       }
        SimpleAdapter simplead =new SimpleAdapter(this,listems,R.layout.animal,new String[]{"name","head","desc" },new int[]{R.id.name,R.id.head,R.id.desc});
       list_view= (ListView) findViewById(R.id.list_view);
       list_view.setAdapter(simplead);
       list_view.setSelector(R.color.colorAccent);
       list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Log.d(tag,"点击了！");
               TextView tv_name= (TextView) view.findViewById(R.id.name);
               Toast.makeText(MainActivity.this, tv_name.getText(), Toast.LENGTH_SHORT).show();
           }
       });

    }




}