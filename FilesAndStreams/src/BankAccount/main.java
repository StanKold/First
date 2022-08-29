package BankAccount;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Create
        //•	Deposit {Id} {Amount}
        //•	SetInterest {Interest}
        //•	GetInterest {ID} {Years}
        //•	End
        Map<Integer, BankAccount> accounts = new HashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("End")){
            String [] commands= input.split("\\s+");
            switch (commands[0]){
                case"Create":
BankAccount acc=new BankAccount(0.00);
accounts.put(acc.getId(), acc);
                    System.out.printf("Account ID%d created%n", acc.getId());

                    break;
                case "Deposit":
                    if(accounts.containsKey(Integer.parseInt(commands[1]))){
                    BankAccount debit = accounts.get(Integer.parseInt(commands[1]));
                    debit.setBalance(Double.parseDouble(commands[2]));
                    accounts.put(debit.getId(), debit);
                    System.out.printf("Deposited %.0f to ID%d%n",Double.parseDouble(commands[2]),debit.getId());
                    }else {
                        System.out.println("Account does not exist");
                    }

                    break;
                case "SetInterest":
                    BankAccount.setInterest(Double.parseDouble(commands[1]));
                    break;
                case"GetInterest":
                    if(accounts.containsKey(Integer.parseInt(commands[1]))){
                    System.out.printf("%.2f%n",BankAccount.getInterest()*accounts.get(Integer.parseInt(commands[1])).getBalance()*Integer.parseInt(commands[2]));
                    }else{
                        System.out.println("Account does not exist");
                    }
                    break;
            }


            input= scanner.nextLine();
        }
    }


}
