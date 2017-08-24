package dagger.wxy.com.daggerapptest;

import javax.inject.Inject;

/**
 * Created by wxy11520 on 2017/8/24.
 */

public class Shoe {
    @Inject
    public Shoe() {
    }

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color + "牛皮";
    }
}
