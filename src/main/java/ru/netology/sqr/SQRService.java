package ru.netology.sqr;

public class SQRService {
    public int calcSQR(int leftBound, int rightBound){
      int maxNumber = 99;
      int count = 0;
      for(int i = 10; i <= maxNumber; i++){
          if (i * i >= leftBound && i * i <= rightBound){
              count++;
          }
      }

       return count;
    }

}
