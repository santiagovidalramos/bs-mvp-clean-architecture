package pe.bstest.android.mvpca.domain.usecase;

import java.util.List;

import pe.bstest.android.mvpca.entity.User;
import pe.bstest.android.mvpca.entity.UserGateway;

public class GetUserUseCase {

    private UserGateway gateway;
    private Callback callback;

    public void setGateway(UserGateway gateway){
        this.gateway=gateway;
    }

    public void setCallback(Callback callback){
        this.callback=callback;
    }

    public void execute (){
        List<User> users = gateway.listAll();
        callback.doneGettingUser(users);
    }
    public interface Callback{
        void doneGettingUser(List<User> users);
    }
}
