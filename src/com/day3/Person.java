package com.day3;

import java.util.Objects;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
       
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
    	
    	
        if (this == obj) 
        	return true;
        if (obj == null || getClass() != obj.getClass()) 
        	return false;
        
        Person person = (Person) obj;
        
        
        return name.equals(person.name);
    }

    public String getName() {
        return name;
    }
//    
//    pisyush kumar
//    meenakshi
//    pooja
//    shiva prasad
//    capgemini
//    bangalurur
//    ravi kuma

    public static void main(String[] args) {
        Person person1 = new Person("pisyush kumar");
        Person person2 = new Person("meenakshi");
        Person person3 = new Person("pooja");
        Person person4 = new Person("shiva prasad");
        Person person5 = new Person("capgemini");
        Person person6 = new Person("bangaluru");
        Person person7 = new Person(" ravi kuma");
        
        

        System.out.println("Hash code for person1 " + person1.hashCode());
        System.out.println("Hash code for person2  " + person2.hashCode());
        System.out.println("Hash code for person3 " + person3.hashCode());
        System.out.println("Hash code for person4  " + person4.hashCode());
        System.out.println("Hash code for person5 " + person5.hashCode());
        System.out.println("Hash code for person6  " + person6.hashCode());
        System.out.println("Hash code for person7 " + person7.hashCode());

        
        
    }
}

