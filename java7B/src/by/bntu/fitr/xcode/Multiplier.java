package by.bntu.fitr.xcode;

public class Multiplier {
	 public static Matrix multiple(Matrix m1, Matrix m2){
		 int[] maxnums = maxElms(m2);
		 for(int i = 0; i<m1.getLength(); i++){
			 for(int j = 0; j<m1.getLength(); j++){
				 m1.getElm(i, j, m1.giveElm(i, j) * maxnums[i]);
			 }
		 }
		 return m1;
	 }
	 
	 public static int[] maxElms(Matrix m){
		 int[] maxArr = new int[m.getLength()];
		 int maxNum;
		 for(int i = 0; i<m.getLength(); i++){
			 maxNum = 0;
			 for(int j = 0; j<m.getLength(); j++){
				 if(maxNum < m.giveElm(i, j)){
					 maxNum = m.giveElm(i, j);
				 }
			 }
			 maxArr[i] = maxNum;
		 }
		 return maxArr;
	 }
}
