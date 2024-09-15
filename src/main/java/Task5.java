
public class Task5 {
    public static void main(String[] args) {
        Employe [] employes = new Employe[5];
        employes[0] = new Employe("Инженер", "Петров В.В.", "petrov@mail.ru",
                "2253233", 400, 32);
        employes[1] = new Employe("Врач", "Сидоров А.Б.", "sidorov@mail.ru",
                "2253133", 200, 44);
        employes[2] = new Employe("Учитель", "Иванов А.К.", "ivanov@mail.ru",
                "2253533", 300, 50);
        employes[3] = new Employe("Пилот", "Шершнев П.В.", "vas@mail.ru",
                "2253733", 800, 22);
        employes[4] = new Employe("Водитель", "Морозов Н.М.", "Moreoz@mail.ru",
                "2253833", 500, 47);
        for (int i =0; i< employes.length;i++) {
            if (employes[i].getAge()>40) {
                Employe.aboutPeople(employes[i]);
            }
        }
    }
}
