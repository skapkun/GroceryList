package com.unir.grocerylist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.unir.grocerylist.adapter.ProductsAdapter;
import com.unir.grocerylist.model.Products;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView listaDeProdutos;
    private Button novoProduto;
    private List<Products> productLista = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaDeProdutos = findViewById(R.id.listaDeProdutos);
        this.criaProdutos();
        ProductsAdapter adapter = new ProductsAdapter(productLista);


    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
    listaDeProdutos.setLayoutManager(layoutManager);
    listaDeProdutos.setHasFixedSize(true);
    listaDeProdutos.setAdapter(adapter);


        novoProduto = (Button) findViewById(R.id.btn_novoProduto);
        novoProduto.setOnClickListener((v) -> {
            Intent intentVaiProFormulario = new Intent(MainActivity.this,  ProductForm.class);
            startActivity(intentVaiProFormulario);
        });
    }
    public void criaProdutos(){
        Products product  = new Products(null, "nome", "5", "R$100,00", "Frios");
        this.productLista.add(product);

    }
    public void insereLista(Products prod){
        this.productLista.add(prod);
    }

}