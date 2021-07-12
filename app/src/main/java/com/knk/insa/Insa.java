package com.knk.insa;

import java.util.Scanner;

public class Insa {


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Kwak kw = new Kwak();
    Nam nam = new Nam();
    Kim kim = new Kim();


    int sel = 7;
    while(true) {
      System.out.println("\n1.등록 2.조회 3.검색  4.수정 5. 삭제 6. 정렬 7.종료 >>> ");
      sel = Integer.parseInt(sc.nextLine());
      if(sel == 7) {
        System.out.println("프로그램을 종료합니다.");
        System.exit(1);
      }
      switch(sel) {
        case 1: 
          kw.insert();
          break;
        case 2:
          kim.select();
          break;
        case 3:
          kw.ser();
          break;
        case 4:
          nam.up();
          break;
        case 5:
          nam.del();
          break;
        case 6:
          kim.order();
          break;
        default:
          System.out.println("잘못된 번호를 입력하셨습니다.");
      }
    }

  }



}
