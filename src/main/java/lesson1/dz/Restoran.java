package lesson1.dz;

public class Restoran {

    private int breakfast;
    private int dinner;
    private int lunch;


    public Restoran(int breakfast, int dinner, int lunch) {
        this.breakfast = breakfast;
        this.dinner = dinner;
        this.lunch = lunch;
    }

    public String doIt(Group group){
        String result = "Группа номер: "+ group.getName()+ " " + '\n';
        for(Person person: group.getPeoples()){
            result += "Имя клиента: " + person.getName()+ " " + '\n';
            if(person.getCanEatCalories()<breakfast) result += "Завтрак - наелся "+ '\n';
            if(person.getCanEatCalories()<dinner) result += "Ужин - наелся "+ '\n';
            if(person.getCanEatCalories()<lunch) result += "Обед - наелся "+ '\n';
        }

            return result;
    }

}
