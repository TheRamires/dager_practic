package ram.ramires.dagger2_practic_viewmodel.di;

import androidx.lifecycle.ViewModel;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import ram.ramires.dagger2_practic_viewmodel.UserGroupViewModel;
import ram.ramires.dagger2_practic_viewmodel.UserViewModel;

@Module
public abstract class ViewModelModule {
    @Singleton
    @Binds
    @IntoMap
    @ViewModelKey(UserViewModel.class)
    abstract ViewModel userViewModel(UserViewModel userViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(UserGroupViewModel.class)
    abstract ViewModel groupViewModel(UserGroupViewModel groupViewModel);
}
