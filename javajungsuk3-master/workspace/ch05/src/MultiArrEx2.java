////5-21
//import java.util.*;
//
//class MultiArrEx2 {
//	public static void main(String[] args) {
//		// example();
//
//		// 3x3 배열에 다음처럼 초기값을 할당하고 출력해서 증명하시오.
//		// [1,2,3]
//		// [4,5,6]
//		// [7,8,9]
//		int[][] num = new int[6][6];
//		int k=0;
//		int i,j;
//		
////		for (i = 0; i < 3; i++) {
////			System.out.println();
////			for (j = 0; j < 3; j++) {
////				num[i][j] = i * 2 + (j + i + 1);
////				System.out.print(num[i][j] + " ");
////			}
////
////		}
////		System.out.println("");
////		System.out.println("==================");
////	}
////}
//		// 3x3 배열에 다음처럼 초기값을 할당하고 출력해서 증명하시오.
//		// [1,2,3]
//		// [6,5,4]
//		// [7,8,9]
//	
//		for (i = 0; i < 6; i++) {
//			if (i % 2 == 1) {
//				for (j = 5; j >= 0; j--) {
//					k++;
//					num[i][j] = k;
//				}
//
//			} else {
//				for (j = 0; j < 6; j++) {
//					k++;
//					num[i][j] = k;
//				}
//			}
//		}
//		for (i = 0; i < 6; i++) {
//
//			for (j = 0; j < 6; j++) {
//
//				System.out.printf("%d ", num[i][j]);
//			}
//			System.out.println();
//		}
//		System.out.println();
//	}
//}
//		
////		int n=3; //각 회전에서 수행할 수행횟수가 지정될 변수(5,4,3,2,1 로 변경됨)
////        int sw=1; //(+1)행과 열의 증가 , (-1)행과 열의 감소
////        int i=1,j=0;
////        
////        do{        
////            for(int p=1;p<=3;p++){ // 시작은 1~5            
////                k=k+1;
////                j=j+sw; //행고정 열변화
////                num[i][j] = k;                               
////            }          
////            n=n-1;
////           
////            if(n>0){               
////                for(int p=1;p<=3;p++){             
////                    k=k+1;
////                    i=i+sw; //열고정 행변화
////                    num[i][j] = k;                               
////                }              
////                sw = sw*(-1); // 스위칭             
////            }else{             
////                break; //반복문 빠져나감.
////            }          
////        }while(true);
////        
////        for (i = 0; i < 3; i++) {
////        	for (j = 0; j < 3; j++) {
////        		System.out.printf("%d ", num[i][j]);
////        	}
////        		System.out.println();
////        }
////        System.out.println();
////	}
////}
//
//
////	private static void example() {
////		// TODO Auto-generated method stub
////		final int SIZE = 5;
////		int x = 0 , y = 0;
////		int num = 0;
////
////		int[][] bingo = new int[SIZE][SIZE];
////		Scanner scanner = new Scanner(System.in);
////
////		// 배열의 모든 요소를 1부터 SIZE*SIZE까지의 숫자로 초기화
////		for(int i=0;i<SIZE;i++) {
////			for(int j=0;j<SIZE;j++) {
////				
////				bingo[i][j] = i*SIZE + j + 1;
////			}
////		}
////		
////		print(bingo);
////		
////		// 배열에 저장된 값을 뒤섞는다.(shuffle)
////		for(int i=0;i<SIZE;i++) {
////			for(int j=0;j<SIZE;j++) {
////				x = (int)(Math.random() * SIZE);
////				y = (int)(Math.random() * SIZE);
////
////				// bingo[i][j]와 임의로 선택된 값(bingo[x][y])을 바꾼다.
////				int tmp =  bingo[i][j];
////				bingo[i][j] = bingo[x][y];
////				bingo[x][y] = tmp;
////			}
////		}
////
////		do {
////			for(int i=0;i<SIZE;i++) {
////				for(int j=0;j<SIZE;j++)
////					System.out.printf("%2d ", bingo[i][j]);	
////				System.out.println();
////			}
////			System.out.println();
////		
////			System.out.printf("1~%d의 숫자를 입력하세요.(종료:0)>", SIZE*SIZE);
////			String tmp = scanner.nextLine(); // 화면에서 입력받은 내용을 tmp에 저장
////			num = Integer.parseInt(tmp);     // 입력받은 문자열(tmp)를 숫자로 변환
////
////			// 입력받은 숫자와 같은 숫자가 저장된 요소를 찾아서 0을 저장
////			outer:
////			for(int i=0;i<SIZE;i++) {
////				for(int j=0;j<SIZE;j++) {
////					if(bingo[i][j]==num) {
////						bingo[i][j] = 0;
////						break outer; // 2중 반복문을 벗어난다.
////					}
////				}
////			}
////		} while(num!=0); 
////	} // main의 끝
////
////	private static void print(int[][] bingo) {
////		// TODO Auto-generated method stub
////		for (int[] row : bingo) {
////			
////			System.out.println(Arrays.toString(row));
////		}
////	}
////}
