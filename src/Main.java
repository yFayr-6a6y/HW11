public class Main {
    public static void main(String[] args) {
        String firstName = "Ivan";
        String middleName = "Ivanov";
        String lastName = "Ivanovich";
        String emptyStr = " ";
        String fullName = middleName + emptyStr + firstName + emptyStr + lastName;
        System.out.println("Ф.И.O. сотрудника - " + fullName);


        //
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета — " + fullName.toUpperCase());


        //
        String firstNameSec = "Семён";
        String middleNameSec = "Иванов";
        String lastNameSec = "Семёнович";
        String firstNameRus = firstNameSec.replace('ё', 'е');
        String lastNameRus = lastNameSec.replace('ё', 'е');
        String fullNameSec = middleNameSec + emptyStr + firstNameRus + emptyStr + lastNameRus;
        System.out.println(fullNameSec);


    }
}