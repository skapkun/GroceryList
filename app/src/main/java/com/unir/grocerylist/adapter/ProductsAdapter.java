package com.unir.grocerylist.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.unir.grocerylist.R;
import com.unir.grocerylist.model.Products;

import java.util.List;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ProductsViewHolder>{

    Context context;
    private List<Products> productsList;

    public ProductsAdapter (List<Products> lista){
        this.productsList = lista;
    }

    @NonNull
    @Override
    public ProductsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.products_row_items, parent, false);
        return new ProductsViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductsViewHolder holder, int position) {
        Products prod = productsList.get(position);
        holder.nome.setText(prod.getProductName());
        holder.qtd.setText(prod.getProductQtd());
        holder.valor.setText(prod.getProductValor());
    }

    @Override
    public int getItemCount() {
        return productsList.size();
    }

    public static class ProductsViewHolder extends RecyclerView.ViewHolder{
        TextView nome;
        TextView qtd;
        TextView valor;
        public ProductsViewHolder(@NonNull View itemView) {
            super(itemView);
            nome = itemView.findViewById(R.id.txtNome);
            qtd = itemView.findViewById(R.id.txtMedida);
            valor = itemView.findViewById(R.id.txtValor);
        }
    }


}
