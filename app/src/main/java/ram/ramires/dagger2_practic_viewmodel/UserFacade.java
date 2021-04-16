package ram.ramires.dagger2_practic_viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

public class UserFacade {
    @Inject
    public UserFacade(){
    }

    public void put(String message, MutableLiveData<String> liveData){
        liveData.setValue(message);
        System.out.println("UserViewModel put: "+message);
    }
    public void get(LiveData<String> liveData){
        System.out.println("UserViewModel get: "+liveData.getValue());
    }
}
