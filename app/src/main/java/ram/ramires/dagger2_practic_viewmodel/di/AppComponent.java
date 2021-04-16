package ram.ramires.dagger2_practic_viewmodel.di;

import android.app.Application;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import ram.ramires.dagger2_practic_viewmodel.MainActivity;
import ram.ramires.dagger2_practic_viewmodel.SecondActivity;

@Component(modules = {ViewModelModule.class})
@Singleton
public interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder withApplication(Application application);

        AppComponent build();
    }
/*
    void inject(MainActivity activity);
    void inject(SecondActivity activity);
    */
    DemoViewModelFactory getViewModelFactory();
}