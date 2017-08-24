package dagger.wxy.com.daggerapptest;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import dagger.wxy.com.daggerapptest.model.Cloth;
import dagger.wxy.com.daggerapptest.model.Clothes;
import dagger.wxy.com.daggerapptest.qulifier.PerActivity;
import dagger.wxy.com.daggerapptest.qulifier.RedCloth;

/**
 * Created by wxy11520 on 2017/8/24.
 */
@Module
public class MainModule {

    @PerActivity
    @Provides
    @Named("blue")
    public Cloth getBlueCloth() {
        Cloth cloth = new Cloth();
        cloth.setColor("蓝色");
        return cloth;
    }

    @Provides
    public Shoe getShoe(){
        Shoe shoe = new Shoe();
        shoe.setColor("黑色");
        return shoe;
    }

    @Provides
    @RedCloth
    public Cloth getRedCloth() {
        Cloth cloth = new Cloth();
        cloth.setColor("红色");
        return cloth;
    }


//    @Provides
//    public Clothes getClothes(){
//        Cloth cloth = new Cloth();
//        cloth.setColor("红色");
//        return new Clothes(cloth);
//    }

    @Provides
    public Clothes getClothes(@Named("blue")Cloth cloth){
        return new Clothes(cloth);
    }

//    @PerActivity
//    @Provides
//    public ClothHandler getClothHandler(){
//        return new ClothHandler();
//    }


}
