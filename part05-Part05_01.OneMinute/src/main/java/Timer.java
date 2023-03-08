/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fora
 */
public class Timer {
    private ClockHand seconds;
    private ClockHand mSeconds;
    
    public Timer() {
        this.seconds = new ClockHand(60);
        this.mSeconds = new ClockHand(100);
    }
    
    public void advance() {
        this.mSeconds.advance();
        
        if(this.mSeconds.value() == 0) {
            this.seconds.advance();
        }
        
    }
    
    public String toString() {
        return seconds + ":" + mSeconds;
    }
    
}
