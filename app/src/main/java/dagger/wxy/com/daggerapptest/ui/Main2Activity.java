package dagger.wxy.com.daggerapptest.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.wxy.com.daggerapptest.MyApplication;
import dagger.wxy.com.daggerapptest.R;
import dagger.wxy.com.daggerapptest.component.DaggerSecondComponent;
import dagger.wxy.com.daggerapptest.component.SecondComponent;
import dagger.wxy.com.daggerapptest.model.Cloth;
import dagger.wxy.com.daggerapptest.module.SecondModule;
import dagger.wxy.com.daggerapptest.utils.ClothHandler;

public class Main2Activity extends AppCompatActivity {
    @Inject
    ClothHandler clothHandler;
    @Inject
    @Named("blue")
    Cloth blueCloth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView tx = (TextView) findViewById(R.id.textviewid);
        SecondComponent component = DaggerSecondComponent.builder()
                 .baseComponent(((MyApplication)getApplication()).getBaseComponent())
                .secondModule(new SecondModule()).build();
        component.inject(this);
        tx.setText("蓝布料加工后变成了" + clothHandler.handle(blueCloth) + "\nclothHandler地址:" + clothHandler);


    }
}
