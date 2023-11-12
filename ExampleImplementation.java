//問題6
package app06.com.test;

public class ExampleImplementation implements Management {

	
     @Override
     public void manage() {
         System.out.println("manage()メソッドの実装...");
         
 }


 public class Main {
     public static void main(String[] args) {
         //ExampleImplementation クラスのオブジェクトの作成
         ExampleImplementation example = new ExampleImplementation();

         // インターフェイスからの Manageメソッドの使用
         example.manage();
     }
 }
 }

