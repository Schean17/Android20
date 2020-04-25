package edu.fjnu.simplelistview;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.List;

public class AnimalAdapter  extends ArrayAdapter {
    private  final int resourseId;
    public AnimalAdapter(Context context, int textViewResourceId, List<Animal> objects) {
        super(context, textViewResourceId, objects);
        resourseId = textViewResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Animal animal = (Animal) getItem(position); // 获取当前项的Fruit实例
        View view = LayoutInflater.from(getContext()).inflate(resourseId, null);//实例化一个对象
        ImageView animalImage = (ImageView) view.findViewById(R.id.head);//获取该布局内的图片视图
        TextView animalName = (TextView) view.findViewById(R.id.name);//获取该布局内的文本视图
        animalImage.setImageResource(animal.getImageId());//为图片视图设置图片资源
        animalName.setText(animal.getName());//为文本视图设置文本内容
        return view;
    }

}
