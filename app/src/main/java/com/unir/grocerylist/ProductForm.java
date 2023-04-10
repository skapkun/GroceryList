package com.unir.grocerylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.unir.grocerylist.model.Products;

import java.util.List;

public class ProductForm extends AppCompatActivity  {

    ProductHelper helper;
    MainActivity mainActivity;

    Integer id;
    EditText nome;
    EditText qtd;
    EditText valor;
    EditText descricao;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_form);
        mainActivity = new MainActivity ();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_formulario, menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)  {
        switch (item.getItemId()) {
            case R.id.menu_formulario_ok:
                nome = (EditText) findViewById (R.id.edtNome);
                qtd = (EditText)  findViewById(R.id.edtQtd);
                descricao = (EditText)  findViewById(R.id.edtDescricao);
                valor = (EditText)  findViewById(R.id.edtValor);
                spinner = (Spinner)  findViewById(R.id.spinnerMedidas);
                Products prod = new Products ();

                prod.setProductName(nome.getText().toString());
                prod.setProductQtd(qtd.getText().toString());
                prod.setProductValor(valor.getText().toString());
                prod.setProductDescricao(descricao.getText().toString());

                SharedPreferences prefs =  getSharedPreferences("chaveGeral", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = prefs.edit();
                editor.putString("chaveNome", nome.getText().toString());
                editor.putString("chaveQtd", qtd.getText().toString());
                editor.putString("chaveValor", valor.getText().toString());
                editor.commit();

                mainActivity.insereLista(prod);
                 Toast.makeText(ProductForm.this, "Produto " + prod.getProductName() + " salvo!", Toast.LENGTH_SHORT).show();

                finish();
                break;
        }

        return super.onOptionsItemSelected(item);
    }


}

