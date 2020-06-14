package ID3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.stream.IntStream;

public class DataSet {
	private String name;
    private String[][] data = null;
    private double entropy = 0;
    private HashMap<Feature, Double> infoGains = new HashMap<Feature, Double>();
    private Feature splitOnFeature = null;
    
    public String[][] getData() {
    	return data;
    }
    
    public double getEntropy() {
    	return entropy;
    }
    
    public HashMap<Feature, Double> getInfoGains() {
    	return infoGains;
    }
    
    public Feature getSplitOnFeatute() {
    	return splitOnFeature;
    }
    
    public String toString(){
    	return name;
    }
    
    public DataSet(String name, String[][] data) {
        this.name = name;
        this.data = data;
        caculateEntropy();
        caculateInfoGains();
        findSplitOnFeature();
    }
    
    //Tính toán Entropy
    private DataSet caculateEntropy(){
        new Feature(data, data[0].length - 1).getFeatureValues().stream().forEach(featureValue ->
            entropy += minusPlog((double) featureValue.getOccurences() / (data.length - 1)));
        return this;
    }
    
    //Tính toán chỉ số Gains
    private DataSet caculateInfoGains(){
        IntStream.range(0, data[0].length - 1).forEach(column -> {
            Feature feature = new Feature(data, column);
            ArrayList<DataSet> dataSets = new ArrayList<DataSet>();
            feature.getFeatureValues().stream().forEach(featureValue -> 
                dataSets.add(createDataset(feature, featureValue, data)));
            double sum = 0;
            for(int i = 0; i < dataSets.size(); i++)
                sum += ((double)(dataSets.get(i).getData().length - 1) / (data.length - 1)) * dataSets.get(i).getEntropy();
            infoGains.put(feature, entropy - sum);
        });
        return this;
    }
    
    //Tìm thuộc tính để phân nhánh
    private DataSet findSplitOnFeature(){
        Iterator<Feature> iterator = infoGains.keySet().iterator();
        while(iterator.hasNext()){
            Feature feature = iterator.next();
            if(splitOnFeature == null || infoGains.get(splitOnFeature) < infoGains.get(feature)) splitOnFeature = feature;
        }
        return this;
    }
    
    //Tạo một dataset mới đồng thời xóa đi thuộc tính đó
    public DataSet createDataset(Feature feature, FeatureValue featureValue, String data[][]){
        int column = getColNumb(feature.getName());
        String[][] returnData = new String[featureValue.getOccurences() + 1][data[0].length];
        returnData[0] = data[0];
        int count = 1;
        for(int row = 1; row < data.length; row++)
            if(data[row][column] == featureValue.getName()) 
            	returnData[count++] = data[row];
        return new DataSet(feature.getName() + ": " + featureValue.getName(), deleteCol(returnData, column));
    }
    
    //Tính chỉ số minusPlog
    private double minusPlog(double p){
        double returnValue = 0;
        if(p != 0) returnValue = (-1) * p * Math.log(p) / Math.log(2);
        return returnValue;
    }
    
    //Hàm xóa đi mọt cột trong dataset
    private String[][] deleteCol(String[][] data, int toDeleteColumb){
        String returnData[][] = new String[data.length][data[0].length - 1];
        IntStream.range(0, data.length).forEach(row -> {
            int colCount = 0;
            for(int column = 0; column < data[0].length; column++)
                if(column != toDeleteColumb) returnData[row][colCount++] = data[row][column];
        });
        return returnData;
    }
    
    public int getColNumb(String colName){
        int returnValue = -1;
        for(int column = 0; column < data[0].length - 1; column++)
            if(data[0][column] == colName) {
                returnValue = column; 
                break;
            }
        return returnValue;
    }
}
