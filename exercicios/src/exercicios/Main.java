package exercicios;

import javax.xml.namespace.QName;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
	public static void xorAdd(ArrayList<Integer> xorList, ArrayList<Integer> list){
		for(Integer integer: list) {
			if(!xorList.contains(integer)) {
				xorList.add(integer);
			}
		}
	}
	//ATIVIDADE 2
	public static int unicos(ArrayList<Integer> list) {
		ArrayList<Integer> unicos = new ArrayList<Integer>();
		xorAdd(unicos, list);
		return unicos.size();
	}
	//ATIVIDADE 3
	public static ArrayList<Integer> exclusivo(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
		ArrayList<Integer> exclusivo = new ArrayList<Integer>();
		xorAdd(exclusivo, nums1);
		xorAdd(exclusivo, nums2);
		
		return exclusivo;
	}
	//ATIVIDADE 4
	public static int smallest(ArrayList<Integer> list){
		int smaller = list.get(0);
		for(int num : list) {
			if(num < smaller) {
				smaller = num;
			}
		}
		return smaller;
	}
	//ATIVIDADE 5
	public static int repeatStringInaArray(ArrayList<String> list, String string) {
		int counter = 0;
		for(String str : list) {
			if(str.equals(string)) {
				counter++;
			}
		}
		return counter;
	}
	//ATIVIDADE 6
	public static ArrayList<Integer> removePair (ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 == 0) {
				list.remove(i);
				i--;
			}
		}
		return list;
	}
	//ATIVIDADE 7
	public static void sortByKey(ArrayList<Serie> list, Function<Serie, Comparable> key) {
		list.sort(Comparator.comparing(key));
	}
	//ATIVIDADE 8
	public static ArrayList<String> searchList(ArrayList<String> list, String search) {
        return list.stream()
				.filter(str -> str.contains(search))
				.collect(Collectors.toCollection(ArrayList::new));
	}
	//ATIVIDADE 9
	public static float avg(ArrayList<Integer> nums) {
		int sum = 0;
		for(Integer num : nums) {
			sum += num;
		}
		return (float) sum / nums.size();
	}
	//ATIVIDADE 10
	public static ArrayList<String> reverse(ArrayList<String> str) {
		ArrayList<String> reversed = new ArrayList<>(str);
		Collections.reverse(reversed);
		return reversed;
	}

	public static void main(String[] args) {
		//ARRAYS E CLASSES
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

		ArrayList<String> strList = new ArrayList<String>();
		strList.add("carro");
		strList.add("moto");
		strList.add("fumaça");
		strList.add("fumaça");
		strList.add("odio");
		strList.add("github");

		ArrayList<Serie> series = new ArrayList<Serie>();
		Serie narutoShippuden = new Serie(
				"Naruto Shippuden",
				"15/02/2007",
				21,
				500
		);
		series.add(narutoShippuden);
		Serie wheelofTime = new Serie(
				"Wheel of Time",
				"19/07/2021",
				3,
				24
		);
		series.add(wheelofTime);
		Serie theWitcher = new Serie(
				"The Witcher",
				"20/12/2019",
				4,
				24
		);
		series.add(theWitcher);
		Serie twd = new Serie(
				"The Walking Dead",
				"31/10/2010",
				11,
				177
		);
		series.add(twd);
		Serie onePiece = new Serie(
				"One Pieace",
				"20/10/1999",
				21,
				1200
		);
		series.add(onePiece);

		//ATIVIDADE 1
		System.out.printf("tamanho de nums: %d\n", nums1.size());
		System.out.printf("Elemento 2 na lista?\n%b\n", nums1.contains(2));
		System.out.printf("Elemento 55 na lista?\n%b\n", nums1.contains(55));
		//ATIVIDADE 2 OUTPUT
		System.out.printf("Quantidade de valores unicos em nums: %d\n", unicos(nums1));
		//ATIVIDADE 3 OUTPUT
		System.out.println(exclusivo(nums1, nums2));
		//ATIVIDADE 4 OUTPUT
		System.out.printf("o menor número é: %d\n",smallest(nums1));
		//ATIVIDADE 5 OUTPUT
		System.out.printf("Quantas vezes a palavra %s ocorre: %d\n","fumaça",
				repeatStringInaArray(strList, "fumaça"))
		;
		//ATIVIDADE 6 OUTPUT
		System.out.println(removePair(nums1));
		//ATIVIDADE 7 OUTPUT
		sortByKey(series, Serie::getName);
		for (Serie serie : series) {
			System.out.println("\n==================================================\n");
			System.out.printf("Nome: %s\nLançamento: %s\nQuantidade de Episodios: %d\nQuantidade de Temporadas: %d\n",
					serie.getName(),serie.getDate(),serie.getNumberOfEpisodes(),serie.getNumberOfSeasons()
			);
		}
		//ATIVIDADE 8 OUTPUT
		System.out.println(searchList(strList, "g"));

		//ATIVIDADE 9 OUTPUT
		System.out.print("Lista: ");
		System.out.println(nums1);
		System.out.print("Média: ");
		System.out.println(avg(nums1));
		//ATIVIDADE 10 OUTPUT
		System.out.println(strList);
		System.out.println(reverse(strList));

	}
	
}
