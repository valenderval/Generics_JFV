package main;
import linkedlist.GenericNode;
import linkedlist.GenericLinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		
		GenericLinkedList myList=new GenericLinkedList();
		
		GenericNode aNode=new GenericNode();
		aNode.setData("Element 1");
		myList.addNode(aNode);
		aNode = new GenericNode();
		aNode.setData("Element 2");
		myList.addNode(aNode);
		
		GenericNode tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.getData());
			tempnode=tempnode.getNextNode();
		} while (tempnode!=null);
		
		GenericLinkedList<Integer> intList=new GenericLinkedList<Integer>();
		
		GenericLinkedList<Double> doubleList=new GenericLinkedList<Double>();
		
		GenericLinkedList<String> stringList=new GenericLinkedList<String>();
		
	}//end main

}//end class
