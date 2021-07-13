package com.knk.insa;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Nam implements InsaM {
  Connection CN = null; 
  Statement ST = null; 
  ResultSet RS = null; 
  String msg = "isud=crud쿼리문기술";
  Scanner sc = new Scanner(System.in);


  @Override
  public void insert() {
    // TODO Auto-generated method stub

  }

  @Override
  public void select() {
    // TODO Auto-generated method stub

  }

  @Override
  public void ser() {
    // TODO Auto-generated method stub

  }

  @Override
  public void up() {
    System.out.println(" [정보 수정] ");

    System.out.print(" 수정하실 사번 입력 : " );
    int unum = Integer.parseInt(sc.nextLine());
    if(unum > 9999 || unum < 0 ) {
      System.out.println(" 잘못 입력하셨습니다.");
      return;
    }
    System.out.println("------------------------------");
    System.out.print(" 이름을 변경하시겠습니까? (y/N) ");
    if(!sc.nextLine().equals("y")) {
      System.out.println(" 이름변경 하지 않겠습니다.");

    } else {
      System.out.println("------------------------------");
      System.out.print(" 변경할 이름을 입력하세요 : ");
      String uname = sc.nextLine();
      System.out.printf( " %d번  %s 변경완료\n " , unum, uname );

    }

    System.out.println("");
    System.out.println("------------------------------");
    System.out.print(" 직급을 변경하시겠습니까? (y/N) ");
    if(!sc.nextLine().equals("y")) {
      System.out.println(" 직급변동 없음 ");

    } else {
      System.out.println("------------------------------");
      System.out.print("변경할 직급 입력 : ");
      String uJg = sc.nextLine();
      System.out.println(uJg +"로 직급이 변경");
    }

    System.out.println("");
    System.out.println("------------------------------");
    System.out.print(" 연봉을 변경하시겠습니까? (y/N) ");
    if(!sc.nextLine().equals("y")) {
      System.out.println(" 급여변동 없음 ");

    } else {
      System.out.println("------------------------------");
      System.out.print(" 변경할 연봉 입력 : ");
      int upay = Integer.parseInt(sc.nextLine());
      System.out.printf(" 연봉 %d 만원으로 변경 " , upay);
    }
    System.out.println("");
    System.out.println("------------------------------");
    System.out.print(" 부서를 변경하시겠습니까? (y/N) ");
    if(!sc.nextLine().equals("y")) {
      System.out.println(" 부서 변동 없음 ");

    } else {
      System.out.println("");
      System.out.println("------------------------------");
      System.out.print(" 변경할 부서 입력 : ");
      String uDp = sc.nextLine();
      System.out.printf( " %s 로 이동 " , uDp);
    }

    System.out.println("");
    System.out.println("------------------------------");
    System.out.print(" 연락처를 변경하시겠습니까? (y/N) ");
    if(!sc.nextLine().equals("y")) {
      System.out.println(" 기존 연락처 유지");
    } else {
      System.out.println("------------------------------");
      System.out.print(" 변경된 연락처 : ");
      String uPhone = sc.nextLine();
      System.out.printf("%d 변경완료 " , uPhone);
    }



  }


  // TODO Auto-generated method stub



  @Override
  public void del() {
    // TODO Auto-generated method stub

  }

  @Override
  public void order() {
    // TODO Auto-generated method stub

  }

}
