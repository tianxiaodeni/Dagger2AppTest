package dagger.wxy.com.daggerapptest.component;

import javax.inject.Singleton;

import dagger.Component;
import dagger.wxy.com.daggerapptest.module.BaseModule;
import dagger.wxy.com.daggerapptest.utils.ClothHandler;

/**
 * Created by wxy11520 on 2017/8/24.
 */
@Singleton //对应Module中声明的单例
@Component(modules = BaseModule.class)
public interface  BaseComponent {
    ClothHandler getClothHandler();
}
