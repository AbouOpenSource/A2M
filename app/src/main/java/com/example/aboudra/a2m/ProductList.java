package com.example.aboudra.a2m;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

public class ProductList extends ArrayAdapter
{
    private Activity context;
    private List<Product> products;

    public ProductList(Activity context, List<Product> products) {
        super(context, R.layout.activity_liste_produit);
        this.context = context;
        this.products = products;
    }


    @Nullable
    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        LayoutInflater inflater =context.getLayoutInflater();

        View listViewProduct=inflater.inflate(R.layout.activity_liste_produit,null,true);

        return super.getView(position, convertView, parent);
    }
}
