package ram.ramires.dagger2_practic_viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import javax.inject.Inject;

public class UserViewModel extends ViewModel {
    MutableLiveData<String> liveData=new MutableLiveData<>();
    private UserFacade userFacade;

    @Inject
    public UserViewModel(UserFacade userFacade) {
        this.userFacade = userFacade;
    }

    public void put(String message){
        userFacade.put(message, liveData);
    }
    public void get(){
        userFacade.get(liveData);
    }
    //methods
}
