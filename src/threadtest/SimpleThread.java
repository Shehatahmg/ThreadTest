/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadtest;

import static java.lang.Thread.sleep;

/**
 *
 * @author MIDO
 */
public class SimpleThread extends Thread {
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println(i+" First thread");
            try {
                sleep(1000);
            } catch (InterruptedException e){
                   e.printStackTrace();
                }
        }
        System.out.println("First Done !");
    }
}
