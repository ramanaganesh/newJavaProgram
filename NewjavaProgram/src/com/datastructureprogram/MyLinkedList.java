package com.datastructureprogram;



public class MyLinkedList {

	class Node
	{
		Object data;
		Node next;
		
		public Node(Object data) {
			this.data=data;
		}
	}
	private Node head;
	boolean add(Object data)
	{
		//System.out.println("add function "+data);
		Node n=new Node(data); 
		Node t=head;
		if(head==null)
		{
			head=n;
			return true;
		}
		
		
		while(t.next!=null)
		{
			
			t=t.next;
		}
		t.next=n;
		return true;
	}
	private void remove(Object data, Node prev,Node t) {
		if(head==null)
		{
			System.out.println("no element in the list");
		}
		else
		{
			prev.next=t.next;
			t.next=null;
		}
	}
	
	public boolean search(Object data)
	{
		if(head==null)
		{
			System.out.println("no elements to search");
			return false;
		}
		Node t=head;
		while(t!=null)
		{
			if(t.data.equals(data))
			{
				remove(data);
				return true;
			}
			
			t=t.next;
			
		}
		add(data);
		return true;
	}
	public boolean remove(Object data)
	{
		Node t=head;
		if(head==null)
		{
			System.out.println("no elements to delete");
			return false;
		}
		Node prev=t;
		Node temp=prev;
		while(t.next!=null)
		{
			if(head.data.equals(data))
			{
				head=t.next;
				t.next=null;
				return true;
			}
			if(temp.data.equals(data) && prev!=head)
			{
				remove(data,t,prev);
				return true;
			}
			prev=t.next;
			if(prev.data.equals(data))
			{
				//System.out.println(t.data+" "+prev.data);
				remove(data,t,prev);
				return true;
			}
			t=t.next;
		}
		
		return true;
	}
	@Override
	public String toString() {
		Node t=head;
		int count=0;

	while(t!=null)
	{
		System.out.println(t.data+" ");
		count++;
		t=t.next;
	}
	System.out.println(count);
		return " ";
	}
	}

