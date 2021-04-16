package ram.ramires.dagger2_practic_viewmodel;

import android.app.Application;

import ram.ramires.dagger2_practic_viewmodel.di.AppComponent;
import ram.ramires.dagger2_practic_viewmodel.di.DaggerAppComponent;

public class App extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent
                .builder()
                .withApplication(this)
                .build();

    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

}