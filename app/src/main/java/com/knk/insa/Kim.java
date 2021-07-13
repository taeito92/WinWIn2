package com.knk.insa;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Kim implements InsaM {
  Connection CN = null; 
  Statement ST = null; 
  ResultSet RS = null; 
  String msg = "";
  Scanner sc = new Scanner(System.in);

  @Override
  public void insert() {
    // TODO Auto-generated method stub

  }



  @Override
  public void select() {
    try {
      System.out.println("조회 기준을 선택하세요. 1.이름 2.사번");
      int sel = 3;
      sel = Integer.parseInt(sc.nextLine());
      if(sel==1) {
        System.out.println();
        System.out.println("이름 기준으로 조회 완료되었습니다.");
      }else if(sel==2) {
        System.out.println("사번 기준으로 조회 완료되었습니다.");
      }else { System.out.println("잘못된 명령어입니다.");

      }
      ST = CN.createStatement();
      msg = "select * from HR";

      System.out.println("조회 완료되었습니다.");


    } catch (Exception e) {}

  }

  @Override
  public void ser() {
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
    try {  

      System.out.println("정렬 기준을 선택하세요. 1.이름 2.사번");
      int od = 3; 
      od = Integer.parseInt(sc.nextLine());
      if (od == 1 ) {
        System.out.println("정렬 방법을 선택하세요. 1.오름차순 2.내림차순");
        od = Integer.parseInt(sc.nextLine());
        msg ="select  * from  HR  order by Name";
        System.out.println();

        System.out.println("오름차순으로 정렬되었습니다.");
      }else if (od ==2) {
        System.out.println("정렬 방법을 선택하세요. 1.오름차순 2.내림차순");
        od = Integer.parseInt(sc.nextLine());
        msg ="select  * from  HR  order by desc Name";
        System.out.println();

        System.out.println("내림차순으로 정렬되었습니다.");
      } else {System.out.println("잘못된 명령어입니다.");}
    } catch (Exception e) { }

  }


}// END
