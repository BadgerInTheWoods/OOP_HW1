package main.clients;

import java.time.LocalDate;

public class Catfish extends Animal{
    
    public Catfish(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }
    
    public Catfish(){
        super();
    }

    public void Fly() {
        System.out.println("Ошибка: Животное "+ getType()+" не может летать");
    }

    public void ToGo() {
        System.out.println("Ошибка: Животное "+ getType()+" не может идти");
    }
}
