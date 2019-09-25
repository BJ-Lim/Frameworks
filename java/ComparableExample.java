package sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

class Elem implements Comparable<Elem>{
	int elem1;
	int elem2;
	
	public Elem(int elem1, int elem2){
		this.elem1 = elem1;
		this.elem2 = elem2;
	}
	
	/*
	 * 1������ elem1���� ����, 2������ elem2�� ����(1���� ���� ���� ���)
	 * */
	@Override
	public int compareTo(Elem elem){
		if( elem1 > elem.elem1)
			return 1;
		else if ( elem1 == elem.elem1){	
			if( elem2 > elem.elem2)			//elem2�� ��������
				return 1;
		}
		return -1;
	}
	
	@Override
	public String toString(){
		return elem1 + " " + elem2;
	}
}

public class ComparableExample {
	public static void main(String[] args) throws Exception {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Elem> al = new ArrayList<Elem>();
		int N;
		
		N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			al.add(new Elem(Integer.parseInt(str.split(" ")[0]), Integer.parseInt(str.split(" ")[1])));
		}
		
		Collections.sort(al);
		
		for (int i = 0; i < N; i++) {
			System.out.println(al.get(i));
		}
		
		
	}
}
