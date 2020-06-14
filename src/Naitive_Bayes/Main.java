package Naitive_Bayes;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;

public class Main {
	static String dataKey = Data.datas.keySet().iterator().next();
	public static void main(String[] args) throws Exception{
		DataSet dataSet = new DataSet(Data.datas.get(dataKey));
		System.out.println("[" + dataKey + " DATASET]\n" + dataSet);
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		boolean flag = true;
		while(flag) {
			System.out.println("Bạn muốn làm gì (calc probs, change dataset, exit) ?");
			String command = bufferedReader.readLine();
			switch(command) {
				case "calc probs":
					System.out.print("Nhập các giá trị để kiểm tra, mỗi giá trị cách nhau một dấu phẩy: ");
					for(int i = 0; i < dataSet.getData()[0].length - 2; i++)
						System.out.print(dataSet.getData()[0][i] + ", ");					
					System.out.println(dataSet.getData()[0][dataSet.getData()[0].length - 2]);
					String[] values = (bufferedReader.readLine()).split(",");
					
					HashMap<String, String> instMap = new HashMap<>();
					
					for(int i = 0; i < dataSet.getData()[0].length - 1; i++)
						instMap.put(dataSet.getData()[0][i], values[i].trim());
					
					//tính xác xuất và in ra cách tính của từng giá trị thuộc tính
					HashMap<String, Double> condProbs = dataSet.calcCondProbs(instMap);
					
					double allProbs = 0;
					
					Iterator<Double> probsIterator = condProbs.values().iterator();
					
					while(probsIterator.hasNext()) allProbs += probsIterator.next();
					
					Iterator<String> keyIterator = condProbs.keySet().iterator();
					
					while(keyIterator.hasNext()) {
						String next = keyIterator.next();
						System.out.println("P" + next + "|" + DataSet.getInstanceStr(dataSet, instMap) + ") = " +
										String.format("%.5f", condProbs.get(next)) + "/" + String.format("%.5f", allProbs) + 
												" = " + String.format("%.5f", condProbs.get(next)/allProbs));
					}
					System.out.println();
					break;
				case "change dataset":
					System.out.println("Chon dataset (" + Data.datas.keySet()+ " ?");
					String value = bufferedReader.readLine();
					if(Data.datas.keySet().contains(value)) {
						dataKey = value;
						dataSet = new DataSet(Data.datas.get(dataKey));
						System.out.println(dataSet);
					}else  System.out.println("Nhap ten dataset");
					break;
				case "exit":
					flag = false;
					break;
			}
		}
		System.exit(0);
	}
}
