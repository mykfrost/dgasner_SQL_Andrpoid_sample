package com.chinatown254.dgasnersql;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.chinatown254.dgasnersql.model.DataItem;
import com.chinatown254.dgasnersql.sample.SampleDataProvider;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends AppCompatActivity {
TextView tv;
List<DataItem> dataItemList = SampleDataProvider.dataItemList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        DataItem item = new DataItem(null,"my menu item", "a category",
//                "a description",1,99.5,"apple_pie.jpg");
        tv =  findViewById(R.id.tvout);
        tv.setText("");

        Collections.sort(dataItemList, new Comparator<DataItem>() {
            @Override
            public int compare(DataItem o1, DataItem o2) {
                return o1.getItemName().compareTo(o2.getItemName());
            }
        });
        for (DataItem item: dataItemList) {
            tv.append(item.getItemName() +"\n");
        }
    }
}