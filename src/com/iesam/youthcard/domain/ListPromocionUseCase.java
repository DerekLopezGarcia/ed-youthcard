package com.iesam.youthcard.domain;


import java.util.ArrayList;

public class ListPromocionUseCase {
    public static ArrayList<Promocion> execute(){
        return this.repository.getPromocion();
    }
    private PromocionRepository repository;
    public ListPromocionUseCase(PromocionRepository repository){
        this.repository = repository;
    }
}
