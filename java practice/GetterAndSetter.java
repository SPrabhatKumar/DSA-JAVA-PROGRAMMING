public class GetterAndSetter {
   public static void main(String[] args) {
    AccountDetails ac1=new AccountDetails();
    ac1.setAcc( 34674364);
    ac1.setAmount(4345342);
    ac1.setEmail("dsghasuif@gmail.com");
    ac1.setName("Prabhat Kumar");
    System.out.println("Account Name :"+ac1.getName()+"\nEmail is :"+ac1.getEmail()+"\nAccount Number is : "+ac1.getAcc()+"\nAmount is:"+ac1.getAmount());
    
   } 
}
class AccountDetails{
    private long acc_no;
    private String name,email;
    private long amount;
    public long getAcc(){
        return acc_no;
    }
    public void setAcc(long acc_no){
        this.acc_no=acc_no;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public long getAmount(){
        return amount;
    }
    public void setAmount(long amount){
        this.amount=amount;
    }
     
}
