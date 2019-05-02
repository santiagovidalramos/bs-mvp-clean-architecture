package pe.bstest.android.mvpca.app.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.List;

import pe.bstest.android.mvpca.R;
import pe.bstest.android.mvpca.app.model.UserModel;
import pe.bstest.android.mvpca.app.presenter.UserPresenter;
import pe.bstest.android.mvpca.app.view.UserView;

public class UserActivity extends BaseActivity implements UserView {
    Button btnBuscar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracking);
        btnBuscar= findViewById(R.id.btnBuscar);
        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((UserPresenter)presenter).mostrarUsuario();
            }
        });

        presenter = new UserPresenter(this);
        presenter.iniciar();

        //agregar un b

    }
    @Override
    public void irMenu() {
        Intent loIntent = new Intent(this, MenuActivity.class);
        loIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        finish();
        startActivity(loIntent);
    }

    @Override
    public void mostrarUsuarios(List<UserModel> usuarios) {
        //llenar el recycler view con los usuarios
    }

}
