package com.July3rd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;



  
class Testsort1{  
public static void main(String args[]){  
 ArrayList<Integer>al=new ArrayList<>();
 al.add(50);
 al.add(40);
 al.add(80);
 al.add(10);
 
 Collections.sort(al);
 Iterator itr=al.iterator();
 while(itr.hasNext()){
 System.out.println(itr.next());
 }
 
}
}