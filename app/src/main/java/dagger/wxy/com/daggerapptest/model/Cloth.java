package dagger.wxy.com.daggerapptest.model;

import javax.inject.Inject;

/**
 * Created by wxy11520 on 2017/8/24.
 */

public class Cloth {
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;
    @Inject
    public Cloth() {
    }



    @Override
    public String toString() {
        return color + "衣服";
    }
}
