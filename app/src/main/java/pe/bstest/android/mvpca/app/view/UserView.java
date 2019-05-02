package pe.bstest.android.mvpca.app.view;

import java.util.List;

import pe.bstest.android.mvpca.app.model.UserModel;

public interface UserView extends BaseView{

    void irMenu();
    void mostrarUsuarios(List<UserModel> usuarios);
}
