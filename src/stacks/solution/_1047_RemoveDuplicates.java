package stacks.solution;

import java.util.Stack;

public class _1047_RemoveDuplicates {

	public String removeDuplicates(String s) {
		Stack<Character> stacks = new Stack<>();
		String res="";
		for(int i=0;i<s.length();i++)
		{
			if(stacks.isEmpty())
			{
				stacks.push(s.charAt(i));
			}
			else
			{
			char ch=stacks.peek();
			if(s.charAt(i)!=ch)
				stacks.push(s.charAt(i));
			if(s.charAt(i)==ch)
				stacks.pop();
			}
		}
		while(!stacks.isEmpty())
		{
			res+=String.valueOf(stacks.pop());
		}
		StringBuffer st=new StringBuffer(res);
		res=String.valueOf(st.reverse());
		return res;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_1047_RemoveDuplicates t=new _1047_RemoveDuplicates();
		String k=t.removeDuplicates("cc");
		System.out.println(k);
	}

}
