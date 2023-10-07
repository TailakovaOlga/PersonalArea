
public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();

        post.name = "Иван";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";

        post.subscription = true;
        boolean isAgree = true;
        if (isAgree) {
            if (!isAgree) {

            }
        }

        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;


        System.out.println("Имя : " + post.name);
        System.out.println("Паспорт : " + post.passport);
        System.out.println("Отчество : " + post.patronymic);
        System.out.println("Телефон : " + post.phone);
        System.out.println("Фамилия : " + post.surname);
        System.out.println("Дата рождения : ");
        System.out.println("День : " + post.birthday.day);
        System.out.println("Месяц  : " + post.birthday.month);
        System.out.println("Год  : " + post.birthday.year);
        System.out.println("Подписка  : " + post.subscription);
    }
}




