package w7;

public class Account {
	
    private String accid;//���¹�ȣ
    private String name;//����
    private long balance;//�ܾ� 
    
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
    	//System.out.println("������call");
    }
    
    public void disp() {
    	System.out.printf("���¹�ȣ : %-7s\t���� : %s\t�ܾ� : %12d��\n",
    			accid,name,balance);
    }
}
