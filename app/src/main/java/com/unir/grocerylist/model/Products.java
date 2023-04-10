package com.unir.grocerylist.model;

public class Products {

    private Integer id;

    private String productName;
    private String productQtd;
    private String productValor;
    private String productDescricao;

    public Products() {
    }

    public Products(Integer id, String productName, String productQtd, String productValor, String productCategoria) {
        this.id = id;
        this.productName = productName;
        this.productQtd = productQtd;
        this.productValor = productValor;
        this.productDescricao = productCategoria;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductQtd() {
        return productQtd;
    }

    public void setProductQtd(String productQtd) {
        this.productQtd = productQtd;
    }

    public String getProductValor() {
        return productValor;
    }

    public void setProductValor(String productValor) {
        this.productValor = productValor;
    }

    public String getProductDescricao() {
        return productDescricao;
    }

    public void setProductDescricao(String productDescricao) {
        this.productDescricao = productDescricao;
    }
}
