package bank;

class Account{
    public String name;
    protected String email;
    private String Password;

    //getters & setters
    public String getPassword(){
        return this.Password;
    }

    public void setPassword(String pass)
    {
        this.Password = pass;
    }
}

public class AccessModifyer{
    public static void main(String Args[])
    {
        Account account1 = new Account();
        account1.name = "siddhant jadhav";
        account1.email = "siddhant@gmail.com";
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());
    }
}