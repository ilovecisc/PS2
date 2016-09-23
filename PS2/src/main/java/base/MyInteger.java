package base;
import java.util.Scanner;

public class MyInteger {

	private int iValue;
	public boolean isEven(){
		if (iValue%2==0){
			return true;

		}
		else{
			return false;
		}
	}
	public boolean isOdd(){
		if (iValue%2==1){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean isPrime(int a){
		for(int i=2;i<iValue;i++){
			a  = iValue%i;}
			if ( a==0){
				return false;
			}
			else{
				return true;
			}

			}

			
			
		}

