package com.sample;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class DuplicateRemove {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);
        
        System.out.println("Original List>>"+list);
        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
        System.out.println("Duplicates Removed>>"+set);

	}

}
