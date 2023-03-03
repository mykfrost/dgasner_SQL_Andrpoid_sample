package com.chinatown254.dgasnersql;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.chinatown254.dgasnersql.model.DataItem;

import java.util.List;

public class DataItemAdapter extends ArrayAdapter<DataItem> {
    List<DataItem> mDataItems;
    LayoutInflater mInflater;
    public DataItemAdapter(@NonNull Context context, @NonNull List<DataItem> objects) {
        super(context, R.layout.list_item, objects);
        mDataItems = objects;
        mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.list_item,parent, false);
        }
        TextView tvName = convertView.findViewById(R.id.itemNameText);
        ImageView imageView = convertView.findViewById(R.id.imageView);

        DataItem item = mDataItems.get(position);
        tvName.setText(item.getItemName());
        imageView.setImageResource(R.drawable.apple_pie);
        return convertView;
    }
}
