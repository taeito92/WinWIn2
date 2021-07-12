package com.knk.insa;

import java.util.Scanner;

public class Insa implements InsaM {


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Kwak kw = new Kwak();
    int sel = 9;
    while(true) {
      System.out.println("\n1.투숙 2.퇴실 3.map 9.종료 >>> ");
      sel = Integer.parseInt(sc.nextLine());
      if(sel == 9) {
        System.out.println("호텔 예약 프로그램을 종료합니다.");
        System.exit(1);
      }
      switch(sel) {
        case 1: 
          kw.insert();
          break;
        case 2:
          select();
          break;
        case 3:
          ser();
          break;
        case 4:
          up();
          break;
        case 5:
          del();
          break;
        case 6:
          order();
          break;
        default:
          System.out.println("잘못된 번호를 입력하셨습니다.");
      }
    }

  }

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
