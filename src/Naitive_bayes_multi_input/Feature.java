package Naitive_bayes_multi_input;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.stream.IntStream;

//Thuộc tính trong bảng
public class Feature {
	private String name = null;
	private String[][] data = null;
    private HashSet<FeatureValue> featureValues = new HashSet<FeatureValue>(); //Các giá trị của thuộc tính này
    private double probability; //Xác xuất của thuộc tính
    
    public double getProbability() {
		return probability;
	}
    
    public String getName() {
		return name;
	}
    
    public HashSet<FeatureValue> getFeatureValues() {
		return featureValues;
	}
    
    public String toString() {
    	return name;
    }
    
    public Feature(String[][] data, int col) {
    	this.name = data[0][col];
    	this.data = data;
    	//IntStream tương tự vòng lặp for, có thể dùng vòng lặp for ở đây cũng được
    	IntStream.range(1, data.length).forEach(row ->{ 
    		featureValues.add(new FeatureValue(data[row][col]));
    	});
    	featureValues.stream().forEach(featureValue -> {
    		int count = 0;
    		for (int row = 1; row < data.length; row++) 
    			if(featureValue.getName() == data[row][col]) {
    				count = count + 1;
    				featureValue.setOccurences(count);
    			}
    				
    	});
    }
    
    //Tìm một giá trị của thuộc tính theo tên
    public FeatureValue getFeatureValue(String featureValueName) {
    	FeatureValue returnValue = null;
    	//Iterator lấy tất cả các phần tử trong mảng featureValue để duyệt
    	Iterator<FeatureValue> iterator = featureValues.iterator();
    	while(iterator.hasNext()) {
    		FeatureValue featureValue = iterator.next();
    		if( featureValue.getName().equals(featureValueName)) { 
    			returnValue = featureValue; 
    			break;
    		}
    	}
    	return returnValue;
    }
    
    //Tính xác xuất của thuộc tính này
    public Feature calcProb(String featureValueName, HashMap<String, String> logMap) {
    	if(getFeatureValue(featureValueName) != null) {
    		probability = (((double)getFeatureValue(featureValueName).getOccurences()) / (data.length - 1));
    		//Tính xác xuất và lưu lại giá trị tính
    		logMap.put(this.name,  getFeatureValue(featureValueName).getOccurences() + "/" + (data.length - 1));
    	}else {
    		probability = 0;
    		logMap.put(this.name, "0/" + (data.length - 1));
    	}
    	return this;
    }
}
