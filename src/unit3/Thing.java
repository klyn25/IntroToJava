/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit3;

/**
 *
 * @author Kristy
 */
public class Thing {
    
	private String IDCode;
	private int count;	

	Thing(String IDCode, int count) {
		this.IDCode = IDCode;
		this.count = count;
	}
        public Thing(String IDCode){
            this.IDCode = IDCode;
            count = 1;
        }
        
        public String getIDCode(){
            return IDCode;
        }
        public void setIDCode(String IDCode){
            this.IDCode = IDCode;
        }
        public int getCount(){
            return count;
        }
        
        public void setCount(int count){
            this.count = count;
        }
        
        public void fiveThat(int count){
            this.count += count;
        }
        
        public int getFive(){
            return count * 5;
        }
        

    
}
