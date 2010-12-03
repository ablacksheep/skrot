/**
 * 
 */
package goLogic.mainServer;

import goLogic.mainServer.model.ModuleType;
import goLogic.mainServer.module.Log;

/**
 * @author Anders Kiær
 *
 */
public class Server {

	private static boolean upgradePending;
	private static ModuleType upgradeType;
	private static Log log;
	
	private static void initValues(){
		upgradePending = false;
		upgradeType = ModuleType.NONE;
		log = new Log();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		initValues();
		log.logAppend("balle!");
		log.logAppend("to");
		initValues();
		log.logAppend("treeeesome!");
		/*
		while(true){
			if(upgradePending){
				
				if(upgradeType==ModuleType.NONE){
					
				}
				else if(upgradeType==ModuleType.LOG){
					
				}
				else if(upgradeType==ModuleType.BACKUP){
					
				}
				else if(upgradeType==ModuleType.CAMERA){
					
				}
				else if(upgradeType==ModuleType.SEISMIC){
					
				}
				upgradePending=false;
				
			} else {
				sleep ();
			}
			
		}*/
	}

}
