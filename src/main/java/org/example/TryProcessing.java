package org.example;
import processing.core.PApplet;

public class TryProcessing extends PApplet{
    private final int width=1000;
    private final int height=1000;
    private final int circleWidth=20;
    private final int circleHeight=20;
    private int[] xAxis={0,0,0,0};

    public void settings(){
        super.settings();
        size(width,height);
    }


    public void draw(){
        drawCircle(0,1);
        drawCircle(1,2);
        drawCircle(2,3);
        drawCircle(3,4);
    }

    public void drawCircle(int index,int speed){
        ellipse(xAxis[index],speed*(height/5),circleWidth,circleHeight);
        xAxis[index]+=speed;
    }
}
