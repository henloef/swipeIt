package com.swipeit.game.Models;


public class PlayerModel {
    private int maxTime, currentTime;
    public PlayerModel(){
        maxTime = 100;
        currentTime = 95;
    }

    public void timeTick() {
        currentTime--;
    }

    private void addTime(){
        addTime(5);
    }
    public void addTime(int t){
        currentTime += t;
    }

    public int getMaxTime() {
        return maxTime;
    }

    public int getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(int currentTime) {
        this.currentTime = currentTime;
    }
}
