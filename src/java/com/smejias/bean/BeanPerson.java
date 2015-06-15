package com.smejias.bean;

import com.smejias.model.Person;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Sebastián Mejía Serna
 */
@ManagedBean
@RequestScoped
public class BeanPerson {
    private Person person = new Person();
    private static List<Person> list = new ArrayList();

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public List<Person> getList() {
        return list;
    }

    public void setList(List<Person> list) {
        this.list = list;
    }
    
    public void add(){
        this.list.add(person);
    }
}
