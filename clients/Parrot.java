package main.clients;

import java.time.LocalDate;

public class Parrot extends Animal{

    public Parrot(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Parrot(){
        super();
    }

    public void swim() {
        System.out.println("Ошибка: Животное "+ getType()+" не может плыть");
    }
}
