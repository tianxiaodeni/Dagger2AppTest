package dagger.wxy.com.daggerapptest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.wxy.com.daggerapptest.model.Cloth;
import dagger.wxy.com.daggerapptest.model.Clothes;
import dagger.wxy.com.daggerapptest.qulifier.RedCloth;
import dagger.wxy.com.daggerapptest.ui.Main2Activity;
import dagger.wxy.com.daggerapptest.utils.ClothHandler;

public class MainActivity extends AppCompatActivity {
    @Inject
    Shoe shoe;

    @Inject
    @RedCloth
    Cloth redCloth;
    @Inject
    @Named("blue")
    Cloth blueCloth;
    @Inject
    Clothes clothes;
    @Inject
    ClothHandler clothHandler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tx = (TextView) findViewById(R.id.textviewid);

        MainComponent build = DaggerMainComponent
                .builder()
                .baseComponent(((MyApplication)getApplication()).getBaseComponent())
                .mainModule(new MainModule())
                .build();
        build.inject(this);
        tx.setText("红布料加工后变成了" + clothHandler.handle(redCloth) + "\nclothHandler地址:" + clothHandler);


    }

    public void onClick(View v){
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
}
