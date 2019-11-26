package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean washState=false;
        boolean wiperState=false;
        boolean wiperSwitchState=false;
        float waterLevel=0;
        Wash wash=new Wash();
        WaterLevel level=new WaterLevel();
        Wiper wiper=new Wiper();
        WiperSwitch wiperSwitch=new WiperSwitch();
        wash.setWashState(washState);
        wiper.setWiperState(wiperState);
        wiperSwitch.setWpSwitch(wiperSwitchState);

        int state;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the water level:");
        waterLevel=in.nextFloat();
        while (waterLevel>5) {
            System.out.println("");
            System.out.println("Enter the water level:");
            waterLevel = in.nextFloat();
            System.out.println("Do you want switch on the wiper:[yes=1]or[no=0]");
            state = in.nextInt();
            if (state == 1) {

                if (waterLevel > 5) {
                    System.out.println("Water level is:" + waterLevel);
                    if (wash.isWashState()) {
                        System.out.println("Windscreen washed");
                        if (wiperSwitch.isWpSwitch()) {
                            System.out.println("Wiper switch is On");
                            wiper.setWiperState(true);
                            System.out.println("Wiper is on");
                        } else {
                            wiperSwitch.setWpSwitch(true);
                            System.out.println("Wiper switch is on");
                            if (wiperSwitch.isWpSwitch()) {
                                wiper.setWiperState(true);
                                System.out.println("Wiper is on");
                            }
                        }
                    } else {
                        wash.setWashState(true);
                        if(wash.isWashState()){
                            System.out.println("Windscreen washed");
                        }
                        if (wiperSwitch.isWpSwitch()) {
                            System.out.println("Wiper switch is On");
                            wiper.setWiperState(true);
                            System.out.println("Wiper is on");
                        } else {
                            wiperSwitch.setWpSwitch(true);
                            System.out.println("Wiper switch is on");
                            if (wiperSwitch.isWpSwitch()) {
                                wiper.setWiperState(true);
                                System.out.println("Wiper is on");
                            }
                        }
                    }
                }
            }else {
                System.out.println("Windscreen wont be wiped");
            }
        }
        System.out.println("Water level is less than 5. Because cant complete wash state.");




    }

}
