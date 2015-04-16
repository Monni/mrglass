/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameState;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.MediaTracker;

/**
 *
 * @author Nissinen
 */
public abstract class GameState extends Applet {
    
    protected GameStateManager gsm;
    
    public GameState(GameStateManager gsm){
        this.gsm = gsm;
           
        init();
        
    }
    
    public abstract void init();
    public abstract void tick();
    public abstract void draw(Graphics g);
    public abstract void keyPressed(int k);
    public abstract void keyReleased(int k);
    
}
