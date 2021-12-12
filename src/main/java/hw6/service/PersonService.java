package hw6.service;

import hw6.dao.PersonDao;
import hw6.model.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    PersonDao personDao = new PersonDao();

    public Person getProductListByPersonId(Long id) {
        return personDao.findById(id);
    }
}
