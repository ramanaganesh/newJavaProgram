package com.datastructureprogram;



public class Hash 
{
	class Node
	{
		Object data;
		Node next,link;int rem;
		public Node(Object data) {
			this.data=data;
		}
	}
	Node head;
	boolean add(Object data)
	{
		System.out.println("data="+data);
		Node n=new Node(data);
		if(head==null)
		{
			head=n;
			head.rem=(int)data%11;
			return true;
		}
		Node t=head,temp=head;
		Node prev=head;
		while(t!=null)
		{
			prev=t;
			if(t.rem > (int)data%11)
			{
				
				n.next=prev;
				
				if(prev==head)
					head=n;
				else
					temp.next=n;
				n.rem=(int)data%11;
				return true;
				
			}
			else if(t.rem == (int)data%11)
			{
				while(t.link!=null)
				{
					t=t.link;
				}
				t.link=n;
				t.rem=(int)data%11;
				return true;
			}
			temp=t;
			t=t.next;
		}
		prev.next=n;
		n.rem=(int)data%11;
		return true;
		}
	/*public boolean search(Object data)
	
	{
		if(head==null)
		{
			System.out.println("no elements to search");
			return false;
		}
		Node t=head;
		while(t!=null)
		{
				Node v=t;
				while(v!=null)
				{
					
					if((int)v.data==(int)data)
					{
						System.out.println(v.data);
						pop(data);
						return true;
					}
					v=v.link;
				}
				t=t.next;
			
		}
		add(data);
		return true;
	}
	private boolean pop(Object data) {
		System.out.println("pop operation");
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
			Node v=t;
			if(t==head && head.data==data)
				{
				System.out.println(data);
					if(t.link==null)
					{
						head=t.next;
						return true;
					}
				}
					else
					{
					while(v.link!=null)	
					{
						System.out.println(v.data);
						if(v.data==data)
						{
							System.out.println(data);
							v.next=t.next;
							head=t.link;
							return true;
						}
						
						v=v.link;
					}
				}
				
			
			/*if(temp.data.equals(data) && prev!=head)
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
	}*/
	@Override
	public String toString() {
		Node t=head;
		while(t!=null)
		{
			System.out.println("("+t.data+" "+t.rem+")");
			Node v=t;
			while(v.link!=null)
			{
				System.out.println("("+v.link.data+" "+v.rem+")");
				v=v.link;
			}
			t=t.next;
		}
		return "";
	}
}

