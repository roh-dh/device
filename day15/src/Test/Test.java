package Test;

	

	import java.util.Scanner;

	public class Test {
	

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	int [] arr = new int[5];

	int tmp = 0;

	for(int i=0;i<arr.length;i++)

	{

	System.out.print(i+1+"번째 정수 입력 : ");

	arr[i] = sc.nextInt();

	}

	for(int i=0;i<arr.length-1;i++)

	{

	for(int j=0;j<(arr.length-1)-i;j++)

	{

	if(arr[j]>arr[j+1])

	{

	tmp = arr[j];

	arr[j] = arr[j+1];

	arr[j+1] = tmp;

	}

	}

	}

	System.out.print("정렬된 결과 : ");

	for(int i=0;i<arr.length;i++)

	{

	System.out.print(arr[i]+" ");

	}

	System.out.println("");

	System.out.println("정렬 후 첫번째 수와 마지막수의 합 : " + (arr[0] + arr[arr.length-1]));

	}

	}

