package gitpractice;

import java.util.*;
import java.io.*;

public class Manage_Contacts {
	
	static int cnum=0;
	
	public void create_contact(){
		//name,phonenum,email 입력후 create_cnum, store_write함수호출
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("name: ");
		String name = scanner.nextLine();
		System.out.print("phone number: ");
		String phone_num = scanner.nextLine();
		System.out.print("email: ");
		String email = scanner.nextLine();
		
		String personal_info = name+"\t"+phone_num+"\t"+email;
		int contact_id = create_cnum();
		
		HashMap<Integer,String> contactMap = new HashMap<Integer,String>();
		contactMap.put(contact_id, personal_info);
		
		//store.store_write(contact_id);
		
		
	}
	public int create_cnum(){
		cnum++;
		return cnum;
	}
	public void view_contacts(){
		//store_read 호출후 전체 출력
	}
	public int contact_choice(){
		//contact 선택후 cnum리턴
		return cnum;	
	}
	public void update_contact(int cnum){
		//cnum에 해당하는 contact의 name,phonenumber,email 재입력 후 store_write함수호출
	}
	public void delete_contact(int cnum){
		//cnum에 해당하는 contact 삭제후 store_write 함수 호출 
	}

}
