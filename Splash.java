package FamousOperas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.UIManager;

/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Splash.java
 * A class representing the Splash screen used by Cities.Java 
 * GUI used in a maintaining a USA Cities database.
 * <pre>
 *    Project	FamousOperas
 *    Platform	jdk 1.8.0_241; NetBeans IDE 11.3; Windows 10
 *    Course	CS 142, EdCC
 *    Hourse	1 hours and 45 minutes
 *    Created	1/27/2021
 * </pre>
 *
 * @author:		<i>Leanne Vu</i>
 * @version: 	%1% %5%
 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

public class Splash extends JWindow {
    //duration is integer value in millisecond for how long the Splash screen is visible
    private final int duration;
    JProgressBar loading = null; //progress bar
    private int progress;
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Constructor   Splash() 
    * Description   Create an instance of the Splash  class and assign
    *               values via parameters from another city to all fields.
    * @author       <i>Leanne Vu</i>	
    * @param        dur int
    * Date          1/27/2021
    *</pre>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public Splash(int dur) {
        duration = dur;
        UIManager.put("ProgressBar.selectionBackground", Color.black);
        UIManager.put("ProgressBar.selectionForeground", Color.white);
        UIManager.put("ProgressBar.foreground", new Color(50,20,20,200)); //new Color(68,32,128);
        loading = new JProgressBar(0,100);
        loading.setStringPainted(true);
    }
    //A simple little method to show a title screen in the center
    //of the screen for the amount of time given in the constructor
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        incProgress() 
    * Description   Creates and runs a new thread to manage increments of 
    * the progress bar while the splash screen is showing.
    * @author       <i>Leanne Vu</i>	
    * Date          1/27/2021
    *</pre>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void showSplash() {
       JPanel content = (JPanel) getContentPane();
        content.setBackground(Color.lightGray);
        
        // set the window bounds and centering the window
        int width = 650, height = 245;
        Dimension Screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (Screen.width - width)/2;
        int y = (Screen.height - height)/2;
        setBounds(x,y,width,height);
        
        //build the SplashScreen
        JLabel label = new JLabel (new ImageIcon("src/FamousOperas/Splash1.jpg"));
        JLabel copyrt = new JLabel ("Coppyright Opera Inc., 2021, Famous Music "
                + "Operas", JLabel.CENTER);
        copyrt.setFont(new Font ("San-serif", Font.BOLD,12));
        content.add(label, BorderLayout.CENTER);
        content.add ( loading, BorderLayout.SOUTH);
        Color border = new Color(50,20,20,55);
        content.setBorder(BorderFactory.createLineBorder(border,10));
        
        //Display it 
        setVisible(true);
        //wait a little while loading resource 
        try{
            //increment the progress bar's value to 100 starting from 0
            incProgress(20);
            Thread.sleep(duration);
        }catch( Exception e){
        
            e.printStackTrace();
        }
        setVisible(false);
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        incProgress() 
    * Description   Creates and runs a new thread to manage increments of 
    * the progress bar while the splash screen is showing.
    * @author       <i>Leanne Vu</i>	
    * @param        amount int
    * @throws       InterruptedException
    * Date          1/27/2021
    *</pre>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void incProgress(int amount) throws InterruptedException {
        //Instansiate and start new thread
        ProgressThread up = new ProgressThread(amount);
        up.thread.start();
    }
    
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * ProgressThread.java
 * Nested class to run the new thread form
 * <pre>
 *    Project	FamousOperas
 *    Platform	jdk 1.8.0_241; NetBeans IDE 11.3; Windows 10
 *    Course	CS 142, EdCC
 *    Hourse	1 hours and 45 minutes
 *    Created	1/27/2021
 * </pre>
 *
 * @author:		<i>Leanne Vu</i>
 * @version: 	%1% %5%
 * @see:     	javax.swing.JFrame
 * @see:        java.awt.Toolkit
 * @see         java.util.ArrayList
 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    class ProgressThread {
        private int amount;
        
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Constructor   ProgressThread() 
    * Description   Create an instance of the ProgressThread class and assign
    *               values via parameters from another city to all fields.
    * @author       <i>Leanne Vu</i>	
    * @param        amount int
    * Date          1/27/2021
    *</pre>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
        public ProgressThread(int amount) {
            this.amount = amount;
        }
        
        private Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                {
                    //increment the progress bar until it's value hits 100
                    while(progress<100) {
                        progress++;
                        try {
                            Thread.sleep(25);
                        }
                        catch (InterruptedException ex) {
                            
                        }
                        loading.setValue(progress);
                    }
                }
            }
        });
        
    }
}
        
