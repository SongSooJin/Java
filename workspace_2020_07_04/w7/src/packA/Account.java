package packA;
class Bank{
	private String accid;//계좌번호
    private String name;//고객명  
    public String getAccid(){ return accid;  }
    public String getName(){ return name;  }
    public Bank(){System.out.println("부모 인수없는 생성자call");}
    public Bank(String accid,String name){
    	this.accid=accid;
    	this.name=name;
    	System.out.println("부모 인수있는 생성자call");
    }
}
public class Account extends Bank{	
    private long balance;//잔액 
    public void minusMoney(long money){ balance-=money; }
    public void addMoney(long money){  balance+=money; }
    public long getBalance(){ return balance;  }  
    public Account() {System.out.println("자녀 인수없는 생성자call");}
    public Account(String accid,String name,long money){
    	super(accid,name);//주의 : 부모의 인수있는 생성자 명시적 호출!!
    	balance=money;
    	System.out.println("자녀 인수있는 생성자call");
    }
    public void disp() {
    	System.out.printf("계좌번호 : %-7s\t고객명 : %s\t잔액 : %12d원\n",
    			getAccid(),getName(),balance);
    }
}
