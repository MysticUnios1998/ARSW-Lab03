/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.black.blacklistvalidator;

import java.util.List;

/**
 *
 * @author hcadavid
 */
public class Main {
    
    public static void main(String a[]){
        HostBlackListsValidator hblv=new HostBlackListsValidator();
        List<Integer> blackListOcurrences=hblv.checkHost("200.24.34.55", 100);
        System.out.println("The host was found in the following blacklists:"+blackListOcurrences);
        
        blackListOcurrences=hblv.checkHost("202.24.34.55", 800);
        System.out.println("The host was found in the following blacklists:"+blackListOcurrences);
        
        blackListOcurrences=hblv.checkHost("212.24.24.55", 80);
        System.out.println("The host was found in the following blacklists:"+blackListOcurrences);
        
    }
    
}
