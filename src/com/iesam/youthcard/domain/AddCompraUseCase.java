package com.iesam.youthcard.domain;

public class AddCompraUseCase {
    public void execute(Compra compra){
        this.repository.addCompra(compra);
    }
    private CompraRepository repository;
    public AddCompraUseCase(CompraRepository repository){
        this.repository = repository;
    }
}
