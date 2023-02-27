package com.iesam.youthcard.domain;

public class AddUsuarioUseCase {
    public static void execute(Usuario usuario){
        this.repository.addUsuario(usuario);
    }
    private UsuarioRepository repository;
    public AddUsuarioUseCase(UsuarioRepository repository){
        this.repository = repository;
    }
}
