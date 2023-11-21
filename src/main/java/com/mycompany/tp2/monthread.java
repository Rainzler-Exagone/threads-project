/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2;

import javax.swing.JTextArea;



/**
 *
 * @author DELL
 */
public class monthread extends Thread{
    
    int N;
    String text2= " ";
    JTextArea text1;

    public monthread(JTextArea text1) {
        this.text1 = text1;
    }

    public void run (){
        for (int i=1 ; i <= 100 ; i++ ){
            try{
                sleep(1000);
            }
            catch (InterruptedException e){
                
            }
            text1.append(" "+String.valueOf(i));
        }
    }
}
