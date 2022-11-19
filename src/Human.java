public class Human {
    private int yearOfBirth;
    private String name;
    private String town;
    private String jobTitle;

    Human(String name, int yearOfBirth, String town, String jobTitle) {

        if (name == "" || name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }

        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }

        if (town == "" || town == null) {
            this.town = "Информация не предсоставлена";
        } else {
            this.town = town;
        }

        if (jobTitle == "" || jobTitle == null) {
            this.jobTitle = "Информация не предоставлена";
        } else {
            this.jobTitle = jobTitle;
        }
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился " + yearOfBirth + ". Я работаю в должности " + jobTitle + ". Будем знакомы!";
    }
}
