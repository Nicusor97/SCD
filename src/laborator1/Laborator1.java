/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laborator1;

/**
 *
 * @author nicol
 */

public class Laborator1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Thread[] listOfThreads = new Thread[106];
        int startTime = 10000000;
        int interval_pas; 
        int ThreadPassword = 0 ; 
        
        interval_pas = (99999999 - 10000000 +1) / 106 ; 
        System.out.println("Step for max interval is:" + interval_pas);
        
        for (int iterator = 0; iterator< listOfThreads.length; iterator++)
        {
            listOfThreads[iterator] = new ThreadRun(startTime + interval_pas * iterator,
					startTime + interval_pas * (iterator + 1), iterator);

        }
        
        for (int iterator = 0; iterator< listOfThreads.length; iterator++)
        {
            if(!ThreadRun.ok)
            {
                listOfThreads[iterator].run();
            }
            else
            {
                ThreadPassword = iterator;
            }
        }
        
        if (ThreadRun.ok)
        {
            for (int iterator = 0; iterator< ThreadPassword; iterator++)
            {
                try 
                { 
                    listOfThreads[iterator].join();
                }
                catch ( InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
        
        
    }
    
}
