package content;

import java.util.Scanner;
import Member.Customer;
import java.util.ArrayList;

/*1.

 

��ɾ �Է����ּ���: help 

 

add : ������ �߰�

 

read : ������ ��ȸ

 

update : ������ ����

 

delete : ������ ����*/

/*2.

 

��ɾ �Է����ּ���:(���) add(�Է�)

 

������ ���� �Է����ּ��� :(���) ������ �� (�Է�)

 

������ ���� ����Ǿ����ϴ�.(���)

 

���� add, exit ���� �ٸ� ���� �Է��ϸ� '�ùٸ� ��ɾ �Է����ּ���'(���)*/

/*3.

 

��ɾ �Է����ּ���: read (���)

 

  - �Է��ϸ� list�� ����� ������ ���.

 

���� add, read, exit ���� �ٸ� ���� �Է��ϸ� '�ùٸ� ��ɾ �Է����ּ���'(���)*/

/*4. 

 

3���� ȸ���� ������ּ���. ��ȸ���� ���̵�, ��й�ȣ, �̸��� �ο��ϰ� ������ּ���.*/

/*5.  

 * �������ִ� ȸ�� ������ �Ʒ� �Է¾��̵�� �Էº�й�ȣ�� �̿��� �α��� ����� �����.

     �Է¾��̵�� �Էº�й�ȣ�� ������ �ش� �������� �ִ��� ã�� ����.

     �Է¾��̵� list���� ���� ��ġ�ϴ� ���̵� ������ ��й�ȣ üũ ������ ���̵� �����ϴ� ���.

     ���̵� ������ ��й�ȣ üũ�ϴµ� ��й�ȣ�� �Էº�й�ȣ�� �ٸ��� ��й�ȣ�� Ʋ�Ƚ��ϴ� ���. 

     ������� ��������(�� �̸�)�� �ݰ����ϴ�! ���

����� "abc"���� ���ڿ��� ���� �� == �� ������ �ʰ� .equals() �޼��带 �̿��Ѵٴ� ��� ���� �ʴ´�. 

ex) "abc".equals("abc") --> ������ true, �ٸ��� false ����;*/

/*6.

 * ȸ���� ������ȸ��, �Ϲ�ȸ��, Ż��ȸ�� 3���� ������� ���������ϴ�.

 *  ���ÿ��� ȫ�浿�� ������, �������� �Ϲ�ȸ��, �̰����� Ż��ȸ������ ����ȭ���ּ���.

 *  ȸ������� ���߿� �Խ��� ����� �̿��� �� ����ȭ�� �� �� �ֽ��ϴ�.

 */

/*7. 
// �Ʒ� �䱸 ������ ������ �ּ���.

// 1. �Խù������ڸ� ����� �Խù� �ڵ带 �и�
// 2. �Խù� �׽�Ʈ�����͸� ������ִ� �ʱ�ȭ �޼���
// 3. �Խù� ��ȸ ���
// 4. �Խù� ��� ���
// 5. �Խù� ���� ���
// 6. �Խù� ���� ���

 */
public class content extends Customer{

		//ArrayList<Member> listB = new ArrayList<Member>();	//������ȸ��

		//Member[] members = new Member[3];			
		
		Customer c = new Customer();
		c.customer_flow();
		//c.m.id, c.m.pw,~~
		
