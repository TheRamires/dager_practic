package ram.ramires.dagger2_practic_viewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ram.ramires.dagger2_practic_viewmodel.di.DemoViewModelFactory;

public class SecondActivity extends AppCompatActivity {
    UserViewModel userViewModel;
    UserGroupViewModel userGroupViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        DemoViewModelFactory viewModelFactory=((App) getApplication())
                .getAppComponent()
                .getViewModelFactory();

        userViewModel = new ViewModelProvider(this,viewModelFactory).get(UserViewModel.class);
        userGroupViewModel= new ViewModelProvider(this, viewModelFactory).get(UserGroupViewModel.class);

        Button button=findViewById(R.id.back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        Button action=findViewById(R.id.put);
        action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userViewModel.get();
                userGroupViewModel.action();
            }
        });
    }
}