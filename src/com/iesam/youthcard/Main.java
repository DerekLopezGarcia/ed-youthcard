package com.iesam.youthcard;

import com.iesam.youthcard.domain.AddPromocionUseCase;
import com.iesam.youthcard.domain.AddUsuarioUseCase;
import com.iesam.youthcard.domain.Compra;
import com.iesam.youthcard.domain.Empresa;
import com.iesam.youthcard.domain.ListPromocionUseCase;
import com.iesam.youthcard.domain.Promocion;
import com.iesam.youthcard.domain.Usuario;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main (String[] args){
        Empresa empresa = new Empresa();
        empresa.setId(1);
        empresa.setCid("128318f");
        empresa.setNombre("Azul");

        Usuario usuario = new Usuario();
        usuario.setNif("11213");
        usuario.setNombre("manolo");
        usuario.setApellidos("lama");
        usuario.setDireccion("su Casa");
        AddUsuarioUseCase.execute(usuario);

        Promocion promocion = new Promocion();
        promocion.setId(1);
        promocion.setDescripcion("asda");
        promocion.setDescuento("10");
        promocion.setTitulo("AAAAAA");
        AddPromocionUseCase.execute(promocion);
       ArrayList<Promocion> listaPromociones = ListPromocionUseCase.execute();
        for (Promocion p:listaPromociones) {
            System.out.println(p);
        }
        Compra compra = new Compra();
        compra.setId(1);
        compra.setFecha(new Date());
        compra.setPromocion(promocion);
        compra.setUsuario(usuario);
    }
}