package dagger.wxy.com.daggerapptest.model;

/**
 * Created by wxy11520 on 2017/8/24.
 */

public class Clothes {
    private Cloth cloth;

    public Clothes(Cloth cloth) {
        this.cloth = cloth;
    }

    public Cloth getCloth() {
        return cloth;
    }

    @Override
    public String toString() {
        return cloth.getColor() + "衣服";
    }
}
