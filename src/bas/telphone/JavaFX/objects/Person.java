package bas.telphone.JavaFX.objects;

/**
 * Created by basked on 03.05.2017.
 */
public class Person {
    private String fio;
    private String phone;

    public Person() {
    }

    public Person(String fio, String phone) {
        this.fio = fio;
        this.phone = phone;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
