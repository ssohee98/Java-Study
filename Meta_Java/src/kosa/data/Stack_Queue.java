package kosa.data;

import java.util.LinkedList;
import java.util.Stack;

public class Stack_Queue {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();	//Stack 자료구조
		LinkedList<Integer> q = new LinkedList<Integer>();	//Queue 자료구조
		 
		s.push(1);		//맨 처음이 제일 아래로 위로위로 입력
		s.push(2);
		s.push(3);
		
		q.offer(1);		//맨 처음이 제일 위로 아래로아래로 입력
		q.offer(2);
		q.offer(3);
		
		System.out.println("---Stack---");
		
		while (!s.isEmpty()) {		//stack s가 비어있지 않으면
			System.out.println(s.pop());		//최근것부터 출력		stack 의 pop 최근부터
		}
		
		System.out.println("---Queue---");
		
		while (!q.isEmpty()) {		//Queue q가 비어있지 않으면
			System.out.println(q.poll());		//처음것부터 출력		queue 의 poll 처음부터
		}

	}

}
