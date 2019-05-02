package pe.bstest.android.mvpca.app.presenter;

import pe.bstest.android.mvpca.app.view.BaseView;

public class BasePresenter {
    final BaseView view;

    public BasePresenter(BaseView view) {
        this.view = view;
    }

    public void iniciar() {
        validarTelefonoTieneLicencia();
    }

    private void validarTelefonoTieneLicencia() {
        //do nothing
    }
}
