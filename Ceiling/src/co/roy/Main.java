// Ceiling of a number

package co.roy;

public class Main {
	public static void main(String[] args) {
		int[] arr= {2,3,5,9,14,16,18};
		System.out.println(ceiling(arr,4));
	}
	
	static int ceiling(int[] arr,int target) {

		int mid,start=0,end=arr.length;
		
		
		while(start<=end) {
			
			mid=start+((end-start)/2);
			if(arr[mid]==target)
				return arr[mid];
			else if(arr[mid]<target)
				start=mid+1;
			else
				end=mid-1;
		}
		return arr[start];		
	}
}
