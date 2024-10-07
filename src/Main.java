public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String space = " ";
        String fullName = lastName + space + firstName + space + middleName;
        System.out.println("Ф.И.О. сотрудника — " + fullName);

        System.out.println("Задание 2");
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета — " + fullName.toUpperCase());

        System.out.println("Задание 3");
        String fullName2 = "Иванов Семён Семёнович";
        fullName2 = fullName2.replace('ё', 'e');
        System.out.println("Данные Ф.И.О. сотрудника — " + fullName2);
    }
}