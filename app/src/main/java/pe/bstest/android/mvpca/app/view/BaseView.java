package pe.bstest.android.mvpca.app.view;

import android.content.Context;
import android.content.Intent;

public interface BaseView {
    Intent getIntent();
    void showloading(String message);
    void hideloading();
    void showError(String message);
    void showCorrect(String message);
    void showInfo(String message);
    void finalizar();
    Context getContext();
}
