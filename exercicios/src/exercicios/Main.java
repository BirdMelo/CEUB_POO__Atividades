package exercicios;

import java.util.ArrayList;

public class Main {
	//ATIVIDADE 1 E 2
	public static int unicos(ArrayList<Integer> list) {
		ArrayList<Integer> unicos = new ArrayList<Integer>();
		for(int i = 0; i < list.size(); i++) {
			if(!unicos.contains(list.get(i))) {
				unicos.add(list.get(i));
			}
		}
		return unicos.size();
	}
	public static ArrayList<Integer> exclusivo(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
		ArrayList<Integer> exclusivo = new ArrayList<Integer>();
		for (Integer num : nums1) {
			if(!nums2.contains(num)) {
				exclusivo.add(num);
			}
		}
		for (Integer num : nums2) {
			if(!nums1.contains(num)) {
				if(!exclusivo.contains(num)) {
					exclusivo.add(num);
				}
			}
		}
		return exclusivo;
	}
	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(2);
		nums.add(3);
		nums.add(5);
		nums.add(2);
		nums.add(22);
		nums.add(90);
		
		ArrayList<Integer> nums2 = new ArrayList<Integer>();
		nums.add(2);
		nums.add(6);
		nums.add(7);
		nums.add(5);
		nums.add(24);
		nums.add(92);
		
		System.out.printf("tamanho de nums: %d\n", nums.size());
		System.out.printf("Elemento 2 na lista?\n%b\n", nums.contains(2));
		System.out.printf("Elemento 55 na lista?\n%b\n", nums.contains(55));
		
		System.out.printf("Quantidade de valores unicos em nums: %d\n", unicos(nums));
		System.out.println(exclusivo(nums, nums2));
		
	}
	
}
