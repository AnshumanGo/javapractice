package com.practice.java._7javainheritance;

import java.util.ArrayList;
import java.util.List;

public class _2Aggregation {

    public static void main(String[] args) {

        Wheel frontWheel = new Wheel();
        Wheel rearWheel = new Wheel();

        List<Wheel> wheelList = new ArrayList<>();
        wheelList.add(frontWheel);
        wheelList.add(rearWheel);

        TwoWheeler twoWheeler = new TwoWheeler();
        twoWheeler.setWheelList(wheelList);

        System.out.println(frontWheel);
        System.out.println(rearWheel);
        for(Wheel wheel:twoWheeler.getWheelList()){
            System.out.println(wheel);
        }
    }
}

class Wheel{

}

/*
*   Code reuse is also best achieved by aggregation when there is no is-a relationship.
*   Inheritance should be used only if the relationship is-a is maintained throughout
*   the lifetime of the objects involved; otherwise, aggregation is the best choice.
*   The lifecycles of the objects aren't tied: every one of them can exist independently of each other.
*/

class TwoWheeler{

    List<Wheel> wheelList;

    public List<Wheel> getWheelList() {
        return wheelList;
    }

    public void setWheelList(List<Wheel> wheelList) {
        this.wheelList = wheelList;
    }
}