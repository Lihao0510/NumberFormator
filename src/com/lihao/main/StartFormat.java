package com.lihao.main;

import java.util.Scanner;

public class StartFormat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true){
			String inputLine = sc.nextLine();
			if(inputLine.matches(Constants.NUM_FLOAT)){
				System.out.println(NumUtils.formatNum(inputLine));
			}else{
				System.out.println("输入不合法!请重新输入");
			}
		}
	}

}
