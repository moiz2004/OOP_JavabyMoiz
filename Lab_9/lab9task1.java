class lab9task1{
	
static String ReverseString(String str){
	
String rev="";
	for(int i=str.length()-1;i>=0;i--){

rev=rev+str.charAt(i);
	}
	return rev;
}

public static void main(String[]args){
	

System.out.println(ReverseString("hello"));






}




}