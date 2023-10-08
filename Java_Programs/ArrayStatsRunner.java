public class ArrayStatsRunner
{
	public static void main(String args[])
	{
		int[] one = {3,3,3,3,3,9,4,4,4,5,5,5,5,6,6,7,7,7,9,9,9,8,8,8,8,8,8,8,8};
		ArrayStats test = new ArrayStats();
		test.setArray(one);
		System.out.println("size 1 count == " + test.getNumGroupsOfSize(1));
		System.out.println("size 2 count == " + test.getNumGroupsOfSize(2));
		System.out.println("size 3 count == " + test.getNumGroupsOfSize(3));
		System.out.println("size 4 count == " + test.getNumGroupsOfSize(4));
		System.out.println("size 5 count == " + test.getNumGroupsOfSize(5));
		System.out.println("size 6 count == " + test.getNumGroupsOfSize(6));
		System.out.println("size 7 count == " + test.getNumGroupsOfSize(7));
		System.out.println("size 8 count == " + test.getNumGroupsOfSize(8));
		System.out.println("size 9 count == " + test.getNumGroupsOfSize(9));
	}
}



