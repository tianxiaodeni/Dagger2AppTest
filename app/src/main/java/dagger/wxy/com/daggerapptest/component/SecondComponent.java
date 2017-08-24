package dagger.wxy.com.daggerapptest.component;

import dagger.Component;
import dagger.wxy.com.daggerapptest.module.SecondModule;
import dagger.wxy.com.daggerapptest.qulifier.PerActivity;
import dagger.wxy.com.daggerapptest.ui.Main2Activity;

/**
 * Created by wxy11520 on 2017/8/24.
 */

@PerActivity
@Component(modules = SecondModule.class,dependencies = BaseComponent.class)
public interface SecondComponent {
        void inject(Main2Activity secondActivity);
}
