import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Kaç sayı girmek istersiniz?");
        int tempNum,numTot = inp.nextInt();

        int lowValue =Integer.MAX_VALUE,value = 0;

        for(int i = 1 ; i <= numTot ; i++){
            System.out.print("Sayı giriniz:");
            tempNum = inp.nextInt();
            if(tempNum > value) {
                value = tempNum;
            }
            else{
                if(tempNum<lowValue){
                    lowValue = tempNum;
                }
                else {
                    continue;
                }
            }
        }
        if(value>lowValue){
            System.out.println("En büyük sayı:"+value+"\nEn Küçük sayı:"+lowValue);
        }
        else {
            System.out.println("En büyük sayı:"+lowValue+"\nEn Küçük sayı:"+value);
        }
    }
}