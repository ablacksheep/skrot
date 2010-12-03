/**
 * 
 */
package goLogic.mainServer.module;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Anders Kiær
 *
 */
public class Log {
	private static File logFile = new File("log.txt");
	private static boolean started = false;
	private static BufferedWriter bw;
	private static FileWriter fw;
	
	public Log(){
		if (!started){
			try{
				fw = new FileWriter(logFile, true);
				bw = new BufferedWriter(fw);
			    }catch (Exception e){
					// TODO Auto-generated catch block
			    	System.err.println("Error: " + e.getMessage());
			    }
			    started = true;
		} 
	}
	public boolean unloadModule(){
		try{
			bw.close();
			fw.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("Error: " + e.getMessage());
		}
		return true;
	}
	
	synchronized static public void logAppend(String input){
		try {
			bw.write(input+"\n");
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("Error: " + e.getMessage());
		}
	}
}
