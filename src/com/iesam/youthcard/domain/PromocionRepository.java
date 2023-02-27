package com.iesam.youthcard.domain;

import java.util.ArrayList;

public interface PromocionRepository {
    void addPromocion(Promocion promocion);
    ArrayList<Promocion> getPromocion();
}
