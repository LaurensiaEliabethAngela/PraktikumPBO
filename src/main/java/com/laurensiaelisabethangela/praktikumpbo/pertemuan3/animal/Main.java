
package com.laurensiaelisabethangela.praktikumpbo.pertemuan3.animal;


public class Main {
    public static void main(String[] args) {
        //Membuat object dari class Animal
        Animal cat = new Animal ("Ciuye",2, "white");
        Animal dog = new Animal ("blacky",5,"blacky");
        Animal rabbit = new Animal ("Piau",3,"brown");
        
        //Mengisi niai attribut object 'cat'
        cat.name = "Ciuye";
        cat.age = 2;
        cat.color = "White";
        
        //Mengisi nilai attribut object 'dog'
        dog.name = "blacky";
        dog.age = 5;
        dog.color = "black";
        
        //Mengisi nilai attribut object 'rabbit'
        rabbit.name = "Piau";
        rabbit.age = 3;
        rabbit.color = "brown";
        
        //Memanggil methode
        cat.showProfile();
        dog.showProfile();
        rabbit.showProfile();
        
        //Demo Getter & Setter
        System.out.println("Dog's name (before):" + dog.getName());
        dog.setName("Blacky");
        System.out.println("Dog's name (after) : " + dog.getName());
                
    }
}
