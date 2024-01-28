package main;

import main.clients.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


// 1) Добавить в класс Animal публичные методы двигаться(toGo), летать(fly), плавать(swim).
// 2) Создать по два класса
// наследника Animal, умеющих летать, плавать, бегать(животное может как уметь что-то одно, так и все сразу).
// 3) В main добиться того, чтобы при вызове метода действия, которое конкретное животное не умеет, оно этого не делало 
// (кошки не летают, рыбы не ходят)
// 4) В файле readme.md в репозитории гитхаб описать
// какие проблемы в таком проектировании Вы увидели,
// а также там же написать возникшие при выполнении дз вопросы
// (если они есть)

public class Main {
    public static void main(String[] args) {

        Animal cat = new Animal("Солнышко", new Owner("Сергей Валерьевич"),
                LocalDate.of(2021, 10, 05), new Illness("Лишай")); //Создаём экземпляр класса

        //System.out.println(cat.getOwner());
        //System.out.println(cat.getNickName());
        //System.out.println("Болезнь:" + cat.getIllness());

        //System.out.println(cat.getNickName());

        //cat.setIllness(new Illness(null));

        //System.out.println("Болезнь:" + cat.getIllness());


       // Animal testAnimal = new Animal();
       // System.out.println(testAnimal.getNickName());

        //cat.lifeCycle();

        Animal catty = new Cat();
        Dog goodBoy = new Dog();

        //System.out.println(goodBoy.getType());
        //System.out.println(catty.getType());
        //----------------------------------------------------------------
        Parrot feather = new Parrot("feather", new Owner("Alexander Grushev"),
                                    LocalDate.of(2022,12,04), new Illness("птичий грипп"));
        Catfish Som = new Catfish("Som", new Owner("Sergey Alekseyev"),
                                    LocalDate.of(2023,01,04), new Illness("водянка"));
        
        System.out.println(feather);

        feather.Fly();
        Som.swim();

        feather.swim();
        Som.ToGo();
        Som.Fly();

        catty.Fly();

        System.out.println(Som.toString());
        
        //----------------------------------------------------------------
        //System.out.println(catty);

        //Cat.meow();

        List<Animal> animals = new ArrayList<Animal>();

        animals.add(catty);
        animals.add(goodBoy);
        animals.add(cat);

        int i = 0;
        for (Animal animal : animals){
            System.out.println(i + " "+ animal);
            i++;
        }

    }
}


