package dagger.wxy.com.daggerapptest.utils;

import dagger.wxy.com.daggerapptest.model.Cloth;
import dagger.wxy.com.daggerapptest.model.Clothes;

/**
 * Created by wxy11520 on 2017/8/24.
 */

public class ClothHandler {
    public Clothes handle(Cloth cloth){
        return new Clothes(cloth);
    }
}
