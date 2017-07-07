package com.July30.com;

public class EnumDemo {
	enum directions{
		East,
		West,
		South,
		North,
	}
	public static void main(String[] args) {
		Direction s=Directions.East;//1st declare direction
for(Direction d:Direction.values()){
	System.out.println(d);
}
	}

}

