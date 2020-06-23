package Naitive_bayes_multi_input;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.io.FileWriter;  

public class Main {
	static String dataKey = Data.datas.keySet().iterator().next();
	
	public static void main(String[] args) throws Exception{
		DataSet dataSet = new DataSet(Data.datas.get(dataKey));
		System.out.println("[" + dataKey + " DATASET]\n" + dataSet);
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String[][] test = DataTest.CARTEST;
		
		boolean flag = true;
		while(flag) {
			System.out.println("Bạn muốn làm gì (calc probs, change dataset, exit) ?");
			String command = bufferedReader.readLine();
			switch(command) {
				case "calc probs":
					FileWriter myWriter = null;
					try {
						myWriter = new FileWriter("./src\\Result\\result.txt");
						for(int i = 0; i < dataSet.getData()[0].length - 2; i++)
							myWriter.write(dataSet.getData()[0][i] + ", ");	
						myWriter.write("\n");
//						System.out.println(dataSet.getData()[0][dataSet.getData()[0].length - 2]);
					}catch(Exception e) {
						
					}
					for(int j = 1; j < test.length; j++) {	
						myWriter.write("\n");
						String[] values = new String[test[0].length];
						for(int k = 0; k < test[0].length; k++) {
							values[k] = test[j][k];
							System.out.print(values[k] + ", ");
							myWriter.write(values[k] + ", ");
						}
						System.out.println();
						HashMap<String, String> instMap = new HashMap<>();
						
						for(int i = 0; i < dataSet.getData()[0].length - 1; i++)
							instMap.put(dataSet.getData()[0][i], values[i].trim());
						
						//tÃ­nh xÃ¡c xuáº¥t vÃ  in ra cÃ¡ch tÃ­nh cá»§a tá»«ng giÃ¡ trá»‹ thuá»™c tÃ­nh
						HashMap<String, Double> condProbs = dataSet.calcCondProbs(instMap);
						
	//					Iterator<Double> probsIterator = condProbs.values().iterator();
						
						Iterator<String> keyIterator = condProbs.keySet().iterator();
						String result = "";
						double max = -1;
						while(keyIterator.hasNext()) {
							String next = keyIterator.next();
							System.out.println("P" + next + "|" + DataSet.getInstanceStr(dataSet, instMap) + ") = " +
											String.format("%.5f", condProbs.get(next)));
							myWriter.write("\n" + "P" + next + "|" + DataSet.getInstanceStr(dataSet, instMap) + ") = " +
									String.format("%.5f", condProbs.get(next)));
							if(condProbs.get(next) > max) {
								result = next;
								max = condProbs.get(next);
							}
						}
						myWriter.write("\n" + "Phan lop: " + result);
						myWriter.write("\n");
						System.out.println();
					}
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
