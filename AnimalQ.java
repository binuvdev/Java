package com.java.study;

import java.util.LinkedList;
import java.util.Queue;

public class AnimalQ {
	Queue<Animal> catQ = new <Animal>LinkedList();
	Queue<Animal> dogQ = new <Animal>LinkedList();
	int runner = 0;
	
	public boolean enQueue(Animal newAnimal) {
		
		newAnimal.id = ++runner;
		
		if (newAnimal.type.equalsIgnoreCase("Cat")) {
			return catQ.add(newAnimal);
		} else {
			return dogQ.add(newAnimal);
		}
		
	}
	
	public Animal deQueueAny() {
		
		if (catQ.isEmpty() && dogQ.isEmpty()) return null;
		
		if (catQ.isEmpty() && !dogQ.isEmpty()) return dogQ.remove();
		
		if (!catQ.isEmpty() && dogQ.isEmpty()) return catQ.remove();
		
		if (catQ.peek().id < dogQ.peek().id) {
			return catQ.remove();
		} else {
			return dogQ.remove();
		}
	}
	
	public Animal deQueueDog() {
		
		if (dogQ.isEmpty()) return null;	
		return dogQ.remove();
	}

	
	public Animal deQueueCat() {
		
		if (catQ.isEmpty()) return null;	
		return catQ.remove();
	}
	
	public static void main(String[] args) {
		AnimalQ q = new AnimalQ();
		
		q.enQueue(new Animal("Cat1","Cat"));
		q.enQueue(new Animal("Cat2","Cat"));
		q.enQueue(new Animal("Dog1","Dog"));
		q.enQueue(new Animal("Cat6","Cat"));
		q.enQueue(new Animal("Dog4","Dog"));
		q.enQueue(new Animal("Dog3","Dog"));
		q.enQueue(new Animal("Cat4","Cat"));
		q.enQueue(new Animal("Cat5","Cat"));
		
		
		Animal dQued = q.deQueueAny();
		System.out.println(dQued.id + " - " + dQued.name);
		
		dQued = q.deQueueDog();
		System.out.println(dQued.id + " - " + dQued.name);
		
		dQued = q.deQueueDog();
		System.out.println(dQued.id + " - " + dQued.name);
		
		dQued = q.deQueueCat();
		System.out.println(dQued.id + " - " + dQued.name);
		
		dQued = q.deQueueAny();
		System.out.println(dQued.id + " - " + dQued.name);
		
		dQued = q.deQueueAny();
		System.out.println(dQued.id + " - " + dQued.name);

		dQued = q.deQueueAny();
		System.out.println(dQued.id + " - " + dQued.name);

		dQued = q.deQueueAny();
		System.out.println(dQued.id + " - " + dQued.name);

		dQued = q.deQueueAny();
		if (dQued!=null) {
			System.out.println(dQued.id + " - " + dQued.name);
		} else {
			System.out.println("No more animals");
		}

		
	}
	

}
