////5-21
//import java.util.*;
//
//class MultiArrEx2 {
//	public static void main(String[] args) {
//		// example();
//
//		// 3x3 �迭�� ����ó�� �ʱⰪ�� �Ҵ��ϰ� ����ؼ� �����Ͻÿ�.
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
//		// 3x3 �迭�� ����ó�� �ʱⰪ�� �Ҵ��ϰ� ����ؼ� �����Ͻÿ�.
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
////		int n=3; //�� ȸ������ ������ ����Ƚ���� ������ ����(5,4,3,2,1 �� �����)
////        int sw=1; //(+1)��� ���� ���� , (-1)��� ���� ����
////        int i=1,j=0;
////        
////        do{        
////            for(int p=1;p<=3;p++){ // ������ 1~5            
////                k=k+1;
////                j=j+sw; //����� ����ȭ
////                num[i][j] = k;                               
////            }          
////            n=n-1;
////           
////            if(n>0){               
////                for(int p=1;p<=3;p++){             
////                    k=k+1;
////                    i=i+sw; //������ �ຯȭ
////                    num[i][j] = k;                               
////                }              
////                sw = sw*(-1); // ����Ī             
////            }else{             
////                break; //�ݺ��� ��������.
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
////		// �迭�� ��� ��Ҹ� 1���� SIZE*SIZE������ ���ڷ� �ʱ�ȭ
////		for(int i=0;i<SIZE;i++) {
////			for(int j=0;j<SIZE;j++) {
////				
////				bingo[i][j] = i*SIZE + j + 1;
////			}
////		}
////		
////		print(bingo);
////		
////		// �迭�� ����� ���� �ڼ��´�.(shuffle)
////		for(int i=0;i<SIZE;i++) {
////			for(int j=0;j<SIZE;j++) {
////				x = (int)(Math.random() * SIZE);
////				y = (int)(Math.random() * SIZE);
////
////				// bingo[i][j]�� ���Ƿ� ���õ� ��(bingo[x][y])�� �ٲ۴�.
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
////			System.out.printf("1~%d�� ���ڸ� �Է��ϼ���.(����:0)>", SIZE*SIZE);
////			String tmp = scanner.nextLine(); // ȭ�鿡�� �Է¹��� ������ tmp�� ����
////			num = Integer.parseInt(tmp);     // �Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ
////
////			// �Է¹��� ���ڿ� ���� ���ڰ� ����� ��Ҹ� ã�Ƽ� 0�� ����
////			outer:
////			for(int i=0;i<SIZE;i++) {
////				for(int j=0;j<SIZE;j++) {
////					if(bingo[i][j]==num) {
////						bingo[i][j] = 0;
////						break outer; // 2�� �ݺ����� �����.
////					}
////				}
////			}
////		} while(num!=0); 
////	} // main�� ��
////
////	private static void print(int[][] bingo) {
////		// TODO Auto-generated method stub
////		for (int[] row : bingo) {
////			
////			System.out.println(Arrays.toString(row));
////		}
////	}
////}
