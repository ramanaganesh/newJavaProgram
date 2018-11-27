package com.behaviouralpattern;

public class User 
{
private String name;

public User(String name) {
	this.name=name;
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
void sendMessageToChatRoom(String message)
{
	ChatRoom.showMessage(this,message);
}
}
