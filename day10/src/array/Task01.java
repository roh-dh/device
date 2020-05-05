package array;


public class Task01 {
	public static void main(String[] args) {

				/*
				 * 다음 데이터를 배열에 저장하고 주어진 문제에 맞게 위치를 조작하여 출력
				 * 
				 * 자바, 자바스크립트, 파이썬, 루비, C# 데이터의 순서를 거꾸로 바꾸어 출력(데이터 개수가 달라져도 처리)
				 * 
				 * 데이터의 순서를 무작위로 바꾸어 출력
				 * 
				 * 모든 자리가 자기자신을 제외한 다른 자리와 한번 이상 바뀌어야 합니다
				 */

/*	데이터갯수	왼	쪽오른쪽	반복횟수

		2		data[0]	data[1]		1
		3		data[0]	data[2]		1		

		4		data[0]	data[3]		2
				data[1]	data[2]

		5		data[0]	data[4]		2
				data[1]	data[3]

		6		data[0]	data[5]		3
				data[1]	data[4]
				data[2]	data[3]
				data[i]	갯수-1-i	2/데이터갯수


				자바, 자바스크립트, 파이썬
				int tmp =0;
				없어지는걸 막기위해 tmp에다가 먼저 파이썬을 옮겨놔야됨
				tmp = data[data.length-1-i] */

				String[] data = new String[] {"자바", "자바스크립트", "파이썬", "루비", "C#",/*"갯수가","바뀌어도적용","실험"*/};
				
				for(int i=0; i<(data.length/2);i++) {
					String tmp =data[i];
					data[i] = data[data.length-(i+1)];
					data[data.length-(i+1)]=tmp;
				}
				for(int i=0; i<data.length;i++) {
						System.out.println(data[i]);
				}
				
				
			}
			
		}

