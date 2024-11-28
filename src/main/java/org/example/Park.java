package org.example;

public class Park {
    public class Attraction {
        private String name;
        private String workingHours;
        private int price;

        public Attraction(String name, String workingHours, int price){
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }
        void info(){
            System.out.println("Аттракцион: "+name);
            System.out.println("Время работы: "+ workingHours);
            System.out.println("Стоимость: "+price+"руб.");
        }
    }

    public static void main(String[] args) {
        Park park = new Park();
        Attraction attraction1 = park.new Attraction(" "," ", 10);

        attraction1.info();
    }
}
