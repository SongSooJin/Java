package packA;
class Bank{
	private String accid;//���¹�ȣ
    private String name;//����  
    public String getAccid(){ return accid;  }
    public String getName(){ return name;  }
    public Bank(){System.out.println("�θ� �μ����� ������call");}
    public Bank(String accid,String name){
    	this.accid=accid;
    	this.name=name;
    	System.out.println("�θ� �μ��ִ� ������call");
    }
}
public class Account extends Bank{	
    private long balance;//�ܾ� 
    public void minusMoney(long money){ balance-=money; }
    public void addMoney(long money){  balance+=money; }
    public long getBalance(){ return balance;  }  
    public Account() {System.out.println("�ڳ� �μ����� ������call");}
    public Account(String accid,String name,long money){
    	super(accid,name);//���� : �θ��� �μ��ִ� ������ ����� ȣ��!!
    	balance=money;
    	System.out.println("�ڳ� �μ��ִ� ������call");
    }
    public void disp() {
    	System.out.printf("���¹�ȣ : %-7s\t���� : %s\t�ܾ� : %12d��\n",
    			getAccid(),getName(),balance);
    }
}
