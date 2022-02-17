package com.zhengyang.exercises;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@SpringBootApplication
@RestController
// add @RestController to you expose methods as REST services to clients
public class SpringBootApplicationPeople {
    static List<Person> person = new ArrayList<Person>();

    public static void main(String[] args) {
        Person yang= new Person(1,"yang",18);
        Person ying = new Person(2,"ying",20);
        Person xu = new Person(3,"xu",25);
        person.add(yang);
        person.add(ying);
        person.add(xu);
        SpringApplication.run(SpringBootApplicationPeople.class, args);

    }

     /*
        @GetMapping("people/{id}")
        public Person getPersonById(@PathVariable("id") Integer id) {
            // filter list and return person that matches id otherwise return null
        }
     */
    
    @GetMapping("people/{id}")
    public Person getPersonById(@PathVariable("id") Integer id){
        for (Person people : person) {
            if (people.id==id){
                return people;
            }

        }
        return null;
    }
    //create another method that returns all people using @GetMapping("people")
    @GetMapping("people")

    public List allPerson(){
        return person;
    }

    static class Person{
        private int id;
        private String name;
        private int age;

        public Person(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return id == person.id && age == person.age && Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name, age);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    // All your code should be inside this one class

   
    // create a class called Person with following properties: id, name, age
    // implement getPersonById
    /*
        @GetMapping("people/{id}")
        public Person getPersonById(@PathVariable("id") Integer id) {
            // filter list and return person that matches id otherwise return null
        }
     */
    // create another method that returns all people using @GetMapping("people")
    // test your api using chrome



}
