package problems;

import java.util.*;

public class Queue_using_Two_Stacks {
	    static class Queue{
	        static Stack<Long> s1=new Stack<>();
	        static Stack<Long> s2=new Stack<>();
	        static long top=-1;
	        static void enQueue(long number){
	            if(top == -1){
	                top = number;
	            }
	            s1.push(number);
	        }
	        static void deQueue(){
	            if(s2.isEmpty()){
	                while(!s1.isEmpty())
	                    s2.push(s1.pop());
	            }  
	            if(!s2.isEmpty())
	                s2.pop();
	            if(!s2.isEmpty())
	                top = s2.peek();                            
	            else {
	                if(s1.isEmpty()) top = -1;
	                else {
	                    while(!s1.isEmpty())
	                        s2.push(s1.pop());
	                    top = s2.peek();
	                }                    
	            }
	        }     
	        static void printFront(){
	            if(top!=-1){
	                System.out.println(top);
	            }
	        }
	    };
	    public static void main(String[] args) {
	       Scanner sc=new Scanner(System.in);
	       long test=sc.nextLong();
	       for(int t=0;t<test;t++){
	           long opt=sc.nextLong();
	           if(opt==1)
	           {
	                Queue.enQueue(sc.nextLong());
	           }
	           else{
	               if(opt==2){
	                   Queue.deQueue();
	               }
	               else{
	                   Queue.printFront();
	               }
	           }
	       }
	    }
	}
