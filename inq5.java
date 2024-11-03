class BankAccount {
    int balance =100;
    void deposit()
    {

    }
    void withdraw()
    {
       
    }
}
class SavingAccount extends BankAccount {

    void withdraw()
    {
      if(balance<100)
      {
        System.out.println("insufficent balace cannot withdraw");
      }
      else{
        System.out.println("sufficent balance");
      }
    }
}