
public class StringTest4 {
	
	static String array[]= {"IMF","제주도","자바도사","한글나라","Computer","모카","JAVA","인터넷탐색",
			"초롱초롱","come","바람","스크립터","군고구마","도서","their","country"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=== 정렬전 데이터 ===");
		for(String s : array)
			System.out.println(s+", ");
		System.out.println();
		System.out.println("=== 정렬후 데이터 ===");
		for(int i=0;i<array.length;i++) {
			for(int j =i+1;j<array.length;j++) { 
				if(array[i].compareTo(array[j])>0) { //compareTo로 비교할 경우 양수 음수 0 이 나오고 true는 1이다
					String t =array[i];
					array[i] = array[j];
					array[j] = t;
				}
			}
			System.out.println(array[i]+" ");
		}
	}

}