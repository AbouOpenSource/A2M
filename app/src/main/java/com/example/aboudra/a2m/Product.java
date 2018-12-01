package com.example.aboudra.a2m;

import java.util.Date;

public class Product {
    private TypeProduct type;
    private String id ;
    private String stock;
    private String user_id;
    private Date datePublie;

    public Product(TypeProduct type, String id, String stock, String user_id, Date datePublie) {
        this.type = type;
        this.id = id;
        this.stock = stock;
        this.user_id = user_id;
        this.datePublie = datePublie;
    }

    public Product(TypeProduct type, String stock, String user_id, Date datePublie) {
        this.type = type;
        this.stock = stock;
        this.user_id = user_id;
        this.datePublie = datePublie;
    }

    public TypeProduct getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public String getStock() {
        return stock;
    }

    public String getUser_id() {
        return user_id;
    }

    public Date getDatePublie() {
        return datePublie;
    }
}
