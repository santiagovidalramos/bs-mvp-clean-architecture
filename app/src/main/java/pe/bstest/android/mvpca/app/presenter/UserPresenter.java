package pe.bstest.android.mvpca.app.presenter;

import java.util.ArrayList;
import java.util.List;

import pe.bstest.android.mvpca.app.model.UserModel;
import pe.bstest.android.mvpca.app.view.BaseView;
import pe.bstest.android.mvpca.app.view.UserView;
import pe.bstest.android.mvpca.domain.usecase.GetUserUseCase;
import pe.bstest.android.mvpca.entity.User;
import pe.bstest.android.mvpca.repository.UserRepository;

public class UserPresenter extends BasePresenter implements GetUserUseCase.Callback {
    UserView view;
    GetUserUseCase getUserUseCase;
    private List<User> users;
    private List<UserModel> userModels;

    public UserPresenter(UserView view) {
        super(view);
    }

    public UserPresenter(BaseView view) {
        super(view);
    }
    public void mostrarUsuario() {
        getUserUseCase = new GetUserUseCase();
        getUserUseCase.setCallback(this);
        getUserUseCase.setGateway(new UserRepository());
        convertUserToModel();
        view.mostrarUsuarios(userModels);
    }

    private void convertUserToModel() {
        userModels = new ArrayList<>();
        //convertir entidad usuario a modelo
    }

    @Override
    public void doneGettingUser(List<User> users) {
        this.users=users;
    }
}
