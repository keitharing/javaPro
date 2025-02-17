//package days06;
//
//public class wha_days06 {
//	public static void main(String[] args) {
////		- 로또번호를 6개 중복안되게 출력하기
//					int index = 0, n;
//					int [] lotto = new int[6];
//					lotto[index++] = (int)(Math.random()*45)+1;
//					
//						while ( index <= 5 ) {
//							n = (int)(Math.random()*45)+1;
//							boolean flag = false;
//							for (int i = 0; i < index; i++) {
//								if( lotto[i] == n ) {
//									System.out.println("*");
//									flag = true;
//									break;
//								}
//							}
//							
//							if(!flag)lotto[index++] = n;
//							
//						}//while
//			
//					System.out.println(Arrays.toString(lotto));
//
//			}
//		}
//
//
////		- 1~10 홀수의 합 while문 사용			
//					int sum = 0, i = 1;
//					while (i<=10) {
//						System.out.printf("%d+", i);
//						sum += i;
//						i+=2;
//					}
//					System.out.printf("\b=%d\n", sum);
//			}
//		}
//
////		- 1~10홀수의 합 for문 사용
//		int sum = 0;
//				for (int i = 1; i <= 10 ; i++) {
//					if( i % 2 != 0) {
//						System.out.printf("%d+", i);
//						sum += i;
//					} // if
//				} // for i
//				System.out.printf("\b=%d\n", sum);
//
////		- 1~10 홀수의 합 countinue 사용
//		int sum = 0;
//				for (int i = 1; i <= 10 ; i++) {
//					if( i % 2 == 0)   continue;
//					System.out.printf("%d+", i);
//					sum += i;
//				} // for i
//				System.out.printf("\b=%d\n", sum);
//
//
////		- [암기] 람다식와 스트림
//		new Random().ints(1, 46).distinct().limit(6)
//				   .forEach(System.out::println);
//
////		- for 1~n의합
//		int sum = 0, n;
//				Scanner scanner = new Scanner(System.in);
//				System.out.print("> 양의 정수(n) 입력 ? ");
//				n = scanner.nextInt();		
//				for (int i = 1; i <= n ; i++) {
//					System.out.printf("%d+", i);
//					sum += i;
//				} // for i
//				System.out.printf("\b=%d\n", sum);
//
////		- while 1~n의합
//		int sum = 0, n, i = 1;
//				Scanner scanner = new Scanner(System.in);
//				System.out.print("> 양의 정수(n) 입력 ? ");
//				n = scanner.nextInt();			
//				if(  n < 1  ) {
//					System.out.println("[알림] 양의 정수만 입력!!!");
//					return;
//				}		
//				while ( i <= n ) {
//					System.out.printf("%d+", i);
//					sum += i++;
//				} // while		
//				System.out.printf("\b=%d\n", sum);
//				
//				// 12:02 수업시작
//			} // main
//
//		} // class
//
////		- for문 두정수(n, m)을 입력받아서 두 정수 사이의 합을 출력.
//					   int n, m ;
//					Scanner scanner = new Scanner(System.in);
//					System.out.print("> 양의 정수( n m ) 입력 ? ");
//					n = scanner.nextInt();
//					m = scanner.nextInt();	
//					
//					int sum = 0;
//
//					int min = n > m ? m : n ; 
//					int max = Math.max(n, m);
//					
//					for (int i = min; i <= max ; i++) {
//						System.out.printf("%d+", i);
//						sum += i;
//					}
//					
//					
//					System.out.printf("\b=%d\n", sum);
//					
//			}
//		}
////		- [for/while] 두 정수(n, m)을 입력받아서 두 정수 사이의 홀수의 합을 출력.
//					int n, m ;
//					Scanner scanner = new Scanner(System.in);
//					System.out.print("> 양의 정수( n m ) 입력 ? ");
//					n = scanner.nextInt();
//					m = scanner.nextInt();	
//					
//					int sum = 0;
//					 
//					int min = n > m ? m : n ; 
//					int max = Math.max(n, m);
//					
//					if( min % 2 == 0 ) min++;
//					
//					
//					while( min <= max) { 
//						  System.out.printf("%d+", min);
//						  sum += min;
//						min+=2;
//					} 
//					
//					
//					System.out.printf("\b=%d\n", sum);
//					
//			}
//		}
////		- 세 정수를 입력받아서 세 정수 중에 가장 큰 값, 가장 작은 값을 구해서 출력.
//
////		- [문제]  한 라인에 10개의 ASCII 문자를 출력, 5줄나오고 엔터 하게 하기
//		Scanner scanner = new Scanner(System.in);
//				
//				for (int i = 0, lineNumber = 1; i < 256; i++) {
//					if(i%10==0) System.out.printf("%d :", lineNumber);	
//					System.out.printf("[%c]", (char)i);
//					if(i%10==9) {
//						System.out.println();
//						if( lineNumber%5 ==0 ) {
//							System.out.println("\t 계속하려면 엔터치세요..");
//							scanner.nextLine();
//						} // if
//						 lineNumber++;
//					} // if
//				} // for i
//			}
//			
//		}
//		
//	}//main
//}//class
