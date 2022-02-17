package com.zhengyang.exercises;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@SpringBootApplication
@RestController
public class HelloSpringBootApplication {

	public static void main(String[] args) {

		SpringApplication.run(HelloSpringBootApplication.class, args);
	}

	//localhost:8080
	@GetMapping
	String greet(){
		return "Hello zhengyang";
	}

	//localhost:8080/ping

	@GetMapping(path = "bar")
	String foo(){
		return "bar";
	}
	//http://localhost:8080/?name=foo

	@GetMapping(params = "name")
	String greetName(@RequestParam("name")String name){
		return "Hello "+name+" how are you today?";
	}
	@GetMapping("peopleAlex")
	Person getPerson(){
		return new Person("Alex",24);
	}


	//http://localhost:8080/people2

	@GetMapping("people2")
	List<Person> getTwoPerson(){
		return List.of(
				new Person("Alex",24),
				new Person("wendy",22));
	}


	@PostMapping(path="people2")
	void addPerson(@RequestBody Person person){
		System.out.println(person);
	}



	static class Person{
		private String name;
		private Integer age;


		public Person(String name, Integer age) {
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getAge() {
			return age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "Person{" +
					"name='" + name + '\'' +
					", age=" + age +
					'}';
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			Person person = (Person) o;
			return Objects.equals(name, person.name) && Objects.equals(age, person.age);
		}

		@Override
		public int hashCode() {
			return Objects.hash(name, age);
		}
	}


}