		while(true) {

			System.out.print("��ɾ �Է����ּ���: ");

			Scanner scan = new Scanner(System.in);			
			String command = scan.next();

			if(command.equals("help")) {

				System.out.println("add : ������ �߰�");

				System.out.println("read : ��ü������ ��ȸ");				

				System.out.println("readByIndex : Ư�������� ��ȸ");				

				System.out.println("login : �α���");				

				System.out.println("update : ������ ����");

				System.out.println("delete : ������ ����");				

				System.out.println("exit: ������");

			}

			else if(command.equals("add")) {
				
				System.out.println("1�� : �Ϲ�ȸ��");

				System.out.println("2�� : ������ȸ��");				

				System.out.println("3�� : Ż��ȸ��");

				
				System.out.print("����� ȸ���� ��ȣ�� �Է����ּ���: ");

				Scanner scann = new Scanner(System.in);			

				String commandd = scann.next();

				if(commandd.equals("1��")) {

					Member mem1 = new Member();

					System.out.print("���̵��� �Է����ּ��� : ");
					mem1.id = scann.next();

					System.out.print("��й�ȣ�� �Է����ּ��� : ");
					mem1.pw = scann.next();

					System.out.print("�̸��� �Է����ּ��� : ");
					mem1.name = scann.next();

					System.out.print("������ �Է����ּ��� : ");
					mem1.gen = scann.next();

					System.out.print("��������� �Է����ּ��� : ");
					mem1.birth = scann.next();

					System.out.print("�������� �Է����ּ��� : ");
					mem1.blood = scann.next();

					System.out.print("�ڱ�Ұ��� �Է����ּ��� : ");
					mem1.self = scann.next();

					manager.add(mem1);

				}

				else if(commandd.equals("2��")) {

					Member mem2 = new Member();

					System.out.print("���̵��� �Է����ּ��� : ");
					mem2.id = scann.next();
					
					System.out.print("��й�ȣ�� �Է����ּ��� : ");
					mem2.pw = scann.next();

					System.out.print("�̸��� �Է����ּ��� : ");
					mem2.name = scann.next();

					System.out.print("������ �Է����ּ��� : ");
					mem2.gen = scann.next();
						
					System.out.print("��������� �Է����ּ��� : ");
					mem2.birth = scann.next();					

					System.out.print("�������� �Է����ּ��� : ");
					mem2.blood = scann.next();

					System.out.print("�ڱ�Ұ��� �Է����ּ��� : ");
					mem2.self = scann.next();

					listB.add(mem2);

				}

				else if(commandd.equals("3��")) {

					Member mem3 = new Member();
					
					System.out.print("���̵��� �Է����ּ��� : ");
					mem3.id = scann.next();

					

					System.out.print("��й�ȣ�� �Է����ּ��� : ");
					mem3.pw = scann.next();

					

					System.out.print("�̸��� �Է����ּ��� : ");
					mem3.name = scann.next();

					

					System.out.print("������ �Է����ּ��� : ");
					mem3.gen = scann.next();
								
					System.out.print("��������� �Է����ּ��� : ");
					mem3.birth = scann.next();

					System.out.print("�������� �Է����ּ��� : ");
					mem3.blood = scann.next();			

					System.out.print("�ڱ�Ұ��� �Է����ּ��� : ");
					mem3.self = scann.next();

					listC.add(mem3);

					System.out.println("");

				}

			}

			else if(command.equals("read")) {

				System.out.println("1�� : �Ϲ�ȸ��");

				System.out.println("2�� : ������ȸ��");				

				System.out.println("3�� : Ż��ȸ��");

				

				System.out.print("��ü �����͸� ��ȸ�� ȸ���� ��ȣ�� �Է����ּ���: ");

				Scanner scanne = new Scanner(System.in);			
				String commanddd = scanne.next();

				if(commanddd.equals("1��")) {

					for(Member mem1 : manager) 

					  {  

						  System.out.println("========================");

						  System.out.println("ȸ�� ����:" + mem1.gen);

						  System.out.println("ȸ�� �������:" + mem1.birth);

						  System.out.println("ȸ�� ������:" + mem1.blood);

						  System.out.println("ȸ�� �ڱ�Ұ�:" + mem1.self);

						  System.out.println("========================");

						  System.out.println("");

					  }		

				}

				else if(commanddd.equals("2��")) {

					for(Member mem2 : listB) 

					  {  

						  System.out.println("========================");

						  System.out.println("ȸ�� ����:" + mem2.gen);

						  System.out.println("ȸ�� �������:" + mem2.birth);

						  System.out.println("ȸ�� ������:" + mem2.blood);

						  System.out.println("ȸ�� �ڱ�Ұ�:" + mem2.self);

						  System.out.println("========================");

						  System.out.println("");

					  }		

				}

				else if(commanddd.equals("3��")) {

					for(Member mem3 : listC) 

					  {  

						  System.out.println("========================");

						  System.out.println("ȸ�� ����:" + mem3.gen);

						  System.out.println("ȸ�� �������:" + mem3.birth);

						  System.out.println("ȸ�� ������:" + mem3.blood);

						  System.out.println("ȸ�� �ڱ�Ұ�:" + mem3.self);

						  System.out.println("========================");

						  System.out.println("");

					  }		

				}

				System.out.println("");		 

			}
		

			else if(command.equals("readByIndex")) {

				System.out.println("1�� : �Ϲ�ȸ��");

				System.out.println("2�� : ������ȸ��");				

				System.out.println("3�� : Ż��ȸ��");

				System.out.print("��ȸ�� ȸ���� ��ȣ�� �Է����ּ���: ");

				Scanner scanner = new Scanner(System.in);			

				String commandddd = scanner.next();

				

				if(commandddd.equals("1��")) {

					System.out.println("������� ȸ���� ��ȣ�� �Է����ּ���.");

					int index = scan.nextInt();

					System.out.println("========================");

					System.out.println("ȸ��" + index + "����" + "����: " + manager.get(index).gen);

					System.out.println("ȸ��" + index + "����" + "�������: " + manager.get(index).birth);

					System.out.println("ȸ��" + index + "����" + "������: " + manager.get(index).blood);

					System.out.println("ȸ��" + index + "����" + "�ڱ�Ұ�: " + manager.get(index).self);

					System.out.println("========================");

				}
			}

			

			else if(command.equals("login")) {	

				System.out.println("1�� : �Ϲ�ȸ��");

				System.out.println("2�� : ������ȸ��");				

				System.out.println("3�� : Ż��ȸ��");

				System.out.print("��� ���� �α������� �Է����ּ���: ");

				Scanner scannerr = new Scanner(System.in);			

				String commanddddd = scannerr.next();
	

				if(commanddddd.equals("1��")) {
					System.out.println("�α����� ���ּ���.");

					  System.out.print("ID : "); 
					  String id = scannerr.next();

					  System.out.print("PW : "); 
					  String pw = scannerr.next(); 

					  int isExistId = 0;

					  for(int i=0; i < manager.size(); i++) { 

						  if(id.equals(manager.get(i).id)) {

							  isExistId = 1; 

							  if(pw.contentEquals(manager.get(i).pw)) {

								  System.out.println(manager.get(i).name + "�� �ݰ����ϴ�!"); 

								  break; 

							  } 

							  else {

								  System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");

								  break; 

							  } 

						  }	 

					}


					  if(isExistId == 0) { 

						  System.out.println("���� ���̵��Դϴ�."); 

					}

				}

				

				else if(commanddddd.equals("2��")) {

					System.out.println("�α����� ���ּ���.");

					
					System.out.print("ID : ");
					String id = scannerr.next();
				

					System.out.print("PW : ");
					String pw = scannerr.next();

					int isExistId = 0;

					for(int i=0; i < listB.size(); i++)

					{

						if(id.equals(listB.get(i).id)) {

							isExistId = 1;

							if(pw.contentEquals(listB.get(i).pw)) {

								System.out.println(listB.get(i).name + "�� �ݰ����ϴ�!");

								break;

							}

							else {

								System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");

								break;

							}

						}

					}


					if(isExistId == 0) {

						System.out.println("���� ���̵��Դϴ�.");

					}

				}


				else if(commanddddd.equals("3��")) {

					System.out.println("�α����� ���ּ���.");
			

					System.out.print("ID : ");
					String id = scannerr.next();					

					System.out.print("PW : ");
					String pw = scannerr.next();

					int isExistId = 0;
				

					for(int i=0; i < listC.size(); i++)

					{

						if(id.equals(listC.get(i).id)) {

							isExistId = 1;

							if(pw.contentEquals(listC.get(i).pw)) {

								System.out.println(listC.get(i).name + "�� �ݰ����ϴ�!");

								break;

							}

							else {

								System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");

								break;

							}

						}

					}

					

					if(isExistId == 0) {

						System.out.println("���� ���̵��Դϴ�.");

					}

				}

				System.out.println("");

			}

			

			else if(command.equals("exit")) {

				System.out.println("���α׷��� �����մϴ�.");

				

				break;

			}
			

			else {

				System.out.println("�ùٸ� ��ɾ �Է����ּ���.");

 

			}			

		}

	}
	}

/*
 * class Contents extends content{
 * 
 * 
 * String id; //���̵� String pw; //��й�ȣ
 * 
 * String name; //�̸� String gen; //���� String birth; //������� String blood; //������
 * String self; //�ڱ�Ұ�
 * 
 * } }
 */