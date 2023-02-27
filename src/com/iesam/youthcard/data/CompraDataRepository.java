package com.iesam.youthcard.data;

import com.iesam.youthcard.data.local.CompraFileLocalDataSource;
import com.iesam.youthcard.domain.Compra;
import com.iesam.youthcard.domain.CompraRepository;

public class CompraDataRepository implements CompraRepository {

    @Override
    public void addCompra(Compra compra) {
        this.localDataSource.save(compra);
    }
    private CompraFileLocalDataSource localDataSource;

    public CompraDataRepository(CompraFileLocalDataSource localDataSource) {
        this.localDataSource = localDataSource;
    }
}
