package com.example.demo.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeekHashMap {

	public static void main(String[] args) {		
		 
		Map<Order,Integer> orders = new WeakHashMap();
		
		orders.put(new Order(1, "Dal"), 100);
		orders.put(new Order(2, "Rice"), 200);
		/**
		 * Strong reference
		 * */
		Order odrer3=new Order(3, "Wheat");
		
		orders.put(odrer3, 300);
		
		System.out.println("Weak Hashmap Before GC "+orders);
		System.out.println("Weak Hashmap size Before GC "+orders.size());
		System.gc();
		System.out.println("Weak Hashmap After GC "+orders);
		System.out.println("Weak Hashmap size After GC "+orders.size());
		
		
    Map<Order,Integer> orders2 = new HashMap<Order, Integer>();
		
    orders2.put(new Order(3, "Dal"), 100);
    orders2.put(new Order(4, "Rice"), 200);
		
		System.out.println(" Hashmap Before GC "+orders2);
		System.gc();
		System.out.println(" Hashmap After GC "+orders2);
	}

}

class Order{
	int id;
	String orderName;
	
	
	public Order(int id,String orderName) {
		this.id=id;
		this.orderName=orderName;
	}


	@Override
	public String toString() {
		return "Order [id=" + id + ", orderName=" + orderName + "]";
	}
	
	
}
