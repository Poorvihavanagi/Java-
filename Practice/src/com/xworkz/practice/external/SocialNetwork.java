package com.xworkz.practice.external;

import com.xworkz.practice.internal.AccountManagement;

public class SocialNetwork {
    private AccountManagement accountManagement;

    public SocialNetwork(AccountManagement accountManagement){
        this.accountManagement=accountManagement;
        System.out.println("Parameterized const SocialNetwork");
    }
    public void deactivateAccount(){
        if(this.accountManagement!=null){
            this.accountManagement.activateAccount();
            System.out.println("Not null accountManagement");
        }
        else{
            System.out.println("It is null");
        }
    }
}
