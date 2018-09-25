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
public class Father {
    
    private String FirstName;
    private String Name;
    private int Age;
    
    private ArrayList<Son> sons = new ArrayList();
    
    public ArrayList addSon(Son son){
           if(sons!=null&&son!=null){
               sons.add(son);
           }
           return sons;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
        if(sons!=null){
            for(Son s:sons){
                s.setFName(FirstName);
            }
//            int c = sons.size();
//            for(int i=0;i<c;i++)
//            {
//                Son son = sons.get(i);
//                son.setFName(FirstName);
//            }
        }
    }
  
   public Father(){
       this.FirstName = "张";
       this.Name = "起灵";
   }

    public Father(String FirstName) {
        this.FirstName = FirstName;
    }

    public Father(String FirstName, String Name) {
        this.FirstName = FirstName;
        this.Name = Name;
    }
    
    public void show(){
        System.out.println("Father Name:"+FirstName+Name);
    }
    
}
