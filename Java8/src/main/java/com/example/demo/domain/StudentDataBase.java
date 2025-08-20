package com.example.demo.domain;

import java.util.Arrays;
import java.util.List;

public class StudentDataBase {

	public static List<Student> getAllStudent() {
		Student st1 = new Student(101, "Subhrajyoti", "Parida", "Male", 7.8,
				Arrays.asList("Phy", "Chem", "Math", "Bio"));

		Student st2 = new Student(102, "Sashi", "Senpati", "Male", 7.2, Arrays.asList("Phy", "Chem", "Math", "Bio"));

		Student st3 = new Student(103, "Sambit", "Nayak", "Male", 7.0, Arrays.asList("Phy", "Chem", "Elec", "Bio"));

		Student st4 = new Student(104, "Kailash", "Pradhan", "Male", 7.9, Arrays.asList("Phy", "Chem", "Math", "Bio"));

		Student st5 = new Student(105, "Lipsa", "Pradhan", "Female", 7.9, Arrays.asList("Phy", "Chem", "Math", "Bio"));

		Student st6 = new Student(106, "Priyanka", "Pandey", "Female", 8.9,Arrays.asList("Phy", "Chem", "Math", "Bio"));

		Student st7 = new Student(107, "Riya", "Parida", "Female", 8.4, Arrays.asList("Phy", "Chem", "Math", "Bio"));

		Student st8 = new Student(108, "Rinky", "Parida", "Female", 8.1, Arrays.asList("Phy", "Chem", "Math", "Bio"));

		Student st9 = new Student(101, "Chaitanya", "Barik", "Male", 8.2, Arrays.asList("Phy", "Chem", "Math", "Bio"));

		List<Student> studnetList = Arrays.asList(st1, st2, st3, st4, st5, st6, st7, st8, st9);
		return studnetList;

	}

}
