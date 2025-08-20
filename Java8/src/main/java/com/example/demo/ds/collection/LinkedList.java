package com.example.demo.ds.collection;


class Node<T>{
	
    T data;
    Node next;
    Node(T data){
  	  
  	  this.data=data;
  	  this.next=null;
  			  
  }
	}

public class LinkedList<T> {
	
   Node<T> head=null;
	
	public void  add(T data) {
		/**
		 * This will add element to last
		 * */
		Node newnode=new Node(data);
		if(head==null) {
			head=newnode;
		}else {
			Node currentnode=head;
			while(currentnode.next!=null) {
				currentnode=currentnode.next;
			}
			currentnode.next=newnode;
		}
		
	}
   public void  addFirst(T data) {
	   Node newnode=new Node(data);
	   if(head==null) {
		   head=newnode; 
		   
	   }else {
		   newnode.next=head;
		   head=newnode;
	   }
		
	}
   public void printList() {
	   if(head==null) {
		   System.out.println("List is null");
		   return;
	   }
	   Node currentNode=head;
	   while(currentNode!=null) {
		   System.out.println("--->"+ currentNode.data);
		   currentNode=currentNode.next;
	   }
   }
   
   public void deleteFirst() {
	   
	 if(head==null) {
		 System.out.println("List is empty");
		 return;
	 }
	 head=head.next;
	 
	   
   }
   public void deleteLast() {
	   if(head==null) {
			 System.out.println("List is empty");
			 return;
		 }
	   if(head.next==null) {
		   /***
		    * If only one element is prsesent
		    * */
			head=null;
		 }
		Node currentnode=head;
		Node lastNode=head.next;
		while(lastNode.next!=null) {
			currentnode=currentnode.next;
			lastNode=lastNode.next;
			
			
		}
		currentnode.next=null;
		 
		   
	   }
   
   public T get(int index) {
	   T data=null;
	   
	   if(index<0) {
		  return (T) new IndexOutOfBoundsException("Index Can not be negative") ;
	   }
	   Node current=head;
	   int count=0;
	   while(current!=null) {
		   if(count==index) {
			   return (T) current.data;
		   }
		   current=current.next;
		   count++;
		   
	   }
	   return (T) new IndexOutOfBoundsException("Index Out of Range") ;
   }
  

	public static void main(String[] args) {
		
    LinkedList<String> list = new LinkedList<String>();
    list.add("Riya");
    list.add("Gulu");
    list.add("Alok");
    list.add("Rinky");
    
    list.printList();
    list.addFirst("Aaradhya");
    list.printList();
    System.out.println("After delete first elemet ");
    list.deleteFirst();
    list.printList();
    System.out.println("After delete Last elemet ");
    list.deleteLast();
    list.printList();
    
    System.out.println("Getting object by Index 2 " +list.get(2) );
    
	}

}
