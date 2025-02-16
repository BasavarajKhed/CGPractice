package com.assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UniqueUserIDs {
	public static void main(String[] args) {
		List<String> userIds = new ArrayList<>();
		userIds.add("user123");
		userIds.add("user456");
		userIds.add("user789");
		userIds.add("user123");
		userIds.add("user999");

		HashSet<String> uniqueUserIds = new HashSet<>(userIds);
		System.err.println(userIds.size());
		System.out.println(uniqueUserIds.size());

		if (userIds.size() != uniqueUserIds.size()) {
			System.out.println("Duplicates Found");
		} else {
			System.out.println("All IDs are unique.");
		}
	}
}
