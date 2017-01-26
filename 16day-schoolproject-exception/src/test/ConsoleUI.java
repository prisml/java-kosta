package test;

import java.util.Scanner;

import exception.DuplicateTelException;
import exception.PersonNotFoundException;
import school.Employee;
import school.Person;
import school.SchoolService;
import school.Student;
import school.Teacher;

public class ConsoleUI {
	private SchoolService service;
	Scanner s; 
	
	public void mainUI()
	{
		service = new SchoolService();
		s = new Scanner(System.in);
		System.out.println("*******�л�������α׷��� �����մϴ�******");
		
		ui : while(true){
			System.out.println("1. �߰� 2. ���� 3. �˻� 4. ��üȸ������ 5.����");
			int in = Integer.parseInt(s.nextLine());
			switch(in){
			case 1 : addPerson(); break;
			case 2 : deletePerson(); break;
			case 3 : findPerson(); break;
			case 4 : printAll(); break;
			case 5 : break ui;
			default : System.out.println("�߸� �Է��߽��ϴ�");
			}
		}
		System.out.println("���α׷��� �����մϴ�.");
		s.close();
	}

	public void addPerson(){
		String name, tel, address, subin;
		Person p;
		
		System.out.println("�Է��� �������� ������ �����ϼ��� 1.�л�  2.������ 3.����");
		int in = Integer.parseInt(s.nextLine());
		System.out.println("1. ��ȭ��ȣ�� �Է��ϼ���!");
		tel = s.nextLine();
		System.out.println("2. �̸��� �Է��ϼ���!");
		name = s.nextLine();
		System.out.println("3. �ּҸ� �Է��ϼ���!");
		address = s.nextLine();
		switch (in) {
		case 1:
			System.out.println("4. �й��� �Է��ϼ���!");
			subin = s.nextLine();
			p = new Student(tel, name, address, subin);
			break;
		case 2:
			System.out.println("4. ������ �Է��ϼ���!");
			subin = s.nextLine();
			p = new Teacher(tel, name, address, subin);
			break;
		case 3:
			System.out.println("4. �μ��� �Է��ϼ���!");
			subin = s.nextLine();
			p = new Employee(tel, name, address, subin);
			break;
		default:
			System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
			return;
		}
		try{
			service.addPerson(p);
			System.out.println(p + " �� �߰��ƽ��ϴ�");
		}catch (DuplicateTelException e) {
			System.out.println(e.getMessage());
		}
	}

	private void deletePerson() {
		System.out.println("������ �������� ��ȭ��ȣ�� �Է��ϼ���");
		String in = s.nextLine();
		try {
			service.deletePersonByTel(in);
			System.out.println(in + " delete ok!");
		} catch (PersonNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

	private void findPerson() {
		System.out.println("�˻��� �������� ��ȭ��ȣ�� �Է��ϼ���");
		String in = s.nextLine();
		try {
			System.out.println(service.findPersonByTel(in) + " find ok!");;
		} catch (PersonNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private void printAll() {
		System.out.println("**��ü����������**");
		service.printAll();
	}
}