package com.iesam.youthcard.data;

import com.iesam.youthcard.data.local.UsuarioFileLocalDataSource;
import com.iesam.youthcard.domain.Usuario;
import com.iesam.youthcard.domain.UsuarioRepository;

public class UsuarioDataRepository implements UsuarioRepository {
    @Override
    public void addUsuario(Usuario usuario) {
        this.localDataSource.save(usuario);
    }
    private UsuarioFileLocalDataSource localDataSource;

    public UsuarioDataRepository(UsuarioFileLocalDataSource localDataSource) {
        this.localDataSource = localDataSource;
    }
}
