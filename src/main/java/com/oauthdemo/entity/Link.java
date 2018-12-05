package com.oauthdemo.entity;

public class Link {

	Self self;
	Next next;

	public Self getSelf() {
		return self;
	}

	public void setSelf(Self self) {
		this.self = self;
	}

	public Next getNext() {
		return next;
	}

	public void setNext(Next next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Link [self=" + self + ", next=" + next + "]";
	}

}
