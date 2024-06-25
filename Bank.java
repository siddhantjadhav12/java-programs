

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

public class Bank{
    public static void main(String Args[])
    {
        Account account1 = new Account();
        account1.name = "siddhant jadhav";   // public
        account1.email = "siddhant@gmail.com"; // protected
        account1.setPassword("abcd"); // private
        System.out.println(account1.getPassword());
    }
}