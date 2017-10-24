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

public class ThreadRun extends Thread {
    
    private int startTime=0;
    private int endTime=0 ; 
    private String hash = "" ; 
    private int ThreadId =0;
    public static Boolean ok;

    /**
     *
     * @param startTime
     * @param endTime
     * @param ThreadId
     * @param ok1
     */
    public ThreadRun(int startTime, int endTime, int ThreadId)
    {
     super();
     this.startTime = startTime;
     this.endTime = endTime ; 
     this.ThreadId = ThreadId;
     this.hash = "DF9913186AD5061BD6E5B29912C2521C8D20F27B89E055AB62171CF26A936BF2";
     this.ok = false;
    }
    
    @Override
    public void run()
    {           System.out.println("Starting thread with id: "+ ThreadId);
		Sha256 sha256 = new Sha256();
		for(int iterateThread = startTime; iterateThread <= endTime ; iterateThread++){
			if( sha256.hashing(iterateThread).equals(hash) )
                        {       ok = true;
				System.out.println("Found password: " + iterateThread + " on thread " + ThreadId);
			}
		}
	}
    }
    
