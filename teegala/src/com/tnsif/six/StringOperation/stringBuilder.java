package com.tnsif.six.StringOperation;

public class stringBuilder {

	public static void main(String[] args) {
StringBuilder sb = new StringBuilder("Hello");
		
        sb.append(" World");
        System.out.println("After append: " + sb);

        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);

        sb.replace(6, 10, "C++");
        System.out.println("After replace: " + sb);

        sb.delete(6, 9);
        System.out.println("After delete: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());

	}

}
