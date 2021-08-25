package com.stacks;

import java.util.Stack;

public class _20_ValidParentheses {

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(')
				stack.push(s.charAt(i));
			else {

				if (stack.isEmpty())
					return false;
				else {
					char ch = (Character) stack.peek();
					if ((s.charAt(i) == '}' && ch == '{') || (s.charAt(i) == ')' && ch == '(') ||( s.charAt(i) == ']' && ch=='['))
						stack.pop();
					else
						return false;
				}
			}
		}
		if(stack.isEmpty())
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		boolean c = _20_ValidParentheses.isValid("{[(){}");
		System.out.println(c);

	}

}
