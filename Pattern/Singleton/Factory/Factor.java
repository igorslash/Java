package Pattern.Singleton.Factory;

//Используйте паттерн Factory в следующих случаях:
//
//класс не имеет информации о том, какой тип объекта он должен создать;
//класс передает ответственность по созданию объектов наследникам;
//необходимо создать объект в зависимости от входящих данных.
public class Factor {
   public static Game createPerson(Property property) {
       switch (property) {
           case WARRIOR -> {
               return new Warrior();
           }
           case MAG -> {
               return new Mag();
           }
           case TROLL -> {
               return new Troll();
           }
           case ELV -> {
               return new Elv();
           }
           default -> throw new IllegalArgumentException("error");
       }
   }
}

