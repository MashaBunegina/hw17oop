public class Main {
    public static void main(String[] args) {

        Car Lada = new Car("Lada ", " Granta", 1.7, "желтый", 2015, "Россия", "Механика", "Седан", "111", 5, false, 100.8);
        Lada.car();

        Car Audi = new Car( "Audi ", " A8 50L TDI Quattro", 3.0, "черный", 2020, "Германия", "Автомат", "Седан", "222", 5, false, 100.8);
        Audi.car();

        Car BMW = new Car("BMW ", " Z8", 3.0, "черный" , 2021, "Германия", "Автомат", "Хэтчбэк", "333", 5, false, 100.8);

        BMW.car();

        Car KIA = new Car("KIA "," Sortage 4-го поколния", 2.4, "красный", 2018, "Южная Корея", "Автомат", "Седан", "444", 5 , false, 100.9);
        KIA.car();

        Car Hyundai = new Car("Hyundai "," Avante", 1.6, "оранжевый", 2016, "Южная корея", "Автомат","Седан", "555", 5, false, 100.9 );
        Hyundai.car();

        Train Lastochka = new Train("Ласточка", "B-901",2011, "Россия", 301, 3500, "Белорусский вокзал", "Минск-Пассажирский", 11) ;
        Lastochka.train();
        Train Leningrad = new Train("Ленинград", "D-125", 2019, "Россия", 270, 1700, "Ленинградский вокзал","Ленинград пассажирский", 8);
        Leningrad.train();

        Bus NumberOne = new Bus("Первый", "А-021", 2009, "Корея", 150,500, "Московский автовокзал", "Ивановский автовокзал",12,1);
        NumberOne.bus();

        NumberOne.refill();
        Lastochka.refill();
        KIA.refill();
    }
}