package dagger.wxy.com.daggerapptest;

import android.app.Application;

import dagger.wxy.com.daggerapptest.component.BaseComponent;
import dagger.wxy.com.daggerapptest.component.DaggerBaseComponent;
import dagger.wxy.com.daggerapptest.module.BaseModule;

/**
 * Created by wxy11520 on 2017/8/24.
 */

public class MyApplication extends Application {
    private BaseComponent baseComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        baseComponent = DaggerBaseComponent.builder().baseModule(new BaseModule()).build();
    }

    public BaseComponent getBaseComponent() {
        return baseComponent;
    }

}
