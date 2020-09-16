package w7;

public class Account {
	
    private String accid;//°èÁÂ¹øÈ£
    private String name;//°í°´¸í
    private long balance;//ÀÜ¾× 
    
    public void minusMoney(long money){ 
    	balance-=money; 
    }
    
    public void addMoney(long money){  
    	balance+=money; 
    }
    
    public long getBalance(){ 
    	return balance;  
    }
    
    public String getAccid(){ 
    	return accid;  
    }
    
    public Account() {}
    
    public Account(String accid,String name,long money){
    	this.accid=accid;
    	this.name=name;
    	balance=money;
    	//System.out.println("»ý¼ºÀÚcall");
    }
    
    public void disp() {
    	System.out.printf("°èÁÂ¹øÈ£ : %-7s\t°í°´¸í : %s\tÀÜ¾× : %12d¿ø\n",
    			accid,name,balance);
    }
}
