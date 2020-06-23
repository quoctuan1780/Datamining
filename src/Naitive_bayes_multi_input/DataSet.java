package Naitive_bayes_multi_input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.IntStream;

public class DataSet {
	private String[][] data = null;
	private Feature classFeature = null;
	private HashMap<String, Double> priorProbs = new HashMap<String, Double>(); //Xác xuất của thuộc tính quyết định
	
	public DataSet(String[][] data) {
		this.data = data;
	}
	
	public String[][] getData() {
		return data;
	}
	
	//�?ịnh dạng dữ liệu và in ra cho đẹp
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		IntStream.range(0, data.length).forEach(row -> {
			IntStream.range(0, data[row].length).forEach(col -> {
				stringBuffer.append(data[row][col]);
				IntStream.range(0, 24 - data[row][col].length()).forEach(i -> stringBuffer.append(" "));
			});
			stringBuffer.append("\n");
			if(row == 0) {
				IntStream.range(0, 108).forEach(i -> stringBuffer.append("-"));
				stringBuffer.append("\n");
			}
		});
		return stringBuffer.toString();
	}
		
	//Trả v�? một chuỗi các bước tính xác xuất (in ra cách tính)
//	private static String getResultStr(DataSet dataSet, HashMap<String, String> instanceMap, HashMap<String, String> logMap, double prob, String featureValue) {
//		StringBuffer resultSB = new StringBuffer(dataSet+"\n");
//		String instanceStr = getInstanceStr(dataSet, instanceMap);
//		resultSB.append("P(" + featureValue + "|" + instanceStr + ") = (P(" + featureValue + ")");
//		IntStream.range(0, dataSet.data[0].length - 1).forEach(i -> resultSB.append("*p(" + instanceMap.get(dataSet.data[0][i]) + "|" + featureValue + ")"));
//		resultSB.append(") / " + "P(" + instanceStr + ")\n");
//		resultSB.append("P(" + featureValue + "|" + instanceStr + ") = " + "((" + logMap.get(featureValue) + ")");
//		IntStream.range(0, dataSet.data[0].length - 1).forEach(i -> resultSB.append("*(" + logMap.get(dataSet.data[0][i]) + ")"));
//		resultSB.append(") / " + "P(" + instanceStr + ")\n");
//		resultSB.append("P(" + featureValue + "|" + instanceStr + ") = " + String.format("%.5f", prob) + " / "+ "P(" + instanceStr + ") \n");
//		return resultSB.toString();
//	}
	
	//Trả v�? chỉ số cột theo tên cột đó
	private int getColNumb(String colName) {
		int returnValue = -1;
		for(int i = 0; i < data[0].length; i++)
			if(data[0][i] == colName) {returnValue = i; break;}
		return returnValue;
	}
	
	//Trả v�? một chuỗi các giá trị mình nhập vào và định dạng lại
	public static String getInstanceStr(DataSet dataSet, HashMap<String, String> instanceMap) {
		StringBuffer instanceSB = new StringBuffer("<");
		IntStream.range(0, dataSet.data[0].length - 2).forEach(i -> instanceSB.append(instanceMap.get(dataSet.data[0][i]) + ", "));
		return (instanceSB.append(instanceMap.get(dataSet.data[0][dataSet.data[0].length - 2]) + ">")).toString();
	}
	
	//Tính xác xuất của thuộc tính quyết định
	private DataSet calcPriorProbs() {
		classFeature = new Feature(data, data[0].length - 1);
		classFeature.getFeatureValues().stream().forEach(featureValue -> 
				priorProbs.put(featureValue.getName(), (double)featureValue.getOccurences() / (data.length - 1)));
		return this;
	}
	
	//Tạo ra một dataset theo tập kết quả
	private DataSet createDataSet(FeatureValue featureValue) {
		String[][] returnData = new String[featureValue.getOccurences() + 1][data[0].length];
		returnData[0] = data[0];
		int count = 1;
		for(int i = 1; i < data.length; i++)
			if(data[i][data[0].length - 1].equals(featureValue.getName())) returnData[count++] = data[i];
		return new DataSet(returnData);
	}
	
	//In ra cách tính của từng giá trị thuộc tính
	public HashMap<String, Double> calcCondProbs(HashMap<String, String> instance){
		calcPriorProbs();
		HashMap<String, Double> condProbs = new HashMap<>();
		classFeature.getFeatureValues().forEach(featureValue -> {
			HashMap<String, String> logMap = new HashMap<>();
			logMap.put(featureValue.getName(), featureValue.getOccurences() + "/" + (data.length - 1));
			DataSet newDataSet = createDataSet(classFeature.getFeatureValue(featureValue.getName()));
			double condProb = calcCondProb(newDataSet, featureValue.getName(), instance, logMap);
			condProbs.put(featureValue.getName(), condProb);
//			System.out.println(getResultStr(newDataSet, instance, logMap, condProb, featureValue.getName()));
		});
		return condProbs;
	}
	
	//Tính xác xuất của từng giá trị thuộc tính 
	private double calcCondProb(DataSet newDataSet, String featureValue, HashMap<String, String> instanceMap, HashMap<String, String> logMap) {
		ArrayList<Feature> features = new ArrayList<Feature>();
		instanceMap.keySet().stream().forEach(featureName -> 
				features.add(new Feature(newDataSet.data, getColNumb(featureName)).calcProb(instanceMap.get(featureName), logMap)));
		double condProb = priorProbs.get(featureValue);
		for(int i = 0; i < features.size(); i++)
			condProb *= features.get(i).getProbability();
		return condProb;
	}
}
