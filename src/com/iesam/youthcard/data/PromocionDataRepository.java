package com.iesam.youthcard.data;

import com.iesam.youthcard.data.local.PromocionFileLocalDataSource;
import com.iesam.youthcard.domain.Promocion;
import com.iesam.youthcard.domain.PromocionRepository;

import java.util.ArrayList;

public class PromocionDataRepository implements PromocionRepository {
    @Override
    public void addPromocion(Promocion promocion) {
        this.localDataSource.save(promocion);
    }

    @Override
    public ArrayList<Promocion> getPromocion() {
        return (ArrayList<Promocion>) this.localDataSource.findAll();
    }
    private PromocionFileLocalDataSource localDataSource;

    public PromocionDataRepository(PromocionFileLocalDataSource localDataSource) {
        this.localDataSource = localDataSource;
    }
}
