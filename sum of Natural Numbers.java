class RecursionDemo{
  static int sum of Natural Numbers(int n){
   if(n==1){
      return 1;
	  }
	  else{
	  return n+factorial(n-1);
	  }
	}
	public static void main(String[] args){
	int number=10;
	int result=sum of Natural Numbers(number);
	System.out.println("sum of first"+number+"Natural Numbers is"+result);
	}	
}