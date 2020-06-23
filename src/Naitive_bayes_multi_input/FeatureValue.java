package Naitive_bayes_multi_input;


//Giá trị của thuộc tính
public class FeatureValue {
	private String name;
    private int occurences; //Số lần xuất hiện của thuộc tính đó
    
    public FeatureValue(String name){
    	this.name = name;
    }  
    
    public String getName(){
    	return name;
    }
    
    public int getOccurences(){
    	return occurences;
    } 
    
    public void setOccurences(int oc){
    	this.occurences = oc;
    }
    
    public int hashCode(){
    	return name.hashCode();
    }
    
    //Hàm này để so sánh giá trị của thuộc tính có đúng cái mình đang xét hay không
    public boolean equals(Object object){
        boolean check = true;
        if(object == null || (getClass() != object.getClass())) 
        	check = false;
        if(name == null) 
        	if (((FeatureValue) object).name != null) 
        		check = false;
        	else if(!name.equals(((FeatureValue) object).name)) 
        		check = false;
        return check;
    }
    
    public String toString(){
    	return this.name;
    }
}
