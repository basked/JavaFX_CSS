package bas.telphone.JavaFX.interfaces;

/**
 * Created by basked on 03.05.2017.
 */

import bas.telphone.JavaFX.objects.Person;

public interface AddressBook {
    // добавить запись
    void add(Person person);

    // изменить запись
    void edit(Person person);

    // удалить запись
    void delete(Person person);
}
