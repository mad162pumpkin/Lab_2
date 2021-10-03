package lab_2;

public class Z3 {
    public static void main (String args[]){
        Phone phone1 = new Phone("+7 (916) 192-55-95","Honor",140.0);
        Phone phone2 = new Phone("+7 (926) 576-32-77","Huawei");
        Phone phone3 = new Phone();
        Phone[] phones = {phone1, phone2, phone3};
        for(Phone p:phones){
            System.out.println("Model: " + p.model + "\nNumber: " + p.number + "\nWeight: " + p.weight + "\n");
        }
        phone1.receiveCall("Аня");
        phone2.receiveCall("Кирилл");
        phone3.receiveCall("Егор\n");
        for(Phone p:phones){
            System.out.println(p.getNumber());
        }
        phone1.receiveCall("Аня", "+7 (985) 312-76-51");
        phone2.receiveCall("Кирилл", "+7 (915) 999-35-53");
        phone3.receiveCall("Егор", "+7 (977) 256-12-82\n");

        Phone.sendMessage("Hello, World!", "+7 (985) 312-76-51", "+7 (915) 999-35-53", "+7 (977) 256-12-82");
    }
}