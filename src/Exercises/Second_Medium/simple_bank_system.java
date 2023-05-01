package Exercises.Second_Medium;

//2043 简易银行系统
public class simple_bank_system {
    long[] bank;
    int len;
    public simple_bank_system(long[] balance) {
        len = balance.length;
        bank = balance;
    }
    public boolean transfer(int account1, int account2, long money) {
        if(account1 <= 0 || account1 > len || account2 <= 0 || account2 > len) {
            return false;
        }
        if(bank[account1 - 1] < money) {
            return false;
        }
        bank[account1 - 1] -= money;
        bank[account2 - 1] += money;
        return true;
    }
    public boolean deposit(int account, long money) {
        if(account <= 0 || account > len) {
            return false;
        }
        bank[account - 1] += money;
        return true;
    }
    public boolean withdraw(int account, long money) {
        if(account <= 0 || account > len) {
            return false;
        }
        if(bank[account - 1] < money) {
            return false;
        }
        bank[account - 1]  -= money;
        return true;
    }
}
