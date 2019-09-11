package com.company;

public class Main {

    public static void main(String[] args) {
	StringBuilder stringBuilder=new StringBuilder();
	stringBuilder.append("hello");
	stringBuilder.append("Ganesh");
	stringBuilder.append("C");
	stringBuilder.delete(1,2);
        System.out.println(stringBuilder + " length :" +stringBuilder.length()+" , "+stringBuilder.capacity());
    }
}
