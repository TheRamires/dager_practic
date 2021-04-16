package ram.ramires.dagger2_practic_viewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ram.ramires.dagger2_practic_viewmodel.di.DemoViewModelFactory;
//DAGGER2
public class MainActivity extends AppCompatActivity {
    UserViewModel userViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DemoViewModelFactory viewModelFactory=((App) getApplication())
                .getAppComponent()
                .getViewModelFactory();

        userViewModel = new ViewModelProvider(this,viewModelFactory).get(UserViewModel.class);

        Button next=findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),
                        SecondActivity.class);
                startActivity(intent);
            }
        });

        Button action=findViewById(R.id.put);
        action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userViewModel.put("Sub-Zero");
            }
        });

    }
}