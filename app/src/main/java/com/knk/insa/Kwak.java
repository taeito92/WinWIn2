package com.knk.insa;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Kwak implements InsaM {
  Connection CN = null; 
  Statement ST = null; 
  ResultSet RS = null; 
  String msg = "isud=crud쿼리문기술";
  Scanner sc = new Scanner(System.in);


  public void insert() {
    try {
      // 두번째 키보드에서 데이터를 입력
      int a = -1;
      while(a>10000 || a < 0) {
        System.out.print("\n사번입력(4자릿수)>>>"); 
        a = Integer.parseInt(sc.nextLine());
        if (a>10000 || a < 0)
          System.out.println("다시입력하세요");
      }
      System.out.print("이름입력>>>"); 
      String b = sc.nextLine();
      System.out.print("직급입력>>>"); 
      String c = sc.nextLine();
      System.out.print("연봉입력>>>"); 
      int d = sc.nextInt();
      System.out.print("부서입력>>>"); 
      String e = sc.nextLine();
      System.out.print("전화번호입력>>>"); 
      int f = sc.nextInt();

      // 3번째 쿼리문 완성
      msg = "insert into test(code,name,title,wdate,cnt) values("+a+", '"+b+"', '"+c+"', sysdate, 0)";
      System.out.println(msg);
      int OK = ST.executeUpdate(msg);
      if (OK>0) {
        System.out.println(a+" 코드 데이터 저장성공했습니다.");
      } else {System.out.println(a+" 코드 데이터 저장 실패했습니다.");}
    } catch(Exception ex) { }

  }

  public void ser() {
    // TODO Auto-generated method stub

  }

  @Override
  public void select() {
    // TODO Auto-generated method stub

  }

  @Override
  public void up() {
    // TODO Auto-generated method stub

  }

  @Override
  public void del() {
    // TODO Auto-generated method stub

  }

  @Override
  public void order() {
    // TODO Auto-generated method stub

  }

}
