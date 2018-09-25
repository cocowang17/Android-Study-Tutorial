/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp913;

import java.util.ArrayList;

/**
 *
 * @author wangwei
 */
public class Son extends Father{
    
    private String Name;
    private Father father;
    
    public Son()
    {
        int r1 = (int) (Math.random() * 10000) + 25000;
        int r2 = (int) (Math.random() * 10000) + 25000;
        this.Name = "张"+(char)r1+(char)r2;
    }
    
    public Son(Father father)
    {
        this.father = father;
        int r1 = (int) (Math.random() * 10000) + 25000;
        int r2 = (int) (Math.random() * 10000) + 25000;
        this.Name = father.getFirstName()+(char)r1+(char)r2;
        father.addSon(this);
    }
    
    public void setFName(String fn){
        String old = Name.substring(1);
        Name = fn+old;
    }
    
    @Override
    public void show(){
        System.out.println("Son Name:"+Name);
    }
    
}
