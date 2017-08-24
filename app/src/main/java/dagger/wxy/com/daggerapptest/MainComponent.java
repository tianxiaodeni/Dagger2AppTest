package dagger.wxy.com.daggerapptest;

import dagger.Component;
import dagger.wxy.com.daggerapptest.component.BaseComponent;
import dagger.wxy.com.daggerapptest.qulifier.PerActivity;

/**
 * Created by wxy11520 on 2017/8/24.
 */
@PerActivity
@Component(modules = MainModule.class , dependencies = BaseComponent.class)
public interface MainComponent {
    void inject(MainActivity mainActivity);
}
