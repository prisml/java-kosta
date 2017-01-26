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
		System.out.println("*******학사관리프로그램을 시작합니다******");
		
		ui : while(true){
			System.out.println("1. 추가 2. 삭제 3. 검색 4. 전체회원보기 5.종료");
			int in = Integer.parseInt(s.nextLine());
			switch(in){
			case 1 : addPerson(); break;
			case 2 : deletePerson(); break;
			case 3 : findPerson(); break;
			case 4 : printAll(); break;
			case 5 : break ui;
			default : System.out.println("잘못 입력했습니다");
			}
		}
		System.out.println("프로그램을 종료합니다.");
		s.close();
	}

	public void addPerson(){
		String name, tel, address, subin;
		Person p;
		
		System.out.println("입력할 구성원의 종류를 선택하세요 1.학생  2.선생님 3.직원");
		int in = Integer.parseInt(s.nextLine());
		System.out.println("1. 전화번호를 입력하세요!");
		tel = s.nextLine();
		System.out.println("2. 이름을 입력하세요!");
		name = s.nextLine();
		System.out.println("3. 주소를 입력하세요!");
		address = s.nextLine();
		switch (in) {
		case 1:
			System.out.println("4. 학번을 입력하세요!");
			subin = s.nextLine();
			p = new Student(tel, name, address, subin);
			break;
		case 2:
			System.out.println("4. 과목을 입력하세요!");
			subin = s.nextLine();
			p = new Teacher(tel, name, address, subin);
			break;
		case 3:
			System.out.println("4. 부서를 입력하세요!");
			subin = s.nextLine();
			p = new Employee(tel, name, address, subin);
			break;
		default:
			System.out.println("잘못 입력 하셨습니다.");
			return;
		}
		try{
			service.addPerson(p);
			System.out.println(p + " 가 추가됐습니다");
		}catch (DuplicateTelException e) {
			System.out.println(e.getMessage());
		}
	}

	private void deletePerson() {
		System.out.println("삭제할 구성원의 전화번호를 입력하세요");
		String in = s.nextLine();
		try {
			service.deletePersonByTel(in);
			System.out.println(in + " delete ok!");
		} catch (PersonNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

	private void findPerson() {
		System.out.println("검색할 구성원의 전화번호를 입력하세요");
		String in = s.nextLine();
		try {
			System.out.println(service.findPersonByTel(in) + " find ok!");;
		} catch (PersonNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private void printAll() {
		System.out.println("**전체구성원보기**");
		service.printAll();
	}
}