package com.chinatown254.dgasnersql;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.chinatown254.dgasnersql.model.DataItem;
import com.chinatown254.dgasnersql.sample.SampleDataProvider;

import java.util.List;

public class MainActivity extends AppCompatActivity {
TextView tv;
List<DataItem> dataItemList = SampleDataProvider.dataItemList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataItem item = new DataItem(null,"my menu item", "a category",
                "a description",1,99.5,"apple_pie.jpg");
        tv =  findViewById(R.id.tvout);
        tv.setText(item.toString());
    }
}