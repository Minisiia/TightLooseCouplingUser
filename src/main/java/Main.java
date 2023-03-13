import loose_coupling.UserLooseCoupling;
import loose_coupling.impl.OrderOffline;
import loose_coupling.impl.OrderOnline;
import tight_coupling.Order;
import tight_coupling.UserTightCoupling;

/**
 * Змінити сильно зв'язний код на слабо зв'язний на прикладі класу User.
 */

public class Main {
    public static void main(String[] args) {

        /* Приклад поля, що демонструє сильний зв'язок:
        Припустимо, що клас User має поле Order, яке містить інформацію про замовлення, зроблене користувачем.
        Якщо поле Order має пряме посилання об'єкт Order, між класом User і Order встановлюється сильний зв'язок.
        Якщо змінити Order, це може призвести до змін у User і навпаки.
        */

        System.out.println((char) 27 + "[35m" + "Tight coupling" + (char) 27 + "[38m");
        UserTightCoupling user1 = new UserTightCoupling("Lily23",new Order(12,"5 socks"));
        System.out.println(user1);

        /* Приклад поля, що демонструє слабкий зв'язок:
        Якщо клас User має поле з інформацією про замовлення, то можна створити інтерфейс Order,
        який визначатиме методи роботи із замовленням, а потім реалізувати цей інтерфейс у класі OrderImpl,
        який міститиме конкретну реалізацію методів. У класі User можна використовувати посилання на інтерфейс Order,
        а не на конкретний клас OrderImpl, що забезпечить слабкий зв'язок між класами.
        Якщо в майбутньому з'явиться необхідність змінити клас OrderImpl або замінити його на інший, це можна буде зробити без зміни класу User.
        */

        System.out.println((char) 27 + "[35m" + "Loose coupling" + (char) 27 + "[38m");
        UserLooseCoupling user2 = new UserLooseCoupling("Pop3", new OrderOffline(12,"2 socks"));
        System.out.println(user2);
        UserLooseCoupling user3 = new UserLooseCoupling("Garry1234", new OrderOnline(143,"7 socks"));
        System.out.println(user3);
    }
}
