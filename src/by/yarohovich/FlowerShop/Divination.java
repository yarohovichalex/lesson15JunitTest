package by.yarohovich.FlowerShop;

import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Divination {
    private static String []valueSetArr = new String[2];
		
	public void choiceOfDivinationOption(Flower flower) {
		Scanner in = new Scanner(System.in);
//		int answer = 0;
		int number = 0;
		
		Map<String, HashSet<String>> map = new HashMap<>();		
//		do {
			map.put("1", Divination.setGenerate("Вы купите авто", "Вы не купите авто, сор"));
			map.put("2", Divination.setGenerate("Вы устроитесь на работу", "Вы не устроитесь на работу"));
			map.put("3", Divination.setGenerate("Любит", "Не любит"));
			System.out.println("На что хотите гадать?\n 1 - на авто "
					+ "\n 2 - на работу \n 3 - на любовь\n Введите нужное число");
			try {				
				number = in.nextInt();
			} catch (InputMismatchException e) {
				System.err.println("Вы ввели не верное число ");
				e.printStackTrace();				
			}	
				
				switch(number) {
				case 1: Divination.toTheCar(flower, map.get("1"));
					System.out.println();
					break;
				case 2: Divination.toWork(flower, map.get("2"));
					System.out.println();
					break;
				case 3: Divination.divinationByLove(flower, map.get("3"));
					System.out.println();
				break;
				default: 
					System.err.println("введено верное число!");
				}					
//			System.out.println("Хотите погодать еще?\nда-1\nнет-любое число");
//			try {
//				answer = in.nextInt();
//			} catch(InputMismatchException e) {
//				System.err.println("Введено неверное число");
//			}
//					
//		}while(answer == 1);
		System.out.println("\nпрограмма окончена");
		in.close();
	}
	
	
        public static void toTheCar(Flower flower, HashSet<String> set) {
        	setSetValueToArr(set);
            settingValuesLeaves(flower, getArrValueByIndex(0), getArrValueByIndex(1));
            int num = flower.getBud().getNumLeaves();
            for(int i = 0; i < num - 1; i++){
                flower.getBud().deleteLeavesById(i+1);
            }
            System.out.println(flower.getBud().getValueLeavesById(num));
	}
	public static void toWork(Flower flower, HashSet<String> set) {
		setSetValueToArr(set);
            settingValuesLeaves(flower, getArrValueByIndex(0), getArrValueByIndex(1));
            int num = flower.getBud().getNumLeaves();
            for(int i = 0; i < num - 1; i++){
                flower.getBud().deleteLeavesById(i+1);
            }
            System.out.println(flower.getBud().getValueLeavesById(num));
	}
	
	public static void divinationByLove(Flower flower, HashSet<String> set) {
		setSetValueToArr(set);
        settingValuesLeaves(flower, getArrValueByIndex(0), getArrValueByIndex(1));
        int num = flower.getBud().getNumLeaves();
        for(int i = 0; i < num - 1; i++){
            flower.getBud().deleteLeavesById(i+1);
        }
        System.out.println(flower.getBud().getValueLeavesById(num));
	}
    public static HashSet<String> setGenerate(String str, String str2) {
        HashSet<String> set = new HashSet<>();	
                set.add(str);
                set.add(str2);
        return set;
    }
    public static int settingValuesLeaves(Flower flower, String string, String string2){
        for (int i = 0; i < flower.getBud().getNumLeaves(); i++) {
            if(i%2 == 0){
                flower.getBud().setValueLeaves(i, string);
            }else{
                flower.getBud().setValueLeaves(i, string2);
        }            
        }            
        return 0;
    }
    public static String[] setSetValueToArr(HashSet<String> set) {
        int i = 0;            
        for(String str: set){
            valueSetArr[i] = str;
            i++;                
        }
        return  valueSetArr;
    }
    public static String getArrValueByIndex(int index){
        return valueSetArr[index];
    }
    public static int generateNumberLeaves(){
        int numberLeaves = 10 + (int)(Math.random()*25);
        return numberLeaves;
    }
}