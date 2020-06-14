package ID3;

public class FeatureValue {
	private String name;
    private int occurences;
    
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
    
    public boolean equals(Object object){
        if(object == null || (getClass() != object.getClass())) 
        	return false;
        if(name == null) 
        	if (((FeatureValue) object).name != null) return false;
        	else if(!name.equals(((FeatureValue) object).name)) return false;
        return true;
    }
    
    public String toString(){
    	return this.name;
    }
}
