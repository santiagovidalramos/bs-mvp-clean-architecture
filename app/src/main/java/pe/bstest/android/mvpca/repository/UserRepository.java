package pe.bstest.android.mvpca.repository;

import java.util.List;

import pe.bstest.android.mvpca.entity.User;
import pe.bstest.android.mvpca.entity.UserGateway;

public class UserRepository implements UserGateway {
    @Override
    public List<User> listAll() {
        //Leer los dao ya sea usando sqlite, sugar o la implementacion de google usando rom
        return null;
    }
}
