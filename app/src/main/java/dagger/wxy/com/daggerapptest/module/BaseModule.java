package dagger.wxy.com.daggerapptest.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.wxy.com.daggerapptest.utils.ClothHandler;

/**
 * Created by wxy11520 on 2017/8/24.
 */
@Module
public class BaseModule {

    @Singleton //单例
    @Provides
    public ClothHandler getClothHandler(){
        return new ClothHandler();
    }
}
