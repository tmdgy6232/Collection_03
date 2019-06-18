package com.biz.coll.list;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class List_04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random rnd = new Random();
		List<Integer> intList = new LinkedList<Integer>();
	
		
		int intNum =0;
		for(int i=0; i<50; i++) {
			int intR= rnd.nextInt(50);
			intList.add(intR);}
		

			//키보드에서 임의 숫자를 입력받고
			//그 숫자가 intlist에 몇번에 포함되어있는지 찾아보기
			System.out.println("숫자입력(0~49)까지");
			String strNum = scan.nextLine();
			intNum = Integer.valueOf(strNum);				
			
		int intLen = intList.size();
		for(int i =0; i < intLen; i++) {
			if(intList.get(i) == intNum) {
				System.out.println(i+"번째에서 찾았습니다.");
			}
		}
		int index = 0;
		int listSize = intList.size();
		
		for(Integer in : intList) {
			if(in == intNum) {
				System.out.println((index)+ "번째에 있음");
				break; //찾았으면 중단
			}
		}
		//못찾으면 인덱스 값은 리스트 사이즈보다 크다
		if(index > listSize) {
			System.out.println("값을 찾지 못함");
		}
	}

}
