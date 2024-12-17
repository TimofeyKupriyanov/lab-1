package bsu.rfe.course2.group6.kupriyanov;

public class MainApplication {

    @SuppressWarnings("unchecked")
    public static void main(String args[]) throws Exception{

        Food[] breakfast = new Food[20]; // массив для хранения объектов еды
        int itemsSoFar = 0; // отслеживает количество добавленных элементов
        int found = 0; // количество найденных элементов этого типа

        for (String arg : args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[itemsSoFar] = new Cheese();
            } else if (parts[0].equals("Cake")) {
                breakfast[itemsSoFar] = new Cake(parts[1]);
            } else if (parts[0].equals("Apple")) {
                breakfast[itemsSoFar] = new Apple(parts[1]);
            }
            itemsSoFar++;
        }

        // Подсчет количества Cake
//        Food cakeSample = new Cake("");
//        int cakeCount = countProductsByType(breakfast, cakeSample);
//        System.out.println("Количество Cake в меню: " + cakeCount);

        Food CheeseSample = new Cheese();
        int CheeseCount = countProductsByType(breakfast, CheeseSample);
        System.out.println("Количество cheese в меню: " + CheeseCount);

        //Перебор всех элементов массива
        for (Food item: breakfast) {
            if(item != null) {
                item.consume();
            }else break;
        }
        System.out.println("Всего хорошего!");
    }
    public static int countProductsByType(Food[] breakfast, Food countItem) {
        int count = 0;
        for (Food item : breakfast) {
            if (item != null && item.equals(countItem)) {
                count++;
            }
        }
        return count;
    }
}



