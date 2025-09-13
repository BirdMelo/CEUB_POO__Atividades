package exercicios;

import java.util.ArrayList;

public class Main {
	public static ArrayList<Integer> xorAdd(ArrayList<Integer> xorList, ArrayList<Integer> list){
		for(Integer integer: list) {
			if(!xorList.contains(integer)) {
				xorList.add(integer);
			}
		}
		return xorList;
	}
	public static int unicos(ArrayList<Integer> list) {
		ArrayList<Integer> unicos = new ArrayList<Integer>();
		xorAdd(unicos, list);
		return unicos.size();
	}
	public static ArrayList<Integer> exclusivo(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
		ArrayList<Integer> exclusivo = new ArrayList<Integer>();
		xorAdd(exclusivo, nums1);
		xorAdd(exclusivo, nums2);
		
		return exclusivo;
	}
	public static void main(String[] args) {
		
		ArrayList<Integer> nums1 = new ArrayList<Integer>();
		nums1.add(2);
		nums1.add(3);
		nums1.add(5);
		nums1.add(2);
		nums1.add(22);
		nums1.add(90);
		
		ArrayList<Integer> nums2 = new ArrayList<Integer>();
		nums2.add(2);
		nums2.add(6);
		nums2.add(7);
		nums2.add(5);
		nums2.add(24);
		nums2.add(92);
		
		//ATIVIDADE 1
		System.out.printf("tamanho de nums: %d\n", nums1.size());
		System.out.printf("Elemento 2 na lista?\n%b\n", nums1.contains(2));
		System.out.printf("Elemento 55 na lista?\n%b\n", nums1.contains(55));
		
		//ATIVIDADE 2
		System.out.printf("Quantidade de valores unicos em nums: %d\n", unicos(nums1));
		//ATIVIDADE 3
		System.out.println(exclusivo(nums1, nums2));
		
	}
	
}
