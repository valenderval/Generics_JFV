package linkedlist;

/**
 * This class models a Node object which contains Strings. Each
 * node has its internal data (a String) and pointers to the next 
 * node in the list.
 * 
 * @author rkelley/njohnson/jvallery
 * Programming Project 1 Start Project
 * CS131ON
 */
public class GenericNode<T> {
	
	private T data;  //data  of any type (String, Int, Char, etc:) that the object stores
	private GenericNode<T> nextNode; //pointer to the nextNode of any parameterized type that will be in LinkedList
	
	/**
	 * Constructor build Node object. Initializes nextNode and data
	 * to null.
	 */
	public GenericNode()
	{
		setNextNode(null);
		data=null;
	}//end empty-argument constructor
	
	/**
	 * This method sets the data of the object.
	 * @param data
	 */
	public void setData(T data) { //set data of any type
		this.data=(T) data; //
	}//end setData
	
	/**
	 * This method returns the data of the object.
	 * @return String (data)
	 */
	public T getData() { //get and return data of any type.
		return this.data;
	}//end getData
	
	/**
	 * This method returns itself to the caller.
	 * @return
	 */
	public GenericNode<T> getNode() { // get and return Node of ant type
		return this;
	}//end getNode
	
	/**
	 * This method updates the pointer for the next node.
	 * @param nextNode
	 */
	public void setNextNode(GenericNode<T> nextNode) //set nextNode of any type
	{
		this.nextNode=nextNode;
	}//end setNextNode
	
	/**
	 * This method returns the node stored in the next node pointer.
	 * @return Node object
	 */
	public GenericNode<T> getNextNode() {//get and return next node of any type
		return nextNode;
	}//end getNextNode
	
}//end class