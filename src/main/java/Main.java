class Main {
  public static void main(String[] args) {
      BankAccount acct1 = new BankAccount(1000, -1000,"lisa");
        BankAccount acct2 = new BankAccount (1000,-1000,"bon");
        System.out.println(acct1);
 System.out.println(acct2);
        acct1.transfer(acct2,500);
        System.out.println(acct1);
        System.out.println(acct2);
        acct1.transfer(acct2,1600);
        System.out.println(acct1);
        System.out.println(acct2);
    }
}


