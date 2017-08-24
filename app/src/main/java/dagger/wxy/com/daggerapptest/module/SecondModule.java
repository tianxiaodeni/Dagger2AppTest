package dagger.wxy.com.daggerapptest.module;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import dagger.wxy.com.daggerapptest.model.Cloth;
import dagger.wxy.com.daggerapptest.qulifier.PerActivity;

/**
 * Created by wxy11520 on 2017/8/24.
 */
@Module
public class SecondModule {
    @PerActivity
    @Provides
    @Named("blue")
    public Cloth getBlueCloth(){
        Cloth cloth = new Cloth();
        cloth.setColor("蓝色");
        return cloth;
    }

}
