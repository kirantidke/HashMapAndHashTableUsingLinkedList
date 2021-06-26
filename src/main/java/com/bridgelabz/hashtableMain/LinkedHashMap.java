package com.bridgelabz.hashtableMain;

public class LinkedHashMap<K> implements INode<K> {
	private LinkedHashMap next;
	private K key;

	public LinkedHashMap(K key) {
		this.key = key;
		this.next = null;
	}

	public K getKey() {
		return key;
	}
	@Override
	public void setKey(K key) {

	}

	public void setkey(K key) {
		this.key = key;
	}

	public INode<K> getNext() {
		return next;
	}

	public void setNext(INode next) {
		this.next = (LinkedHashMap<K>) next;
	}
}