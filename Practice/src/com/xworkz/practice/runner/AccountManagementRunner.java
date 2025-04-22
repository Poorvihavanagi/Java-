package com.xworkz.practice.runner;

import com.xworkz.practice.external.SocialNetwork;
import com.xworkz.practice.internal.AccountManagement;
import com.xworkz.practice.internal.FacebookAccountImpl;

public class AccountManagementRunner {
    public static void main(String[] args) {
        AccountManagement accountManagement=new FacebookAccountImpl();
        SocialNetwork socialNetwork=new SocialNetwork(accountManagement);
        socialNetwork.deactivateAccount();
    }
}
