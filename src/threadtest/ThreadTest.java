/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadtest;

/**
 *
 * @author MIDO
 */
public class ThreadTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SimpleThread x = new SimpleThread();
        x.start();
        new Thread(new ImpThread()).start();
    }
    
}
