package com.shiva.spider;

public class PenController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Pen controller start");
		PenDao pd=new PenDao();
		Pen p=new Pen(2,"cello",10,true);
		
		pd.insertPen(p);
		System.out.println("The end");

	}

}
