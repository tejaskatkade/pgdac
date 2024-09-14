package com.assignment3;

import java.util.Scanner;

public class BMITracker {
	
	private float weight;
	private float height;
	
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter weight (kg) :");
		this.weight = sc.nextFloat();
		System.out.println("Enter heighr (m) :");
		this.height = sc.nextFloat();		
	}
	
	public float calculateBMI() {
		return weight / (height * height);
	}
	
	public String classifyBMI() {
		float bmi = calculateBMI();
		String category;
		
		System.out.println("BMI value: "+ bmi);
		
		if(bmi < 18.5) {
			return "Underweight";
		}else if(bmi < 24.9){
			return "Normal Weight";
		}else if(bmi < 29.9) {
			return "Over Weight";
		}else {
			return "obese";
		}
		
	}
	
	public void printRecord() {
		
		System.out.println("Category : "+ classifyBMI());
	}
	

	
			
			
}
