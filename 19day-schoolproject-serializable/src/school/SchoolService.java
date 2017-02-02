package school;

import java.io.Serializable;
import java.util.ArrayList;

import exception.DuplicateTelException;
import exception.PersonNotFoundException;

public class SchoolService implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -238757320290083780L;
	private ArrayList<Person> list = new ArrayList<Person>();

	private int findIndexByTel(String tel) {
		int index = -1;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTel().equals(tel)) {
				index = i;
				break;
			}
		}
		return index;
	}

	public void addPerson(Person p) throws DuplicateTelException {
		int index = findIndexByTel(p.getTel());
		if (index != -1)
			throw new DuplicateTelException();
		list.add(p);
	}

	public void printAll() {
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
	}

	public Person findPersonByTel(String tel) throws PersonNotFoundException {
		int index = findIndexByTel(tel);
		if (index == -1)
			throw new PersonNotFoundException();
		return list.get(index);
	}

	public void updatePerson(Person p) throws PersonNotFoundException {
		int index = findIndexByTel(p.getTel());
		if (index == -1)
			throw new PersonNotFoundException();
		list.set(index, p);
	}

	public void deletePersonByTel(String tel) throws PersonNotFoundException {
		int index = findIndexByTel(tel);
		if (index == -1)
			throw new PersonNotFoundException();
		list.remove(index);
	}
}
