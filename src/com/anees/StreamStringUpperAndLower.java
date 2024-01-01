package com.anees;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamStringUpperAndLower {
	public static void main(String[] args) {
		List<String> colors = Arrays.asList("Red","YelloW","OranGe","GreEn","BLUe","WhiTe");
		
		List<String> upperCaseColors = colors.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		
		System.out.println(upperCaseColors);

		List<String> lowerCaseColors = colors.stream()
				.map(String::toLowerCase)
				.collect(Collectors.toList());
		
		System.out.println(lowerCaseColors);
		
	}

}
