package com.mouli_list_task.custom_list;

import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
        List<String> my_list=new ArrayList<String>(10);
        my_list.add("mouli");
        my_list.add("oliva");
        my_list.add("sami");
        my_list.add("rohan");
        my_list.add("saswata");
        my_list.add("shambo");
        my_list.add("atreyee");
        my_list.add("raj");
        my_list.add("shuvo");
        my_list.add("sutirtha");
        System.out.println("enter how many element you want to add after 10 elements=");
        int extra_element=sc.nextInt();
        String name;
        System.out.println("enter names=");
        for(int i=0;i<extra_element;i++)
        {
        	name=sc.next();
        	my_list.add(name);
        }
        System.out.println("enter the position of data you want to fetch=");
        int position=sc.nextInt();
        System.out.println(my_list.get(position-1).toString());

        System.out.println("elements of list=");
        for(String s:my_list)
        {
        	System.out.print(s+" ");
        }
        System.out.println();
        System.out.println("enter the position of data you want to remove from list=");
        int remove_position=sc.nextInt();
        my_list.remove(remove_position-1);
        System.out.println("after remove list=");
        for(String s:my_list)
        {
        	System.out.print(s+" ");
        }
        
    }
}
