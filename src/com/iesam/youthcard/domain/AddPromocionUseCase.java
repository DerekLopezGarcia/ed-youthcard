package com.iesam.youthcard.domain;

public class AddPromocionUseCase {
    public static void execute(Promocion promocion){
            this.repository.addPromocion(promocion);
    }
    private PromocionRepository repository;
    public AddPromocionUseCase(PromocionRepository repository){
        this.repository = repository;
    }
}
