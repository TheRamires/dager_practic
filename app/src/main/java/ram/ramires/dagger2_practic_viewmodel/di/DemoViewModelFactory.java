package ram.ramires.dagger2_practic_viewmodel.di;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import java.util.Map;

import javax.inject.Inject;
import javax.inject.Provider;

public class DemoViewModelFactory implements ViewModelProvider.Factory {
private final Map<Class<? extends ViewModel>,
        Provider<ViewModel>> viewModels;

@Inject
public DemoViewModelFactory(Map<Class<? extends ViewModel>,
        Provider<ViewModel>> viewModels) {
        this.viewModels = viewModels;
        }

@Override
public <T extends ViewModel> T create(Class<T> modelClass) {
        Provider<ViewModel> viewModelProvider = viewModels.get(modelClass);

        if (viewModelProvider == null) {
            throw new IllegalArgumentException("model class "
                    + modelClass
                    + " not found");
        }

        return (T) viewModelProvider.get();
        }
        }