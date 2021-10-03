package lab_2;

public class Animal {
    public Animal(String food, String location){
        this.food=food;
        this.location=location;
        animalType="��������";
    }
    String food;
    String location;
    String animalType;

    public String makeNoise(){
        if (isSleep) {
            return animalType + " ����";
        }
        else{
            return animalType +" ������ �����";
        }
    }
    public String eat(){
        if (isSleep) {
            return animalType + " ����";
        }
        else{
            return animalType + " ��� " + food;
        }
    }
    public String sleep(){
        isSleep=true;
        return animalType + " ����";
    }
    public String unSleep(){
        isSleep=false;
        return animalType + " ����������";
    }
    boolean isSleep=false;


}