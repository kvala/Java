package com.randomlist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

class Node {
	String key;
	int value;

	Node(String key, int value) {
		this.key = key;
		this.value = value;
	}
}

public class RandomListGenerator {
	HashMap<Integer, String> map = new HashMap<Integer, String>();

	public String generateRandom(List<Node> choices) {
		int count = 0;

		for (Node choice : choices) {
			for (int i = 1; i <= choice.value; i++) {
				map.put(count++, choice.key);
			}
		}

		return map.get(new Random().nextInt(count));

	}

	public static void main(String[] args) {
		RandomListGenerator rg = new RandomListGenerator();
		List<Node> choices = new ArrayList<Node>();
		choices.add(new Node("Alpha", 1));
		choices.add(new Node("Beta", 3));
		choices.add(new Node("Alpha", 2));
		System.out.println("Result is: " + rg.generateRandom(choices));

		for (int i = 1; i < rg.map.size(); i++) {
			System.out.println(rg.map.get(i));
		}
	}

}
