import java.util.Scanner;

public class BTTrang74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("nhap vao n phan tu: ");
            n = sc.nextInt();
        }while(n <0);
        int arr[] = new int[n];
        System.out.println("nhap cac phan tu cho mang: ");
        for(int i=0; i<n; i++){
            System.out.println("nhap phan tu thu " + i );
            arr[i] = sc.nextInt();
        }
        int tong =0;
        for(int i=0; i<n; i++){
            if(arr[i]%2==0){
                tong+=arr[i];            }
        }
        System.out.println("Tong la: " + tong);
        
        sc.close();
    }
}
