package pe.bstest.android.mvpca.app.view.activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import pe.bstest.android.mvpca.app.presenter.BasePresenter;
import pe.bstest.android.mvpca.app.view.BaseView;

public class BaseActivity  extends AppCompatActivity implements BaseView {
    BasePresenter presenter;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = new BasePresenter(this);
        presenter.iniciar();
    }


    @Override
    public void showloading(String message) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LOCKED);
        progressDialog = new ProgressDialog(this);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage(message);
        progressDialog.setCancelable(false);
        progressDialog.show();
    }

    @Override
    public void hideloading() {
        progressDialog.dismiss();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED);
    }

    @Override
    public void showError(String message) {
        //UtilitarioApp.mostrarToast(this, message, ToastCustom.TYPE_ERROR);
    }

    @Override
    public void showCorrect(String message) {
        //UtilitarioApp.mostrarToast(this, message, ToastCustom.TYPE_CORRECTO);
    }

    @Override
    public void showInfo(String message) {
        //UtilitarioApp.mostrarToast(this, message, ToastCustom.TYPE_INFO);
    }

    @Override
    public void finalizar() {
        finish();
    }

    @Override
    public Context getContext() {
        return getApplicationContext();
    }
}
