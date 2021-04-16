package ram.ramires.dagger2_practic_viewmodel;

import androidx.lifecycle.ViewModel;

import javax.inject.Inject;

public class UserGroupViewModel extends ViewModel {

    private UserGroupFacade userGroupFacade;

    @Inject
    public UserGroupViewModel(UserGroupFacade userGroupFacade) {
        this.userGroupFacade = userGroupFacade;
    }

    public void action(){
        System.out.println("UserGroupViewModel action");
    }
    //methods
}